package com.oracle.entity;

/**
 * 物资状态表(Status)
 * 
 * @author 1
 * 
 */
public class Status {
	private int status_id;// 状态ID
	private String material_status;// 物质状态

	public Status() {
		super();
	}

	public Status(int status_id, String material_status) {
		super();
		this.status_id = status_id;
		this.material_status = material_status;
	}

	public int getStatus_id() {
		return status_id;
	}

	public void setStatus_id(int status_id) {
		this.status_id = status_id;
	}

	public String getMaterial_status() {
		return material_status;
	}

	public void setMaterial_status(String material_status) {
		this.material_status = material_status;
	}

}
