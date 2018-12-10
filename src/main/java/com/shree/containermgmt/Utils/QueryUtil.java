/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shree.containermgmt.Utils;

/**
 *
 * @author cri_r
 */
public class QueryUtil {

    public static final String SIGN_UP = "insert into users(firstName,lastName,email,phone,country,state,city,role,password) values (?,?,?,?,?,?,?,?)";
    public static final String LOGIN = "select * from users where email=? and password=?";
    public static final String LOGIN_ADMIN = "select * from admin where email=? and password=?";
    public static final String RECEIVER_INFO = "select * from users where role= 'Receiver'";
    public static final String SAVE_RECEIPT = "insert into receipt(receiverFirstName,receiverLastName,receiverEmail,receiverPhone,senderFirstName,senderLastName,senderEmail,senderPhone,goods,receiverCity,receiverState,receiverCountry) values(?,?,?,?,?,?,?,?,?,?,?,?)";
    public static final String USER_INFO = "select * from users";
    public static final String CHECK_AVAILABILITY = "select * from users where role='Receiver', firstName=? , lastName=?,email=?,phone=?,city=?,state=?,country=?";
    public static final String RECEIPT = "select * from receipt";
}
