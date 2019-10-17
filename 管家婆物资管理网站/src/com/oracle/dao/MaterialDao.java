package com.oracle.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;

import com.oracle.dbutils.DataSourceUtil;
import com.oracle.entity.Material;
import com.oracle.interfaces.dao.MaterialDAOInterface;

/**
 * 物资表Dao
 * 
 * @author 33102
 * 
 */
public class MaterialDao implements MaterialDAOInterface {
	
	public List<Map<String, Object>> findAllMaterial() throws SQLException {
 
		// 查询所有物资的信息     
		QueryRunner qr = new QueryRunner(DataSourceUtil.getDataSource());
		String sql = "select m.material_id,m.material_name,m.material_picture,s.material_status from material m,status s where s.status_id=m.status_id"; 
		List<Map<String, Object>> list = qr.query(sql, new MapListHandler());
		
		return list;
		
		
	}

	private List<Material> toOrderItemList(List<Map<String, Object>> map) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Material> findMaterialById(int material_id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Map<String, Object>> findMaterialByType(int type_id) throws SQLException {
		//根据物资类型查询
		QueryRunner qr = new QueryRunner(DataSourceUtil.getDataSource());
		String sql="select m.material_id,m.material_name,m.material_picture,s.material_status from material m,status s where m.type_id=? and s.status_id=m.status_id";
		
		List<Map<String, Object>> list=qr.query( sql, new MapListHandler(),type_id);
		return list;
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

	public int deleteMaterialByType(int type_id) throws SQLException {
		//根据物资id来删除物资
		QueryRunner qr = new QueryRunner(DataSourceUtil.getDataSource());
		String sql="delete from Material where type_id=?";
		int no=qr.update(sql, type_id);
		return no;
	}

	public int deleteMaterialByName(String material_nameString) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateMaterial(Material material) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateMaterialStatus(int material_id, int status_id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int addMaterial(Material material) throws SQLException {
		//添加物资
		QueryRunner qr = new QueryRunner(DataSourceUtil.getDataSource());
		String sql="insert into Material(material_name,material_introduct,material_price,material_picture,type_id,status_id,material_address) values (?,?,?,?,?,?,?)";
																			
		int no=qr.update(sql,material.getMaterial_name(),material.getMaterial_introduct(),material.getMaterial_price(),material.getMaterial_picture(),material.getType().getType_id(),material.getStatus().getStatus_id(),material.getMaterial_address());
		return no;
	}
	/**
	 * 模糊查询物资
	 * @throws SQLException 
	 */
	public List<Material> findLinkMaterial(String name) throws SQLException {
		QueryRunner qr = new QueryRunner(DataSourceUtil.getDataSource());
		String sql="select m.material_id,m.material_name,m.material_picture,s.material_status from material m,status s where m.material_name link ? and s.status_id=m.status_id";
		List<Material> list=qr.query(sql,new BeanListHandler<Material>(Material.class),name);
		return null;
	}

}
