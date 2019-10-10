package com.oracle.interfaces.dao;


import java.util.ArrayList;

import com.oracle.entity.User;

/**
 * User用户Dao层接口
 * @author 33102
 *
 */
public interface UserDAOInterface {
	/**
	 * 
	 * @param user 添加员工信息 
	 * @return 添加结果
	 */
	public int addUser(User user);
	/**
	 * 
	 * @param user_id 注销者的id 
	 * @return 注销结果
	 */
	public int deleteUser(String user_id);
	/**
	 * 
	 * @param user 员工被修改的新信息
	 * @return 修改结果
	 */
	public int updateUser(User user);
	/**
	 * 
	 * @return 所有员工信息ArrayList集合
	 */
	public ArrayList<User> findAllUser();
}
