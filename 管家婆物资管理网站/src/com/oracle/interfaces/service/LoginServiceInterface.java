package com.oracle.interfaces.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.oracle.entity.User;

public interface LoginServiceInterface {
	/**
	 * ��¼
	 * @return
	 * @throws SQLException 
	 */
      public User LoginService(User user) throws SQLException;
	/**
	 * ��֤��Ϣ
	 * @return 
	 * @throws SQLException 
	 */
      public User ForgetService(User user) throws SQLException;
      /**
       * ����������
       * @return 
	   * @throws SQLException 
       */
      public int ForgetsService(User user,String user_id) throws SQLException;
}

