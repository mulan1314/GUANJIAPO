package com.oracle.interfaces.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.oracle.entity.User;

public interface LoginServiceInterface {
	/**
	 * 登录
	 * @return
	 * @throws SQLException 
	 */
      public User LoginService(User user) throws SQLException;
	/**
	 * 验证信息
	 * @return 
	 * @throws SQLException 
	 */
      public User ForgetService(User user) throws SQLException;
      /**
       * 设置新密码
       * @return 
	   * @throws SQLException 
       */
      public int ForgetsService(User user,String user_id) throws SQLException;
}

