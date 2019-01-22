/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shree.containermgmt.DAO.Receipt;

import com.shree.containermgmt.Model.LoggedInfo.LoggedInfo;
import com.shree.containermgmt.Model.Receipt.ReceiptDto;
import com.shree.containermgmt.Model.Transaction.TransactionDto;
import com.shree.containermgmt.Model.User.UserDto;
import com.shree.containermgmt.Utils.DbUtil;
import com.shree.containermgmt.Utils.QueryUtil;
import static com.shree.containermgmt.Utils.QueryUtil.SIGN_UP;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author cri_r
 */
public class ReceiptDaoIMPL implements ReceiptDAO {

    PreparedStatement ps_Dco;

    JdbcTemplate jdbcTemplate_dco;

    public void setJdbcTemplate_dco(JdbcTemplate jdbcTemplate_dco) {
        this.jdbcTemplate_dco = jdbcTemplate_dco;
    }

    //userDto for sender
    //receiptDto for receiver
    @Override
    public void saveReceipt(List<LoggedInfo> loggedInfo, ReceiptDto receiptDto) {
        LoggedInfo userDto=new LoggedInfo();
        
    	for(int i=0;i<loggedInfo.size();i++) {
        	userDto.setFirstName(loggedInfo.get(i).getFirstName());
        	userDto.setLastName(loggedInfo.get(i).getLastName());
        	userDto.setEmail(loggedInfo.get(i).getEmail());
        	userDto.setPhone(loggedInfo.get(i).getPhone());
    	}
    	try {
			ps_Dco=DbUtil.getConnection().prepareStatement(QueryUtil.SAVE_RECEIPT);
			ps_Dco.setString(1, receiptDto.getReceiverFirstname());
			ps_Dco.setString(2, receiptDto.getReceiverLastname());
			ps_Dco.setString(3, receiptDto.getReceiverPhone());
			ps_Dco.setString(4, userDto.getFirstName());
			ps_Dco.setString(5, userDto.getLastName());
			ps_Dco.setString(6, userDto.getEmail());
			ps_Dco.setString(7, userDto.getPhone());
			ps_Dco.setString(8, receiptDto.getGoods());
			ps_Dco.setString(9, receiptDto.getReceiverCity());
			ps_Dco.setString(10, receiptDto.getReceiverState());
			ps_Dco.setString(11,receiptDto.getReceiverCountry());
			ps_Dco.executeUpdate();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

	@Override
	public List<TransactionDto> getTransactionList() {
		List<TransactionDto> receiptDtoList=new ArrayList<>();
		TransactionDto transactionDto=new TransactionDto();
		try {
			ps_Dco=DbUtil.getConnection().prepareStatement(QueryUtil.RECEIPT_INFO);
			ResultSet rs_Dco=ps_Dco.executeQuery();
			while(rs_Dco.next()) {
				transactionDto.setReceiverFirstName(rs_Dco.getString("receiverFirstName"));
				transactionDto.setReceiverFirstName(rs_Dco.getString("receiverLastName"));
				transactionDto.setReceiverPhone(rs_Dco.getString("receiverPhone"));
				transactionDto.setSenderFirstName(rs_Dco.getString("senderFirstName"));
				transactionDto.setSenderLastName(rs_Dco.getString("senderLastName"));
				transactionDto.setSenderEmail(rs_Dco.getString("senderEmail"));
				transactionDto.setSenderPhone(rs_Dco.getString("senderPhone"));
				transactionDto.setGoods(rs_Dco.getString("goods"));
				transactionDto.setReceiverCity(rs_Dco.getString("receiverCity"));
				transactionDto.setReceiverState(rs_Dco.getString("receiverState"));
				transactionDto.setReceiverCountry(rs_Dco.getString("receiverCountry"));
				receiptDtoList.add(transactionDto);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return receiptDtoList;
	}

}
