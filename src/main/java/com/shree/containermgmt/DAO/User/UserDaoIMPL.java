/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shree.containermgmt.DAO.User;

import com.shree.containermgmt.Model.SignUp.SignUpDto;
import com.shree.containermgmt.Utils.DbUtil;
import com.shree.containermgmt.Utils.QueryUtil;
import static com.shree.containermgmt.Utils.QueryUtil.SAVE_RECEIPT;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 *
 * @author cri_r
 */
@Component
public class UserDaoIMPL implements UserDAO {

    PreparedStatement ps_Dco;

    @Override
    public List<SignUpDto> userInfo() {
        List<SignUpDto> signUpDtoList = new ArrayList<>();
        SignUpDto signUpDto = new SignUpDto();
        try {
            ps_Dco = DbUtil.getConnection().prepareStatement(QueryUtil.RECEIVER_INFO);
            ResultSet rs_Dco = ps_Dco.executeQuery();
            while (rs_Dco.next()) {
                signUpDto.setId(rs_Dco.getInt("id"));
                signUpDto.setFirstName(rs_Dco.getString("firstName"));
                signUpDto.setLastName(rs_Dco.getString("lastName"));
                signUpDto.setCity(rs_Dco.getString("city"));
                signUpDto.setCountry(rs_Dco.getString("country"));
                signUpDto.setEmail(rs_Dco.getString("email"));
                signUpDto.setState(rs_Dco.getString("state"));
                signUpDto.setPhone(rs_Dco.getString("phone"));
                signUpDtoList.add(signUpDto);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDaoIMPL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserDaoIMPL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return signUpDtoList;
    }

    public List<SignUpDto> userInfo(String email, String password) {
        List<SignUpDto> signUpDtoList = new ArrayList<>();
        SignUpDto signUpDto = new SignUpDto();
        try {
            ps_Dco = DbUtil.getConnection().prepareStatement(QueryUtil.LOGIN);
            ps_Dco.setString(1, email);
            ps_Dco.setString(2, password);
            ResultSet rs_Dco = ps_Dco.executeQuery();
            while (rs_Dco.next()) {
                signUpDto.setId(rs_Dco.getInt("id"));
                signUpDto.setFirstName(rs_Dco.getString("firstName"));
                signUpDto.setLastName(rs_Dco.getString("lastName"));
                signUpDto.setCity(rs_Dco.getString("city"));
                signUpDto.setCountry(rs_Dco.getString("country"));
                signUpDto.setEmail(rs_Dco.getString("email"));
                signUpDto.setState(rs_Dco.getString("state"));
                signUpDto.setPhone(rs_Dco.getString("phone"));
                signUpDtoList.add(signUpDto);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDaoIMPL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserDaoIMPL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return signUpDtoList;
    }

    @Override
    public void saveReceipt(SignUpDto signUpDto,String email,String password) {
        List<SignUpDto> signUpDtoList = new ArrayList<>();
        signUpDtoList = userInfo("email", "password");
        try {
            ps_Dco = DbUtil.getConnection().prepareStatement(QueryUtil.SAVE_RECEIPT);
            ps_Dco.setString(1, signUpDto.getFirstName());
            ps_Dco.setString(2, signUpDto.getLastName());
            ps_Dco.setString(3, signUpDto.getEmail());
            ps_Dco.setString(4, signUpDto.getPhone());
            for (int i = 1; i <= signUpDtoList.size(); i++) {
                ps_Dco.setString(5, signUpDtoList.get(i).getFirstName());
                ps_Dco.setString(6, signUpDtoList.get(i).getLastName());
                ps_Dco.setString(7, signUpDtoList.get(i).getEmail());
                ps_Dco.setString(8, signUpDtoList.get(i).getPhone());
                ps_Dco.setString(9, signUpDtoList.get(i).getGoods());
            }
            ps_Dco.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UserDaoIMPL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserDaoIMPL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
