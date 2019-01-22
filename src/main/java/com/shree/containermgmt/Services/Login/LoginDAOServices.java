/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shree.containermgmt.Services.Login;

import com.shree.containermgmt.Model.LoggedInfo.LoggedInfo;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 *
 * @author cri_r
 */
@Component
public interface LoginDAOServices {

    List<LoggedInfo> login(String email, String password);
}
