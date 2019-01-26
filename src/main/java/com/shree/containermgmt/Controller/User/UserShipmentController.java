package com.shree.containermgmt.Controller.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.shree.containermgmt.Controller.Login.LoginController;
import com.shree.containermgmt.Services.User.UserDaoServicesIMPL;
import com.shree.containermgmt.Utils.PageURL;

@Controller
public class UserShipmentController {

	@Autowired
	UserDaoServicesIMPL userDaoServicesIMPL;

	@RequestMapping(value = "/myShipment")
	public String myShipmentRequest(Model model) {
		if (userDaoServicesIMPL.checkMine(LoginController.username).size() > 0) {
			model.addAttribute("user", userDaoServicesIMPL.checkMine(LoginController.username));
			return PageURL.MY_SHIPMENT_REQUEST_PAGE;
		} else if (userDaoServicesIMPL.checkedSending(LoginController.username).size() > 0) {
			userDaoServicesIMPL.checkedSending(LoginController.username);
			return PageURL.MY_SHIPMENT_REQUEST_PAGE;
		} else {
			model.addAttribute("message", "You don't have any receiving Request");
			model.addAttribute("sentmessage", "You don't have any sent Request");
			return PageURL.MY_SHIPMENT_REQUEST_PAGE;
		}
	}

}
