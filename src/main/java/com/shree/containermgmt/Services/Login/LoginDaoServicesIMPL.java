/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shree.containermgmt.Services.Login;

import com.shree.containermgmt.DAO.Login.LoginDaoIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author cri_r
 */
@Component
public class LoginDaoServicesIMPL implements LoginDAOServices {

    @Autowired
    LoginDaoIMPL loginDaoIMPL;

    public LoginDaoServicesIMPL(LoginDaoIMPL loginDaoIMPL) {
        this.loginDaoIMPL = loginDaoIMPL;
    }

    @Override
    public boolean login(String email, String password) {
        if (loginDaoIMPL.login(email, password)) {
            return true;
        } else {
            return false;
        }
    }

}
