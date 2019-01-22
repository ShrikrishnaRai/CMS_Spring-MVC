/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shree.containermgmt.Controller.Admin;

import com.shree.containermgmt.Model.User.UserDto;
import com.shree.containermgmt.Services.Admin.AdminServicesIMPL;
import com.shree.containermgmt.Services.User.UserDaoServicesIMPL;
import static com.shree.containermgmt.Utils.PageURL.ADMIN_DASH_PAGE;
import static com.shree.containermgmt.Utils.PageURL.ADMIN_PAGE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author cri_r
 */
@Controller
public class AdminController {

    @Autowired
    AdminServicesIMPL AdminServicesIMPL;

    @Autowired
    UserDaoServicesIMPL userDaoServicesIMPL;

    @RequestMapping(value = "/admin")
    public String adminHome() {
        return ADMIN_PAGE;
    }

    @RequestMapping(value = "/loginAdmin", method = RequestMethod.POST)
    public String loginAdmin(@ModelAttribute("UserDto") UserDto userDto, Model model) {
        if (AdminServicesIMPL.loginAdmin(userDto.getEmail(), userDto.getPassword())) {
        	model.addAttribute("user", userDaoServicesIMPL.userInfo());
        	model.addAttribute("transaction",AdminServicesIMPL.getTransactionList());
        	return ADMIN_DASH_PAGE;
        } else {
            model.addAttribute("message", "Admin Verification Failed");

            return ADMIN_PAGE;
        }
    }
}
