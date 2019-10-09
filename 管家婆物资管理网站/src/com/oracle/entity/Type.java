package com.oracle.entity;

/**
 * 物资类型表(Type)
 * 
 * @author 1
 * 
 */
public class Type {
	private int type_id;// 类型ID
	private String material_type;// 物资类型

	public Type() {
		super();
	}

	public Type(int type_id, String material_type) {
		super();
		this.type_id = type_id;
		this.material_type = material_type;
	}

	public int getType_id() {
		return type_id;
	}

	public void setType_id(int type_id) {
		this.type_id = type_id;
	}

	public String getMaterial_type() {
		return material_type;
	}

	public void setMaterial_type(String material_type) {
		this.material_type = material_type;
	}

}
