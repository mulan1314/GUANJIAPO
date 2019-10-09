package com.oracle.entity;

/**
 * 报修表(Repair)
 * 
 * @author 1
 * 
 */
public class Repair {
	private int repai_id;// 报修id
	private int material_id;// 物资_id
	private String repair_time;// 报修时间
	private String repair_content;// 报修内容
	private String user_id;// 用户 id

	 public Repair() {
		super();
	}

	public Repair(int repai_id, int material_id, String repair_time,
			String repair_content, String user_id) {
		super();
		this.repai_id = repai_id;
		this.material_id = material_id;
		this.repair_time = repair_time;
		this.repair_content = repair_content;
		this.user_id = user_id;
	}

	public int getRepai_id() {
		return repai_id;
	}

	public void setRepai_id(int repai_id) {
		this.repai_id = repai_id;
	}

	public int getMaterial_id() {
		return material_id;
	}

	public void setMaterial_id(int material_id) {
		this.material_id = material_id;
	}

	public String getRepair_time() {
		return repair_time;
	}

	public void setRepair_time(String repair_time) {
		this.repair_time = repair_time;
	}

	public String getRepair_content() {
		return repair_content;
	}

	public void setRepair_content(String repair_content) {
		this.repair_content = repair_content;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

}