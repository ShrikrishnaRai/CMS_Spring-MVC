/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shree.containermgmt.Controller.Login;

import com.shree.containermgmt.DAO.User.UserDaoIMPL;
import com.shree.containermgmt.Model.Login.LoginDto;
import com.shree.containermgmt.Model.SignUp.SignUpDto;
import com.shree.containermgmt.Model.User.UserDto;
import com.shree.containermgmt.Services.Login.LoginDaoServicesIMPL;
import com.shree.containermgmt.Services.Receipt.ReceiptServicesIMPL;
import com.shree.containermgmt.Services.User.UserDaoServicesIMPL;
import static com.shree.containermgmt.Utils.PageURL.HOME_PAGE;
import static com.shree.containermgmt.Utils.PageURL.LOGIN_PAGE;
import com.sun.media.jfxmedia.logging.Logger;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import sun.rmi.runtime.Log;
import java.util.logging.Level;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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

    @Autowired
    ReceiptServicesIMPL receiptServicesIMPL;

    String username;
    String password;

    public static HttpSession session;

    @RequestMapping(value = "/loginUser", method = RequestMethod.POST)
    public String loginUser(@ModelAttribute("LoginDto") LoginDto loginDto, Model model, HttpSession session) {
        if (loginDaoServicesIMPL.login(loginDto.getEmail(), loginDto.getPassword())) {
            session.setAttribute("email", loginDto.getEmail());
            session.setAttribute("password", loginDto.getPassword());
            model.addAttribute("user", userDaoServicesIMPL.userInfo());
            return HOME_PAGE;
        } else {
            model.addAttribute("message", "User Verification Failed");
            return LOGIN_PAGE;
        }
    }

}
