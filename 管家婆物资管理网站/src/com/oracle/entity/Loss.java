package com.oracle.entity;

/**
 * 挂失表(Loss)
 * 
 * @author 1
 * 
 */
public class Loss {
	private int loss_id;// 报修id
	private int material_id;// 物资_id
	private String loss_time;// 报修时间
	private String loss_content;// 报修内容
	private String user_id;// 用户 id

	public Loss() {
		super();
	}

	public Loss(int loss_id, int material_id, String loss_time,
			String loss_content, String user_id) {
		super();
		this.loss_id = loss_id;
		this.material_id = material_id;
		this.loss_time = loss_time;
		this.loss_content = loss_content;
		this.user_id = user_id;
	}

	public int getLoss_id() {
		return loss_id;
	}

	public void setLoss_id(int loss_id) {
		this.loss_id = loss_id;
	}

	public int getMaterial_id() {
		return material_id;
	}

	public void setMaterial_id(int material_id) {
		this.material_id = material_id;
	}

	public String getLoss_time() {
		return loss_time;
	}

	public void setLoss_time(String loss_time) {
		this.loss_time = loss_time;
	}

	public String getLoss_content() {
		return loss_content;
	}

	public void setLoss_content(String loss_content) {
		this.loss_content = loss_content;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

}
