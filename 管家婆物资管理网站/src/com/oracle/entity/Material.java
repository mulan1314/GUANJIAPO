package com.oracle.entity;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;

/**
 * 物资表(Macerial)
 * 
 * @author 1
 * 
 */
public class Material {
	private int material_id;// 物资_id
	private Type type;// 物资类型
	private String material_price;// 物资价值
	private String material_introduct;// 物资简介
	private Status status;// 物资状态
	private String material_picture;// 物资图片
	private String material_name;// 物资名字
	private String material_note;// 物资备注
	private String material_address;// 物资地址
	//添加物资 的构造函数
	public Material(String material_name, String material_introduct, String material_price,
			String material_picture, String type_id, String material_address) {
		
		this.material_name = material_name;	
		this.material_introduct = material_introduct;
		this.material_price = material_price;
		this.material_picture = material_picture;
		this.type=new Type(type_id);
		this.material_address = material_address;
		this.status	=new Status(2);	
	}

	public int getMaterial_id() {
		return material_id;
	}

	public void setMaterial_id(int material_id) {
		this.material_id = material_id;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public String getMaterial_price() {
		return material_price;
	}

	public void setMaterial_price(String material_price) {
		this.material_price = material_price;
	}

	public String getMaterial_introduct() {
		return material_introduct;
	}

	public void setMaterial_introduct(String material_introduct) {
		this.material_introduct = material_introduct;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getMaterial_picture() {
		return material_picture;
	}

	public void setMaterial_picture(String material_picture) {
		this.material_picture = material_picture;
	}

	public String getMaterial_name() {
		return material_name;
	}

	public void setMaterial_name(String material_name) {
		this.material_name = material_name;
	}

	public String getMaterial_note() {
		return material_note;
	}

	public void setMaterial_note(String material_note) {
		this.material_note = material_note;
	}

	public String getMaterial_address() {
		return material_address;
	}

	public void setMaterial_address(String material_address) {
		this.material_address = material_address;
	}

	public Material() {
		super();
	}

	public Material(int material_id, Type type, String material_price,
			String material_introduct, Status status, String material_picture,
			String material_name, String material_note, String material_address) {
		super();
		this.material_id = material_id;
		this.type = type;
		this.material_price = material_price;
		this.material_introduct = material_introduct;
		this.status = status;
		this.material_picture = material_picture;
		this.material_name = material_name;
		this.material_note = material_note;
		this.material_address = material_address;
	}




	@Override
	public String toString() {
		return "Material [material_id=" + material_id + ", type=" + type
				+ ", material_price=" + material_price
				+ ", material_introduct=" + material_introduct + ", status="
				+ status + ", material_picture=" + material_picture
				+ ", material_name=" + material_name + ", material_note="
				+ material_note + ", material_address=" + material_address
				+ "]";
	}



	
	




}
