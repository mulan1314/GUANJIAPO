package com.oracle.interfaces.service;

import java.util.ArrayList;

import com.oracle.entity.User;

public interface UserServiceInterface {
	/**
	 * ��¼
	 * @return
	 */
      public ArrayList<User> Login();
	/**
	 * ��������
	 * @return 
	 */
	  public int LoginSelect();
	
}
