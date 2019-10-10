package com.oracle.interfaces.dao;


import java.util.ArrayList;

import com.oracle.entity.User;

/**
 * User�û�Dao��ӿ�
 * @author 33102
 *
 */
public interface UserDAOInterface {
	/**
	 * 
	 * @param user ���Ա����Ϣ 
	 * @return ��ӽ��
	 */
	public int addUser(User user);
	/**
	 * 
	 * @param user_id ע���ߵ�id 
	 * @return ע�����
	 */
	public int deleteUser(String user_id);
	/**
	 * 
	 * @param user Ա�����޸ĵ�����Ϣ
	 * @return �޸Ľ��
	 */
	public int updateUser(User user);
	/**
	 * 
	 * @return ����Ա����ϢArrayList����
	 */
	public ArrayList<User> findAllUser();
}
