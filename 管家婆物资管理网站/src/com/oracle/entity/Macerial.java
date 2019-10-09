package com.oracle.entity;
/**
 * 物资表(Macerial)
 * @author 1
 *
 */
public class Macerial {
	private int macerial_id;// 物资_id
	private int maceria_type;// 物资类型
	private String macerial_price;// 物资价值
	private String macerial_introduct;// 物资简介
	private int macerial_status;// 物资状态
	private String macerial_picture;// 物资图片
	private String macerial_name;// 物资名字
	private String macerial_note;// 物资备注
	private String macerial_address;// 物资地址

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
