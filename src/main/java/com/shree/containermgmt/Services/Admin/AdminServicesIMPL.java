/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shree.containermgmt.Services.Admin;

import com.shree.containermgmt.DAO.Admin.AdminDaoIMPL;
import com.shree.containermgmt.DAO.Login.LoginDAO;
import com.shree.containermgmt.DAO.User.UserDAO;
import com.shree.containermgmt.Model.Log.LogDto;
import com.shree.containermgmt.Model.User.UserDto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author cri_r
 */
public class AdminServicesIMPL implements AdminServices, UserDAO, LoginDAO {

    @Autowired
    AdminDaoIMPL AdminDaoIMPL;

    public AdminServicesIMPL(AdminDaoIMPL AdminDaoIMPL) {
        this.AdminDaoIMPL = AdminDaoIMPL;
    }

    @Override
    public List<LogDto> getReceiptInfo() {
        return AdminDaoIMPL.getReceiptInfo();
    }

    @Override
    public List<UserDto> userInfo() {
        return AdminDaoIMPL.userInfo();
    }

    @Override
    public UserDto loggedUserInfo(String email, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean checkAvailability(UserDto userDto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean login(String email, String password) {
        if (AdminDaoIMPL.login(email, password)) {
            return true;
        } else {
            return false;
        }
    }

}
