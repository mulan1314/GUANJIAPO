package com.oracle.interfaces.dao;

import com.oracle.entity.Loss;

/**
 * Loss��ʧdao��ӿ�
 * @author 33102
 *
 */
public interface LossDAOInterface {
	/**
	 * 
	 * @param Loss ��ӱ�ʧ����
	 * @return��ӽ��
	 */
	public int addLoss(Loss Loss);
	/**
	 * 
	 * @param Loss �޸ı�������
	 * @return �޸Ľ��
	 */
	public int updateLoss(Loss Loss);
	/**
	 * 
	 * @param loss_id ɾ����������
	 * @return ɾ�����
	 */
	public int deleteLoss(String loss_id );
}
