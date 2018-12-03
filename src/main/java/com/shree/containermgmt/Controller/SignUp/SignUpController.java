/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shree.containermgmt.Controller.SignUp;

import com.shree.containermgmt.Model.SignUp.SignUpDto;
import com.shree.containermgmt.Services.SignUp.SignUpDaoServicesIMPL;
import static com.shree.containermgmt.Utils.PageURL.SIGN_UP_PAGE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author cri_r
 */
@Controller
public class SignUpController {

    @Autowired
    private SignUpDaoServicesIMPL signUpDaoServicesIMPL;

    @RequestMapping(value = "/Create/Users", method = RequestMethod.POST)
    public ModelAndView signUp(@ModelAttribute("SignUpDto") SignUpDto signUpDto) {
        signUpDaoServicesIMPL.signUp(signUpDto);
        return new ModelAndView(SIGN_UP_PAGE);
    }
}
