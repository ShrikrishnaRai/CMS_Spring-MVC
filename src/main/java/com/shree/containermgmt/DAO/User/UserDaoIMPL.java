/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shree.containermgmt.DAO.User;

import com.shree.containermgmt.Model.LoggedInfo.LoggedInfo;
import com.shree.containermgmt.Model.Receipt.ReceiptDto;
import com.shree.containermgmt.Model.SignUp.SignUpDto;
import com.shree.containermgmt.Model.User.UserDto;
import com.shree.containermgmt.Utils.DbUtil;
import com.shree.containermgmt.Utils.QueryUtil;
import static com.shree.containermgmt.Utils.QueryUtil.SAVE_RECEIPT;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 *
 * @author cri_r
 */
@Component
public class UserDaoIMPL implements UserDAO {

	PreparedStatement ps_Dco;
	SignUpDto signUpDto = new SignUpDto();
	UserDto userDto = new UserDto();

	// retrieves information of receiver users from
	@Override
	public List<UserDto> userInfo() {
		List<UserDto> userDtoList = new ArrayList<>();
		try {
			ps_Dco = DbUtil.getConnection().prepareStatement(QueryUtil.RECEIVER_INFO);
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

	// retrieves loggedIn userInfo
	@Override
	public List<LoggedInfo> loggedUserInfo(String email, String password) {
		List<LoggedInfo> userDtoList = new ArrayList<>();
		try {
			ps_Dco = DbUtil.getConnection().prepareStatement(QueryUtil.LOGGED_INF);
			ps_Dco.setString(1, email);
			ps_Dco.setString(2, password);
			ResultSet rs_Dco = ps_Dco.executeQuery();
			while (rs_Dco.next()) {
				LoggedInfo userDto = new LoggedInfo();
				userDto.setId(rs_Dco.getInt("id"));
				userDto.setFirstName(rs_Dco.getString("firstName"));
				userDto.setLastName(rs_Dco.getString("lastName"));
				userDto.setEmail(rs_Dco.getString("email"));
				userDto.setPhone(rs_Dco.getString("phone"));
				userDto.setCity(rs_Dco.getString("city"));
				userDto.setCountry(rs_Dco.getString("country"));
				userDto.setState(rs_Dco.getString("state"));
			}
		} catch (SQLException ex) {
			Logger.getLogger(UserDaoIMPL.class.getName()).log(Level.SEVERE, null, ex);
		} catch (ClassNotFoundException ex) {
			Logger.getLogger(UserDaoIMPL.class.getName()).log(Level.SEVERE, null, ex);
		}
		return userDtoList;
	}

	// Check receiver is available
	@Override
	public boolean checkAvailability(String email) {
		try {
			ps_Dco = DbUtil.getConnection().prepareStatement(QueryUtil.CHECK_AVAILABILITY);
			ps_Dco.setString(1, email);
			ResultSet rs_Dco = ps_Dco.executeQuery();
			if (rs_Dco.next()) {
				return true;
			} else {
				return false;
			}
		} catch (SQLException ex) {
			Logger.getLogger(UserDaoIMPL.class.getName()).log(Level.SEVERE, null, ex);
		} catch (ClassNotFoundException ex) {
			Logger.getLogger(UserDaoIMPL.class.getName()).log(Level.SEVERE, null, ex);
		}
		return false;
	}

	@Override
	public List<LoggedInfo> checkedMine(String email) {
		LoggedInfo loggedDto = new LoggedInfo();
		List<LoggedInfo> receiptList = new ArrayList<>();
		try {
			ps_Dco = DbUtil.getConnection().prepareStatement(QueryUtil.CHECK_MINE);
			ps_Dco.setString(1, email);
			ResultSet rs_Dco = ps_Dco.executeQuery();
			while (rs_Dco.next()) {
				loggedDto.setFirstName("firstName");
				loggedDto.setLastName("lastName");
				loggedDto.setEmail("email");
				loggedDto.setPhone("phone");
				loggedDto.setCountry("country");
				loggedDto.setState("state");
				loggedDto.setCity("city");
				loggedDto.setRole("role");
				receiptList.add(loggedDto);
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return receiptList;
	}

	@Override
	public List<ReceiptDto> checkedSending(String email) {
		ReceiptDto receiptDto = new ReceiptDto();
		List<ReceiptDto> receiptDtoList = new ArrayList<>();
		try {
			ps_Dco = DbUtil.getConnection().prepareStatement(QueryUtil.CHECK_MINE_SENT);
			ResultSet rs_Dco = ps_Dco.executeQuery();
			while (rs_Dco.next()) {
				receiptDto.setId(rs_Dco.getInt("id"));
				receiptDto.setReceiverEmail(rs_Dco.getString("receiverEmail"));
				receiptDto.setReceiverPhone(rs_Dco.getString("receiverPhone"));
				receiptDto.setReceiverFirstname(rs_Dco.getString("receiverFirstname"));
				receiptDto.setReceiverLastname(rs_Dco.getString("receiverLastname"));
				receiptDto.setReceiverCity(rs_Dco.getString("receiverCity"));
				receiptDto.setReceiverCountry(rs_Dco.getString("receiverCountry"));
				receiptDto.setReceiverState(rs_Dco.getString("receiverState"));
				receiptDto.setGoods(rs_Dco.getString("goods"));
				receiptDtoList.add(receiptDto);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return receiptDtoList;
	}
}
