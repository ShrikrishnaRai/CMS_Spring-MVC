/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shree.containermgmt.DAO.SignUp;

import com.shree.containermgmt.Model.SignUp.SignUpDto;
import org.springframework.stereotype.Component;

/**
 *
 * @author cri_r
 */
@Component
public interface SignUpDAO {

   void signUp(SignUpDto signUpDto);
}
