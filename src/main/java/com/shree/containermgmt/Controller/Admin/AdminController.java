/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shree.containermgmt.Controller.Admin;

import static com.shree.containermgmt.Utils.PageURL.HOME_PAGE;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author cri_r
 */
@Controller
public class AdminController {

    @RequestMapping(value = "/admin")
    public String adminHome() {
        return HOME_PAGE;
    }
}
