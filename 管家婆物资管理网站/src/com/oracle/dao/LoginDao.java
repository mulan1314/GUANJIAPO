package com.oracle.dao;

import java.sql.SQLException;


import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;


import com.oracle.dbutils.DataSourceUtil;
import com.oracle.entity.User;


public class LoginDao{
/**
 * µ«¬ºDao≤„
 * @throws SQLException 
 */
	public User LoginDao(User user) throws SQLException {
		QueryRunner qr = new QueryRunner(DataSourceUtil.getDataSource());
		    String sql="Select * from user where user_id=? and user_password=?";
		     return qr.query(sql, new BeanHandler<User>(User.class), user.getUser_id(),user.getUser_password());
	
	}
/**
 * ∫À∂‘–≈œ¢Dao≤„
 * @throws SQLException 
 */
	public User ForgetDao(User user) throws SQLException {
		
		QueryRunner qr = new QueryRunner(DataSourceUtil.getDataSource());
		String sql="Select * from user where user_id=? and user_name=? and user_phone=?";
		  return qr.query(sql, new BeanHandler<User>(User.class), user.getUser_id(),user.getUser_name(),user.getUser_phone());
		
	}
/**
 * …Ë÷√√‹¬Î
 * @param password 
 * @throws SQLException 
 */
	public int ForgetsDao(User user, String user_id) throws SQLException {
	
		QueryRunner qr = new QueryRunner(DataSourceUtil.getDataSource());
		String sql="UPDATE USER SET user_password = ? WHERE user_id =?";
		int update = qr.update(sql, user.getUser_password(),user_id);
		return update;
	    
		
		
	}
}
