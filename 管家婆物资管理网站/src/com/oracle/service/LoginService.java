package com.oracle.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.oracle.dao.LoginDao;
import com.oracle.entity.User;
import com.oracle.interfaces.service.LoginServiceInterface;

public class LoginService implements LoginServiceInterface {
/**
 * µ«¬ºService≤„
 * @throws SQLException 
 */
	public  User LoginService(User user) throws SQLException {
	LoginDao ld = new LoginDao();
	  User us = ld.LoginDao(user);
	return us;
	
		
	}
/**
 * ∫À∂‘–≈œ¢Service≤„
 * @throws SQLException 
 */
	public User ForgetService(User user) throws SQLException {
		LoginDao ld = new LoginDao();
		  return ld.ForgetDao(user);
/**
 * 	…Ë÷√√‹¬ÎService≤„	
 */
	}
public int ForgetsService(User user, String user_id) throws SQLException {
	LoginDao ld = new LoginDao();
	return ld.ForgetsDao(user,user_id);
	
}

}
