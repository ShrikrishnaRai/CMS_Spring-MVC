/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shree.containermgmt.Services.Admin;

import com.shree.containermgmt.Model.Log.LogDto;
import com.shree.containermgmt.Model.User.UserDto;

import java.util.List;

/**
 *
 * @author cri_r
 */
public interface AdminServices {

	List<LogDto> getReceiptInfo();

	boolean loginAdmin(String email, String password);

	// Get userInfo from search
	List<UserDto> getSearchInfo(String email);

}
