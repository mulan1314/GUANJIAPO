package com.oracle.entity;

/**
 * 物资类型表(Type)
 * 
 * @author 1
 * 
 */
public class Type {
	private int type_id;// 类型ID
	private String macerial_type;// 物资类型

	public Type() {
		super();
	}

	public Type(int type_id, String macerial_type) {
		super();
		this.type_id = type_id;
		this.macerial_type = macerial_type;
	}

	public int getType_id() {
		return type_id;
	}

	public void setType_id(int type_id) {
		this.type_id = type_id;
	}

	public String getMacerial_type() {
		return macerial_type;
	}

	public void setMacerial_type(String macerial_type) {
		this.macerial_type = macerial_type;
	}

}
