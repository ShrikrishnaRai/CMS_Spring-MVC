/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shree.containermgmt.Services.User;

import com.shree.containermgmt.Model.LoggedInfo.LoggedInfo;
import com.shree.containermgmt.Model.SignUp.SignUpDto;
import com.shree.containermgmt.Model.User.UserDto;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ModelAttribute;

/**
 *
 * @author cri_r
 */
@Component
public interface UserDAOServices {

	// retrieves receiver info
	List<UserDto> userInfo();

	List<LoggedInfo> loggedUserInfo(String email, String password);

	boolean checkAvailability(String email);

	// checks logged users info on shipment
	List<LoggedInfo> checkMine(String email);
}
