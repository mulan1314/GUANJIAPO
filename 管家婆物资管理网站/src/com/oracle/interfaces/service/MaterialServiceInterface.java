package com.oracle.interfaces.service;

import java.sql.SQLException;

public interface MaterialServiceInterface {

	/**
	 * �������ʵ�״̬
	 * 
	 * @param material_id
	 *            ����id
	 * @param status_id
	 *            ����״̬
	 * @return
	 * @throws SQLException 
	 */
	public int updateMaterialStatus(int material_id,String status ) throws SQLException;

	
}