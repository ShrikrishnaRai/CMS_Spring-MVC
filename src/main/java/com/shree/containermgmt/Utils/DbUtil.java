/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shree.containermgmt.Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cri_r
 */
public class DbUtil {
	//String url ="jdbc:mysql://containermanagement.mysql.database.azure.com:3306/{your_database}?useSSL=true&requireSSL=false"; 
//	myDbConn = DriverManager.getConnection(url, "cri@containermanagement", {your_password});
	
    //Another connection for jdbc on Dispatcher servlet
    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
//        Properties properties = new Properties();
//        properties.setProperty("useJDBCCompliantTimezoneShift", "true");
//        properties.setProperty("user", "cri@containermanagement");
//        properties.setProperty("password", "Linux_ubuntu");
//        properties.setProperty("useSSL", "true");
//        properties.setProperty("verifyServerCertificate", "true");
//        properties.setProperty("requireSSL", "false");
        //useLegacyDatetimeCode=false&  ;serverTimeZone=Asia/Kathmandu
        String url =String .format("jdbc:mysql://containermanagement.mysql.database.azure.com:3306/cms?useSSL=true&requireSSL=false");
        return DriverManager.getConnection(url,"cri@containermanagement","Linux_ubuntu");
    }
}
