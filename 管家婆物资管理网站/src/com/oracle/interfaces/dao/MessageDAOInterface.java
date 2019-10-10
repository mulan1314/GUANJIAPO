package com.oracle.interfaces.dao;
/**
 * Message��ϢDao��ӿ�
 */
import java.util.ArrayList;

import com.oracle.entity.Message;

public interface MessageDAOInterface {
	/**
	 * 
	 * @param message ������������Ϣ
	 * @return �����������Խ��
	 */
	public int addMessage(Message message);
	/**
	 * 
	 * @param message �鿴��������
	 * @return �������Ե�ArrayList����
	 */
	public ArrayList<Message> findAllMessage(Message message) ;
	/**
	 * 
	 * @param user_id ������id
	 * @return �����߷��͵���Ϣ
	 */
	public ArrayList<Message> findMessageBySender(String user_id);
	/**
	 * 
	 * @param user_id ������id
	 * @return �����߽��յ���Ϣ
	 */
	public ArrayList<Message> findMessageByAccepter(String user_id);
}
