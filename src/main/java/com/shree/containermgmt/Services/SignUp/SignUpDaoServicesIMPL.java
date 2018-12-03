/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shree.containermgmt.Services.SignUp;

import com.shree.containermgmt.DAO.SignUp.SignUpDAO;
import com.shree.containermgmt.DAO.SignUp.SignUpDaoIMPL;
import com.shree.containermgmt.Model.SignUp.SignUpDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 *
 * @author cri_r
 */
@Component
public class SignUpDaoServicesIMPL implements SignUpDAOServices {

    @Autowired
    SignUpDaoIMPL SignUpDaoIMPL;

    public SignUpDaoServicesIMPL(SignUpDaoIMPL SignUpDaoIMPL) {
        this.SignUpDaoIMPL = SignUpDaoIMPL;
    }

    @Override
    public void signUp(SignUpDto signUpDto) {
        SignUpDaoIMPL.signUp(signUpDto);
    }

}
