package com.oracle.interfaces.dao;

import java.util.ArrayList;

import com.oracle.entity.Status;

public interface StatusDAOInterface {
	/**
	 * ��ѯ���е�����״̬
	 * 
	 * @return
	 */
	public ArrayList<Status> findAllStatus();

	/**
	 * ɾ������״̬
	 * 
	 * @param status_id
	 *            ����״̬id
	 * @return
	 */
	public int deleteStatus(int status_id);

	/**
	 * ��������״̬
	 * 
	 * @param status_id
	 *            ����״̬id
	 * @param material_status
	 *            ����״̬����
	 * @return
	 */
	public int updateStatus(int status_id, String material_status);

	/**
	 * �������״̬
	 * 
	 * @param status
	 *            ����״̬����
	 * @return
	 */
	public int addStatus(Status status);
}
