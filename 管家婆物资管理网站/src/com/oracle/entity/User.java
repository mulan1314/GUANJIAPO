package com.oracle.entity;

/**
 * �û���(User)
 * 
 * @author 1
 * 
 */
public class User {
	private String user_id;// �û� id
	private String user_password;// �û�����
	private String user_phone;// �û��ֻ���
	private String user_email;// �û�����

	public User() {
		super();
	}

	public User(String user_id, String user_password, String user_phone,
			String user_email) {
		super();
		this.user_id = user_id;
		this.user_password = user_password;
		this.user_phone = user_phone;
		this.user_email = user_email;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	public String getUser_phone() {
		return user_phone;
	}

	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

}
