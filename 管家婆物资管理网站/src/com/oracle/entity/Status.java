package com.oracle.entity;

/**
 * 物资状态表(Status)
 * 
 * @author 1
 * 
 */
public class Status {
	private int status_id;// 状态ID
	private String macerial_status;// 物质状态

	public Status() {
		super();
	}

	public Status(int status_id, String macerial_status) {
		super();
		this.status_id = status_id;
		this.macerial_status = macerial_status;
	}

	public int getStatus_id() {
		return status_id;
	}

	public void setStatus_id(int status_id) {
		this.status_id = status_id;
	}

	public String getMacerial_status() {
		return macerial_status;
	}

	public void setMacerial_status(String macerial_status) {
		this.macerial_status = macerial_status;
	}

}
