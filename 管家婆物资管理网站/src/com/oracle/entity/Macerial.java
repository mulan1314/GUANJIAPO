package com.oracle.entity;
/**
 * ���ʱ�(Macerial)
 * @author 1
 *
 */
public class Macerial {
	private int macerial_id;// ����_id
	private int maceria_type;// ��������
	private String macerial_price;// ���ʼ�ֵ
	private String macerial_introduct;// ���ʼ��
	private int macerial_status;// ����״̬
	private String macerial_picture;// ����ͼƬ
	private String macerial_name;// ��������
	private String macerial_note;// ���ʱ�ע
	private String macerial_address;// ���ʵ�ַ

	public Macerial() {
		super();
	}

	public Macerial(int macerial_id, int maceria_type, String macerial_price,
			String macerial_introduct, int macerial_status,
			String macerial_picture, String macerial_name,
			String macerial_note, String macerial_address) {
		super();
		this.macerial_id = macerial_id;
		this.maceria_type = maceria_type;
		this.macerial_price = macerial_price;
		this.macerial_introduct = macerial_introduct;
		this.macerial_status = macerial_status;
		this.macerial_picture = macerial_picture;
		this.macerial_name = macerial_name;
		this.macerial_note = macerial_note;
		this.macerial_address = macerial_address;
	}

	public int getMacerial_id() {
		return macerial_id;
	}

	public void setMacerial_id(int macerial_id) {
		this.macerial_id = macerial_id;
	}

	public int getMaceria_type() {
		return maceria_type;
	}

	public void setMaceria_type(int maceria_type) {
		this.maceria_type = maceria_type;
	}

	public String getMacerial_price() {
		return macerial_price;
	}

	public void setMacerial_price(String macerial_price) {
		this.macerial_price = macerial_price;
	}

	public String getMacerial_introduct() {
		return macerial_introduct;
	}

	public void setMacerial_introduct(String macerial_introduct) {
		this.macerial_introduct = macerial_introduct;
	}

	public int getMacerial_status() {
		return macerial_status;
	}

	public void setMacerial_status(int macerial_status) {
		this.macerial_status = macerial_status;
	}

	public String getMacerial_picture() {
		return macerial_picture;
	}

	public void setMacerial_picture(String macerial_picture) {
		this.macerial_picture = macerial_picture;
	}

	public String getMacerial_name() {
		return macerial_name;
	}

	public void setMacerial_name(String macerial_name) {
		this.macerial_name = macerial_name;
	}

	public String getMacerial_note() {
		return macerial_note;
	}

	public void setMacerial_note(String macerial_note) {
		this.macerial_note = macerial_note;
	}

	public String getMacerial_address() {
		return macerial_address;
	}

	public void setMacerial_address(String macerial_address) {
		this.macerial_address = macerial_address;
	}

}
