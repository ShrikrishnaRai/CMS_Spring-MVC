/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shree.containermgmt.Services.SignUp;

import com.shree.containermgmt.DAO.SignUp.SignUpDAO;
import com.shree.containermgmt.DAO.SignUp.SignUpDaoIMPL;
import com.shree.containermgmt.Model.SignUp.SignUpDto;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author cri_r
 */
public class SignUpDaoServicesIMPL implements SignUpDAOServices {

    SignUpDAO signUpDao = new SignUpDaoIMPL();
    private JdbcTemplate jdbcTemplate_dco;

    public void setJdbcTemplate_dco(JdbcTemplate jdbcTemplate_dco) {
        jdbcTemplate_dco = this.jdbcTemplate_dco;
    }

    @Override
    public void signUp(SignUpDto signUpDto) {
        signUpDao.signUp(signUpDto);
    }

}
