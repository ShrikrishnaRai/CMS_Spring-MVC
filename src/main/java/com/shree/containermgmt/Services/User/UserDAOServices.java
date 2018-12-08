/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shree.containermgmt.Services.User;

import com.shree.containermgmt.Model.SignUp.SignUpDto;
import com.shree.containermgmt.Model.User.UserDto;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 *
 * @author cri_r
 */
@Component
public interface UserDAOServices {

    List<UserDto> userInfo();

    UserDto loggedUserInfo(String email, String password);
}
