/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shree.containermgmt.Controller.Index;

import static com.shree.containermgmt.Utils.PageURL.LOGIN_PAGE;
import static com.shree.containermgmt.Utils.PageURL.SIGN_UP_PAGE;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author cri_r
 */
@Controller
public class IndexController {

    @RequestMapping(value = "/index")
    public ModelAndView index() {
        return new ModelAndView(LOGIN_PAGE);
    }

    @RequestMapping(value = "/signUpPage")
    public ModelAndView signUp() {
        return new ModelAndView(SIGN_UP_PAGE);
    }
    
}
