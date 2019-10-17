package com.oracle.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.commons.dbutils.QueryRunner;

import com.oracle.entity.Material;
import com.oracle.interfaces.dao.MaterialDAOInterface;

public class MaterialStatusDao implements MaterialDAOInterface {

	public ArrayList<Material> findAllMaterial() {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Material> findMaterialById(int material_id) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Material> findMaterialByType(int type_id) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Material> findMaterialByStatus(int status_id) {
		// TODO Auto-generated method stub
		return null;
	}

	public int materialTotalCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int materialCountByType(int type_id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int materialCountByStatus(int status_id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int materialCountByName(String material_name) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int deleteMaterialById(int material_id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int deleteMaterialByType(int type_id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int deleteMaterialByName(String material_nameString) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateMaterial(Material material) {
		// TODO Auto-generated method stub
		return 0;
	}

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
	public int updateMaterialStatus(int material_id, int status_id) throws SQLException {
		
		QueryRunner qr = new QueryRunner();
		String sql="update status set material_status='借出' where status_id=? ";
           int update = qr.update(sql, material_id);
                
		return update;
	}

	public int addMaterial(Material material) {
		// TODO Auto-generated method stub
		return 0;
	}

}
