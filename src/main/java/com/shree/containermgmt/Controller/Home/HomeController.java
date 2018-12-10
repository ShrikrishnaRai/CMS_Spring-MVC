/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shree.containermgmt.Controller.Home;

import com.shree.containermgmt.Model.Receipt.ReceiptDto;
import com.shree.containermgmt.Model.SignUp.SignUpDto;
import com.shree.containermgmt.Model.User.UserDto;
import com.shree.containermgmt.Services.Login.LoginDaoServicesIMPL;
import com.shree.containermgmt.Services.Receipt.ReceiptServicesIMPL;
import com.shree.containermgmt.Services.User.UserDaoServicesIMPL;
import static com.shree.containermgmt.Utils.PageURL.HOME_PAGE;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
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
public class HomeController {

    @Autowired
    LoginDaoServicesIMPL loginDaoServicesIMPL;

    @Autowired
    UserDaoServicesIMPL userDaoServicesIMPL;

    @Autowired
    ReceiptServicesIMPL receiptServicesIMPL;

    @RequestMapping(value = "/saveReceipt", method = RequestMethod.POST)
    public String saveReceipt(@ModelAttribute("ReceiptDto") ReceiptDto receiptDto, HttpServletRequest req, HttpServletResponse resp, Model model) {
        HttpSession session = req.getSession(true);
        System.out.println(session.getAttribute("email").toString());
        receiptServicesIMPL.saveReceipt(userDaoServicesIMPL.loggedUserInfo(session.getAttribute("email").toString(), session.getAttribute("password").toString()), receiptDto);
        System.out.println(userDaoServicesIMPL.loggedUserInfo(session.getAttribute("email").toString(), session.getAttribute("password").toString()).getFirstName());
        model.addAttribute("user", userDaoServicesIMPL.userInfo());
        model.addAttribute("message", "Information Saved");
        return HOME_PAGE;
    }

    @RequestMapping(value = "/checkAvailability")
    public boolean checkAvailability(@ModelAttribute("UserDto") UserDto userDto) {
        if (userDaoServicesIMPL.checkAvailability(userDto)) {
            return true;
        } else {
            return false;
        }
    }
}
