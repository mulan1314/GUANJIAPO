package com.oracle.interfaces.service;

import java.sql.SQLException;

public interface MaterialServiceInterface {

	/**
	 * 更新物资的状态
	 * 
	 * @param material_id
	 *            物资id
	 * @param status_id
	 *            物资状态
	 * @return
	 * @throws SQLException 
	 */
	public int updateMaterialStatus(int material_id,String status ) throws SQLException;

	
}