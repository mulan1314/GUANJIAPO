package com.oracle.interfaces.dao;

import com.oracle.entity.Repair;

/**
 * Repair报修Dao接口
 * @author 33102
 *
 */
public interface RepairDAOInterface {
	/**
	 * 
	 * @param repair 添加报修的数据
	 * @return 申报结果
	 */
	public int addRepair(Repair repair);
	/**
	 * 
	 * @param repair 修改报修的数据
	 * @return 修改结果
	 */
	public int updateRepair(Repair repair);
	/**
	 * 
	 * @param repai_id 删除报修id
	 * @return 删除结果
	 */
	public int deleteRepair(String repai_id );
}
