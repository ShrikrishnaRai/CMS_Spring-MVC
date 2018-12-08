/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shree.containermgmt.Services.User;

import com.shree.containermgmt.DAO.User.UserDAO;
import com.shree.containermgmt.DAO.User.UserDaoIMPL;
import com.shree.containermgmt.Model.SignUp.SignUpDto;
import com.shree.containermgmt.Model.User.UserDto;
import java.util.ArrayList;
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

    public UserDaoServicesIMPL(UserDaoIMPL userDaoIMPL) {
        this.UserDaoIMPL = userDaoIMPL;
    }

    @Override
    public List<UserDto> userInfo() {
        return UserDaoIMPL.userInfo();
    }

    @Override
    public UserDto loggedUserInfo(String email, String password) {
        return UserDaoIMPL.loggedUserInfo(email, password);
    }

}
