package com.oracle.entity;

/**
 * ���ʱ�(Macerial)
 * 
 * @author 1
 * 
 */
public class Material {
	private int material_id;// ����_id
	private int type_id;// ��������
	private String material_price;// ���ʼ�ֵ
	private String material_introduct;// ���ʼ��
	private int status_id;// ����״̬
	private String material_picture;// ����ͼƬ
	private String material_name;// ��������
	private String material_note;// ���ʱ�ע
	private String material_address;// ���ʵ�ַ

	public Material() {
		super();
	}

	public Material(int material_id, int type_id, String material_price,
			String material_introduct, int status_id, String material_picture,
			String material_name, String material_note, String material_address) {
		super();
		this.material_id = material_id;
		this.type_id = type_id;
		this.material_price = material_price;
		this.material_introduct = material_introduct;
		this.status_id = status_id;
		this.material_picture = material_picture;
		this.material_name = material_name;
		this.material_note = material_note;
		this.material_address = material_address;
	}

	public int getMaterial_id() {
		return material_id;
	}

	public void setMaterial_id(int material_id) {
		this.material_id = material_id;
	}

	public int getType_id() {
		return type_id;
	}

	public void setType_id(int type_id) {
		this.type_id = type_id;
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

	public int getStatus_id() {
		return status_id;
	}

	public void setStatus_id(int status_id) {
		this.status_id = status_id;
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

}
