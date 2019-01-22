/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shree.containermgmt.DAO.SignUp;

import com.shree.containermgmt.Model.SignUp.SignUpDto;
import com.shree.containermgmt.Utils.DbUtil;
import com.shree.containermgmt.Utils.QueryUtil;

import static com.shree.containermgmt.Utils.QueryUtil.SIGN_UP;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 *
 * @author cri_r
 */
@Component
public class SignUpDaoIMPL implements SignUpDAO {
	PreparedStatement ps_Dco;



    @Override
    public void signUp(SignUpDto signUpDto) {
    	try {
			ps_Dco=DbUtil.getConnection().prepareStatement(QueryUtil.SIGN_UP);
			ps_Dco.setString(1, signUpDto.getFirstName());
			ps_Dco.setString(2, signUpDto.getLastName());
			ps_Dco.setString(3, signUpDto.getEmail());
			ps_Dco.setString(4, signUpDto.getPhone());
			ps_Dco.setString(5, signUpDto.getCountry());
			ps_Dco.setString(6, signUpDto.getState());
			ps_Dco.setString(7, signUpDto.getCity());
			ps_Dco.setString(8, signUpDto.getRole());
			ps_Dco.setString(9, signUpDto.getPassword());
			ps_Dco.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

}
