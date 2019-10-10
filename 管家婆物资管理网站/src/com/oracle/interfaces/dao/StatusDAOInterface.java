package com.oracle.interfaces.dao;

import java.util.ArrayList;

import com.oracle.entity.Status;

public interface StatusDAOInterface {
	/**
	 * 查询所有的物资状态
	 * 
	 * @return
	 */
	public ArrayList<Status> findAllStatus();

	/**
	 * 删除物资状态
	 * 
	 * @param status_id
	 *            物资状态id
	 * @return
	 */
	public int deleteStatus(int status_id);

	/**
	 * 更新物资状态
	 * 
	 * @param status_id
	 *            物资状态id
	 * @param material_status
	 *            物资状态名称
	 * @return
	 */
	public int updateStatus(int status_id, String material_status);

	/**
	 * 添加物资状态
	 * 
	 * @param status
	 *            物资状态对象
	 * @return
	 */
	public int addStatus(Status status);
}
