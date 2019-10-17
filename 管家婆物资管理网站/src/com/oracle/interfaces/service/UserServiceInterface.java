package com.oracle.interfaces.service;

import java.util.ArrayList;

import com.oracle.entity.User;

public interface UserServiceInterface {
	/**
	 * µÇÂ¼
	 * @return
	 */
      public ArrayList<User> Login();
	/**
	 * Íü¼ÇÃÜÂë
	 * @return 
	 */
	  public int LoginSelect();
	
}
