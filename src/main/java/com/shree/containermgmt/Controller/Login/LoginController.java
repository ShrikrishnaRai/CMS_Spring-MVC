/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shree.containermgmt.Controller.Login;

import com.shree.containermgmt.Model.Login.LoginDto;
import com.shree.containermgmt.Model.SignUp.SignUpDto;
import com.shree.containermgmt.Services.Login.LoginDaoServicesIMPL;
import com.shree.containermgmt.Services.User.UserDaoServicesIMPL;
import static com.shree.containermgmt.Utils.PageURL.HOME_PAGE;
import static com.shree.containermgmt.Utils.PageURL.LOGIN_PAGE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author cri_r
 */
@Controller
public class LoginController {

    @Autowired
    LoginDaoServicesIMPL loginDaoServicesIMPL;
    @Autowired
    UserDaoServicesIMPL userDaoServicesIMPL;
    String username;
    String password;

    @RequestMapping(value = "/loginUser", method = RequestMethod.POST)
    public String loginUser(@ModelAttribute("LoginDto") LoginDto loginDto, Model model) {
        if (loginDaoServicesIMPL.login(loginDto.getEmail(), loginDto.getPassword())) {
            username = loginDto.getEmail();
            password = loginDto.getPassword();
            model.addAttribute("user", userDaoServicesIMPL.userInfo());
            return HOME_PAGE;
        } else {
            model.addAttribute("message", "User Verification Failed");
            return LOGIN_PAGE;
        }
    }

    @RequestMapping(value = "/saveReceipt", method = RequestMethod.POST)
    public String saveReceipt(@ModelAttribute("SignUpDto") SignUpDto signUpDto, Model model) {
        userDaoServicesIMPL.saveReceipt(signUpDto, username, password);
        return HOME_PAGE;
    }

}
