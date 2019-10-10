package com.oracle.interfaces.dao;

import com.oracle.entity.Repair;

/**
 * Repair����Dao�ӿ�
 * @author 33102
 *
 */
public interface RepairDAOInterface {
	/**
	 * 
	 * @param repair ��ӱ��޵�����
	 * @return �걨���
	 */
	public int addRepair(Repair repair);
	/**
	 * 
	 * @param repair �޸ı��޵�����
	 * @return �޸Ľ��
	 */
	public int updateRepair(Repair repair);
	/**
	 * 
	 * @param repai_id ɾ������id
	 * @return ɾ�����
	 */
	public int deleteRepair(String repai_id );
}
