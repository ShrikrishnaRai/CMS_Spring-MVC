/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shree.containermgmt.DAO.User;

import com.shree.containermgmt.Model.SignUp.SignUpDto;
import com.shree.containermgmt.Model.User.UserDto;
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
    SignUpDto signUpDto = new SignUpDto();
    UserDto userDto = new UserDto();

    @Override
    public List<UserDto> userInfo() {
        List<UserDto> userDtoList = new ArrayList<>();
        try {
            ps_Dco = DbUtil.getConnection().prepareStatement(QueryUtil.RECEIVER_INFO);
            ResultSet rs_Dco = ps_Dco.executeQuery();
            while (rs_Dco.next()) {
                UserDto userDto = new UserDto();
                userDto.setId(rs_Dco.getInt("id"));
                userDto.setFirstName(rs_Dco.getString("firstName"));
                userDto.setLastName(rs_Dco.getString("lastName"));
                userDto.setEmail(rs_Dco.getString("email"));
                userDto.setPhone(rs_Dco.getString("phone"));
                userDto.setCity(rs_Dco.getString("city"));
                userDto.setCountry(rs_Dco.getString("country"));
                userDto.setState(rs_Dco.getString("state"));
                userDtoList.add(userDto);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDaoIMPL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserDaoIMPL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return userDtoList;
    }

    @Override
    public UserDto loggedUserInfo(String email, String password) {
        try {
            ps_Dco = DbUtil.getConnection().prepareStatement(QueryUtil.LOGIN);
            ps_Dco.setString(1, email);
            ps_Dco.setString(2, password);
            ResultSet rs_Dco = ps_Dco.executeQuery();
            while (rs_Dco.next()) {
                UserDto userDto = new UserDto();
                userDto.setId(rs_Dco.getInt("id"));
                userDto.setFirstName(rs_Dco.getString("firstName"));
                System.out.println("DAO::"+rs_Dco.getString("firstName"));
                userDto.setLastName(rs_Dco.getString("lastName"));
                userDto.setEmail(rs_Dco.getString("email"));
                userDto.setPhone(rs_Dco.getString("phone"));
                userDto.setCity(rs_Dco.getString("city"));
                userDto.setCountry(rs_Dco.getString("country"));
                userDto.setState(rs_Dco.getString("state"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDaoIMPL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserDaoIMPL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return userDto;
    }
}
