package com.shree.containermgmt.Services.Receipt;

import com.shree.containermgmt.Model.LoggedInfo.LoggedInfo;
import com.shree.containermgmt.Model.Receipt.ReceiptDto;
import com.shree.containermgmt.Model.Transaction.TransactionDto;
import com.shree.containermgmt.Model.User.UserDto;
import java.util.List;
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
public interface ReceiptServices {

    void saveReceipt(List<LoggedInfo> loggedInfo, ReceiptDto receiptDto);
    List<TransactionDto> getTransactionList();
}
