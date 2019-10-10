package com.oracle.interfaces.dao;
/**
 * Message信息Dao层接口
 */
import java.util.ArrayList;

import com.oracle.entity.Message;

public interface MessageDAOInterface {
	/**
	 * 
	 * @param message 新增的留言信息
	 * @return 返回新增留言结果
	 */
	public int addMessage(Message message);
	/**
	 * 
	 * @param message 查看所有留言
	 * @return 保留留言的ArrayList集合
	 */
	public ArrayList<Message> findAllMessage(Message message) ;
	/**
	 * 
	 * @param user_id 发送者id
	 * @return 发送者发送的信息
	 */
	public ArrayList<Message> findMessageBySender(String user_id);
	/**
	 * 
	 * @param user_id 接受者id
	 * @return 接收者接收的信息
	 */
	public ArrayList<Message> findMessageByAccepter(String user_id);
}
