/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shree.containermgmt.DAO.Admin;

import com.shree.containermgmt.DAO.Login.LoginDAO;
import com.shree.containermgmt.DAO.Login.LoginDaoIMPL;
import com.shree.containermgmt.DAO.User.UserDAO;
import com.shree.containermgmt.DAO.User.UserDaoIMPL;
import com.shree.containermgmt.Model.Log.LogDto;
import com.shree.containermgmt.Model.Receipt.ReceiptDto;
import com.shree.containermgmt.Model.User.UserDto;
import com.shree.containermgmt.Utils.DbUtil;
import com.shree.containermgmt.Utils.QueryUtil;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cri_r
 */
public class AdminDaoIMPL implements AdminDao, UserDAO, LoginDAO {

    PreparedStatement ps_Dco;

    @Override
    public List<UserDto> userInfo() {
        List<UserDto> userDtoList = new ArrayList<>();
        try {
            ps_Dco = DbUtil.getConnection().prepareStatement(QueryUtil.USER_INFO);
            ResultSet rs_Dco = ps_Dco.executeQuery();
            while (rs_Dco.next()) {
                UserDto userDto = new UserDto();
                userDto.setId(rs_Dco.getInt("id"));
                userDto.setFirstName(rs_Dco.getString("firstName"));
                userDto.setLastName(rs_Dco.getString("lastName"));
                userDto.setEmail(rs_Dco.getString("email"));
                userDto.setPhone(rs_Dco.getString("phone"));
                userDto.setCity(rs_Dco.getString("city"));
                userDto.setCountry(rs_Dco.getString("country"));
                userDto.setState(rs_Dco.getString("state"));
                userDtoList.add(userDto);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDaoIMPL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserDaoIMPL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return userDtoList;
    }

    @Override
    public UserDto loggedUserInfo(String email, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<LogDto> getReceiptInfo() {
        List<LogDto> logDtoList = new ArrayList<>();
        try {
            ps_Dco = DbUtil.getConnection().prepareStatement(QueryUtil.RECEIVER_INFO);
            ResultSet rs_Dco = ps_Dco.executeQuery();
            while (rs_Dco.next()) {
                LogDto logDto = new LogDto();
                logDto.setId(rs_Dco.getInt("id"));
                logDto.setReceiverFirstName(rs_Dco.getString("receiverFirstName"));
                logDto.setReceiverLastName(rs_Dco.getString("receiverLastName"));
                logDto.setReceiverCity(rs_Dco.getString("receiverCity"));
                logDto.setReceiverCountry(rs_Dco.getString("receiverCountry"));
                logDto.setReceiverEmail(rs_Dco.getString("receiverEmail"));
                logDto.setReceiverPhone(rs_Dco.getString("receiverPhone"));
                logDto.setSenderFirstName(rs_Dco.getString("senderFirstName"));
                logDto.setSenderLastName(rs_Dco.getString("senderLastName"));
                logDto.setSenderEmail(rs_Dco.getString("senderEmail"));
                logDto.setSenderPhone(rs_Dco.getString("senderPhone"));
                logDto.setGoods(rs_Dco.getString("goods"));
                logDto.setReceiverState(rs_Dco.getString("receiverState"));
                logDtoList.add(logDto);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDaoIMPL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserDaoIMPL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return logDtoList;
    }

    @Override
    public boolean checkAvailability(UserDto userDto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean login(String email, String password) {
        try {
            ps_Dco = DbUtil.getConnection().prepareStatement(QueryUtil.LOGIN_ADMIN);
            ps_Dco.setString(1, email);
            ps_Dco.setString(2, password);
            ResultSet rs_dco = ps_Dco.executeQuery();
            if (rs_dco.next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginDaoIMPL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoginDaoIMPL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

}
