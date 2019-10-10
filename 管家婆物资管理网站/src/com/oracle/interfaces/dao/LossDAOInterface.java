package com.oracle.interfaces.dao;

import com.oracle.entity.Loss;

/**
 * Loss挂失dao层接口
 * @author 33102
 *
 */
public interface LossDAOInterface {
	/**
	 * 
	 * @param Loss 添加报失内容
	 * @return添加结果
	 */
	public int addLoss(Loss Loss);
	/**
	 * 
	 * @param Loss 修改报修内容
	 * @return 修改结果
	 */
	public int updateLoss(Loss Loss);
	/**
	 * 
	 * @param loss_id 删除报修数据
	 * @return 删除结果
	 */
	public int deleteLoss(String loss_id );
}
