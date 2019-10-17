package com.oracle.entity;

/**
 * 记录表(Record)
 * 
 * @author 1
 * 
 */
public class Record {

	private int record_id;//记录id
	private int material_id;// 物资 id
	private String user_id;// 用户 id
	private String loan_time;// 借出时间
	private String return_time;// 归还时间
	private String record_reason;// 借出理由

	public Record() {
		super();
	}

	public Record(String user_id, String loan_time, String record_reason, int material_id) {
		this.user_id = user_id;
		this.loan_time = loan_time;
		this.record_reason = record_reason;
		this.material_id = material_id;
	}

	public Record(int record_id, int material_id, String user_id,
			String loan_time, String return_time, String record_reason) {
		super();
		this.record_id = record_id;
		this.material_id = material_id;
		this.user_id = user_id;
		this.loan_time = loan_time;
		this.return_time = return_time;
		this.record_reason = record_reason;
	}

	public int getRecord_id() {
		return record_id;
	}

	public void setRecord_id(int record_id) {
		this.record_id = record_id;
	}

	public int getMaterial_id() {
		return material_id;
	}

	public void setMaterial_id(int material_id) {
		this.material_id = material_id;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getLoan_time() {
		return loan_time;
	}

	public void setLoan_time(String loan_time) {
		this.loan_time = loan_time;
	}

	public String getReturn_time() {
		return return_time;
	}

	public void setReturn_time(String return_time) {
		this.return_time = return_time;
	}

	public String getRecord_reason() {
		return record_reason;
	}

	public void setRecord_reason(String record_reason) {
		this.record_reason = record_reason;
	}

	
}
