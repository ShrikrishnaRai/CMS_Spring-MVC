package com.shree.containermgmt.DAO.User;

import com.shree.containermgmt.Model.LoggedInfo.LoggedInfo;
import com.shree.containermgmt.Model.Receipt.ReceiptDto;
import com.shree.containermgmt.Model.SignUp.SignUpDto;
import com.shree.containermgmt.Model.User.UserDto;
import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ModelAttribute;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author cri_r
 */
@Component
public interface UserDAO {

    //receiver Receiver User Info
    List<UserDto> userInfo();

    List<LoggedInfo> loggedUserInfo(String email, String password);

    boolean checkAvailability(@ModelAttribute("UserDto") UserDto userDto);
    
    List<ReceiptDto> checkedMine(String email);
}
