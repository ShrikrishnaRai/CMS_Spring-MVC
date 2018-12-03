/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shree.containermgmt.DAO.Login;

import org.springframework.stereotype.Component;

/**
 *
 * @author cri_r
 */
@Component
public interface LoginDAO {

    boolean login(String email, String password);
}
