/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shree.containermgmt.Services.Admin;

import com.shree.containermgmt.DAO.Admin.AdminDaoIMPL;
import com.shree.containermgmt.DAO.Login.LoginDAO;
import com.shree.containermgmt.DAO.Receipt.ReceiptDAO;
import com.shree.containermgmt.DAO.Receipt.ReceiptDaoIMPL;
import com.shree.containermgmt.DAO.User.UserDAO;
import com.shree.containermgmt.Model.Log.LogDto;
import com.shree.containermgmt.Model.LoggedInfo.LoggedInfo;
import com.shree.containermgmt.Model.Receipt.ReceiptDto;
import com.shree.containermgmt.Model.Transaction.TransactionDto;
import com.shree.containermgmt.Model.User.UserDto;
import com.shree.containermgmt.Services.Receipt.ReceiptServicesIMPL;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author cri_r
 */
public class AdminServicesIMPL implements AdminServices, UserDAO, LoginDAO, ReceiptDAO {

	@Autowired
	AdminDaoIMPL AdminDaoIMPL;

	ReceiptDAO receiptDaoIMPL = new ReceiptDaoIMPL();

	public AdminServicesIMPL(AdminDaoIMPL AdminDaoIMPL) {
		this.AdminDaoIMPL = AdminDaoIMPL;
	}

	@Override
	public List<LogDto> getReceiptInfo() {
		return AdminDaoIMPL.getReceiptInfo();
	}

	// Checks receiver availability with receiver email
	@Override
	public boolean checkAvailability(String email) {
		if (AdminDaoIMPL.checkAvailability(email)) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public List<UserDto> userInfo() {
		throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
																		// Tools | Templates.
	}

	@Override
	public List<LoggedInfo> loggedUserInfo(String email, String password) {
		throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
																		// Tools | Templates.
	}

	@Override
	public List<LoggedInfo> login(String email, String password) {
		throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
																		// Tools | Templates.
	}

	@Override
	public boolean loginAdmin(String email, String password) {
		if (AdminDaoIMPL.adminLogin(email, password)) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void saveReceipt(List<LoggedInfo> loggedInfo, ReceiptDto receiptDto) {
		// TODO Auto-generated method stub

	}
//
//	@Override
//	public List<TransactionDto> getTransactionList() {
//		return receiptServicesIMPL.getTransactionList();
//	}

	@Override
	public List<TransactionDto> getTransactionList() {
		// TODO Auto-generated method stub
		return receiptDaoIMPL.getTransactionList();
	}

	@Override
	public List<LoggedInfo> checkedMine(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserDto> getSearchInfo(String email) {
		return AdminDaoIMPL.getSearchInfo(email);
	}

	@Override
	public List<ReceiptDto> checkedSending(String email) {
		// TODO Auto-generated method stub
		return null;
	}

}
