/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shree.containermgmt.DAO.Receipt;

import com.shree.containermgmt.Model.Receipt.ReceiptDto;
import com.shree.containermgmt.Model.User.UserDto;
import com.shree.containermgmt.Utils.DbUtil;
import com.shree.containermgmt.Utils.QueryUtil;
import static com.shree.containermgmt.Utils.QueryUtil.SIGN_UP;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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

    @Override
    public void saveReceipt(UserDto userDto, ReceiptDto receiptDto) {
        jdbcTemplate_dco.update(QueryUtil.SAVE_RECEIPT, new Object[]{
            receiptDto.getReceiverFirstname(),
            receiptDto.getReceiverLastname(),
            receiptDto.getReceiverEmail(),
            receiptDto.getReceiverPhone(),
            userDto.getFirstName(),
            userDto.getLastName(),
            userDto.getEmail(),
            userDto.getPhone(),
            receiptDto.getGoods(),
            receiptDto.getReceiverCity(),
            receiptDto.getReceiverState(),
            receiptDto.getReceiverCountry()
        });
    }

}
