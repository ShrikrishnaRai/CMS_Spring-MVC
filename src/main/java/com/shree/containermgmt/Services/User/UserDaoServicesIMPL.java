/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shree.containermgmt.Services.User;

import com.shree.containermgmt.DAO.User.UserDAO;
import com.shree.containermgmt.DAO.User.UserDaoIMPL;
import com.shree.containermgmt.Model.SignUp.SignUpDto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author cri_r
 */
@Component
public class UserDaoServicesIMPL implements UserDAOServices {

    @Autowired
    UserDaoIMPL UserDaoIMPL;

    public UserDaoServicesIMPL(UserDaoIMPL UserDaoIMPL) {
        this.UserDaoIMPL = UserDaoIMPL;
    }

    @Override
    public List<SignUpDto> userInfo() {
        return UserDaoIMPL.userInfo();
    }

    public List<SignUpDto> userInfo(String email, String password) {
        return UserDaoIMPL.userInfo(email, password);
    }

    @Override
    public void saveReceipt(SignUpDto signUpDto,String email,String password) {
        UserDaoIMPL.saveReceipt(signUpDto,email,password);
    }

}
