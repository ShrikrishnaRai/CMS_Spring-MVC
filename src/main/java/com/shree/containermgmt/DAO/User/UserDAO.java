package com.shree.containermgmt.DAO.User;

import com.shree.containermgmt.Model.SignUp.SignUpDto;
import java.util.List;
import org.springframework.stereotype.Component;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author cri_r
 */
@Component
public interface UserDAO {

    List<SignUpDto> userInfo();

    void saveReceipt(SignUpDto signUpDto,String email,String password);
}
