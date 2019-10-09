package com.oracle.entity;

/**
 * ��Ϣ��(Message)
 * 
 * @author 1
 * 
 */
public class Message {
	private int message_id;// ��Ϣ id
	private String message_send;// ��Ϣ���ͷ�
	private String message_time;// ����Ϣʱ��
	private String message_aecept;// ��Ϣ���շ�
	private String message_content;// ��Ϣ����
	private String message_status;// ��Ϣ״̬

	public Message() {
		super();
	}

	public Message(int message_id, String message_send, String message_time,
			String message_aecept, String message_content, String message_status) {
		super();
		this.message_id = message_id;
		this.message_send = message_send;
		this.message_time = message_time;
		this.message_aecept = message_aecept;
		this.message_content = message_content;
		this.message_status = message_status;
	}

	public int getMessage_id() {
		return message_id;
	}

	public void setMessage_id(int message_id) {
		this.message_id = message_id;
	}

	public String getMessage_send() {
		return message_send;
	}

	public void setMessage_send(String message_send) {
		this.message_send = message_send;
	}

	public String getMessage_time() {
		return message_time;
	}

	public void setMessage_time(String message_time) {
		this.message_time = message_time;
	}

	public String getMessage_aecept() {
		return message_aecept;
	}

	public void setMessage_aecept(String message_aecept) {
		this.message_aecept = message_aecept;
	}

	public String getMessage_content() {
		return message_content;
	}

	public void setMessage_content(String message_content) {
		this.message_content = message_content;
	}

	public String getMessage_status() {
		return message_status;
	}

	public void setMessage_status(String message_status) {
		this.message_status = message_status;
	}

}
