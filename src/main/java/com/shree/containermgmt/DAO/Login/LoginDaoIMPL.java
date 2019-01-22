/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shree.containermgmt.DAO.Login;

import com.shree.containermgmt.Model.LoggedInfo.LoggedInfo;
import com.shree.containermgmt.Utils.DbUtil;
import com.shree.containermgmt.Utils.QueryUtil;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.stereotype.Component;

/**
 *
 * @author cri_r
 */
@Component
public class LoginDaoIMPL implements LoginDAO {

    PreparedStatement ps_dco;

    @Override
    public List<LoggedInfo> login(String email, String password) {
        LoggedInfo userDto = new LoggedInfo();
        List<LoggedInfo> userDtoList = new ArrayList<>();
        try {
            ps_dco = DbUtil.getConnection().prepareStatement(QueryUtil.LOGIN);
            ps_dco.setString(1, email);
            ps_dco.setString(2, password);
            ResultSet rs_Dco = ps_dco.executeQuery();
            while (rs_Dco.next()) {
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
            Logger.getLogger(LoginDaoIMPL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoginDaoIMPL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return userDtoList;
    }

}
