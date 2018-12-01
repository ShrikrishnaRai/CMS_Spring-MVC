/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shree.containermgmt.DAO.SignUp;

import com.shree.containermgmt.Model.SignUp.SignUpDto;
import static com.shree.containermgmt.Utils.QueryUtil.SIGN_UP;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author cri_r
 */
public class SignUpDaoIMPL implements SignUpDAO {

    JdbcTemplate jdbcTemplate_dco;

    public void setTemplate_dco(JdbcTemplate jdbcTemplate_dco) {
        this.jdbcTemplate_dco = jdbcTemplate_dco;
    }

    @Override
    public void signUp(SignUpDto signUpDto) {
        jdbcTemplate_dco.update(SIGN_UP, new Object[]{signUpDto.getFirstName(),
            signUpDto.getLastName(),
            signUpDto.getEmail(),
            signUpDto.getPhone(),
            signUpDto.getCountry(),
            signUpDto.getState(),
            signUpDto.getCity(),
            signUpDto.getRole(),
            signUpDto.getPassword()
        });
    }

}
