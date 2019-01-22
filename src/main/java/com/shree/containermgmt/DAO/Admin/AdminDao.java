/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shree.containermgmt.DAO.Admin;

import com.shree.containermgmt.Model.Log.LogDto;
import java.util.List;

/**
 *
 * @author cri_r
 */
public interface AdminDao {
	
	boolean adminLogin(String email,String password);
    List<LogDto> getReceiptInfo();
}
