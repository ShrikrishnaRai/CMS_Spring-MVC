/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shree.containermgmt.Services.Receipt;

import com.shree.containermgmt.DAO.Receipt.ReceiptDaoIMPL;
import com.shree.containermgmt.Model.LoggedInfo.LoggedInfo;
import com.shree.containermgmt.Model.Receipt.ReceiptDto;
import com.shree.containermgmt.Model.Transaction.TransactionDto;
import com.shree.containermgmt.Model.User.UserDto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;

/**
 *
 * @author cri_r
 */
public class ReceiptServicesIMPL implements ReceiptServices {

    @Autowired
    ReceiptDaoIMPL ReceiptDaoIMPL;

    public ReceiptServicesIMPL(ReceiptDaoIMPL ReceiptDaoIMPL) {
        this.ReceiptDaoIMPL = ReceiptDaoIMPL;
    }

	@Override
	public void saveReceipt(List<LoggedInfo> loggedInfo, ReceiptDto receiptDto) {
		ReceiptDaoIMPL.saveReceipt(loggedInfo, receiptDto);
	}

	@Override
	public List<TransactionDto> getTransactionList() {
		return ReceiptDaoIMPL.getTransactionList();
	}



}
