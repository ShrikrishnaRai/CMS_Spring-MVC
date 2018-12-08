/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shree.containermgmt.DAO.Receipt;

import com.shree.containermgmt.Model.Receipt.ReceiptDto;
import com.shree.containermgmt.Model.User.UserDto;

/**
 *
 * @author cri_r
 */
public interface ReceiptDAO {

    void saveReceipt(UserDto userDto, ReceiptDto receiptDto);
}
