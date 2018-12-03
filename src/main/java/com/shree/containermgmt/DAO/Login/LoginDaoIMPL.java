/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shree.containermgmt.DAO.Login;

import com.shree.containermgmt.Utils.DbUtil;
import com.shree.containermgmt.Utils.QueryUtil;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
    public boolean login(String email, String password) {
        try {
            ps_dco = DbUtil.getConnection().prepareStatement(QueryUtil.LOGIN);
            ps_dco.setString(1, email);
            ps_dco.setString(2, password);
            ResultSet rs_dco = ps_dco.executeQuery();
            if (rs_dco.next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginDaoIMPL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoginDaoIMPL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

}
