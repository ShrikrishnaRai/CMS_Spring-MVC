/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shree.containermgmt.Controller.Login;

import static com.shree.containermgmt.Utils.PageURL.SIGN_UP_PAGE;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author cri_r
 */
@Controller
public class LoginController {

    @RequestMapping(value = "/")
    public String signUp() {
        return SIGN_UP_PAGE;
    }
    
    @RequestMapping(value="/signUp")
    public String signUUp(){
        return SIGN_UP_PAGE;
    }
}
