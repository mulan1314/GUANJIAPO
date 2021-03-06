package com.oracle.interfaces.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.faces.component.UpdateModelException;

import com.oracle.entity.Material;
import com.oracle.entity.Status;

public interface MaterialDAOInterface {
	
	/**
	 * 查询所有的物资
	 * 
	 * @return 物资集合
	 * @throws SQLException 
	 */
	public List<Map<String, Object>> findAllMaterial() throws SQLException;
	/**
	 * 模糊查询物资
	 * @param name 模糊的内容
	 * @return 返回查询的结果
	 * @throws SQLException 
	 */
	public List<Material> findLinkMaterial(String name) throws SQLException;

	/**
	 * 根据物资的id查询物资
	 * 
	 * @param material_id
	 *            物资编号id
	 * @return 物资集合
	 */
	public ArrayList<Material> findMaterialById(int material_id);

	/**
	 * 根据物资的类型来查询物资
	 * 
	 * @param type_id
	 *            类型id
	 * @return 物资集合
	 * @throws SQLException 
	 */
	public List<Map<String, Object>> findMaterialByType(int type_id) throws SQLException;

	/**
	 * 根据物资的状态来查询物资
	 * 
	 * @param status_id
	 *            状态id
	 * @return 物资集合
	 */
	public ArrayList<Material> findMaterialByStatus(int status_id);

	/**
	 * 查询所有物资的记录条数
	 * 
	 * @return 物资数量
	 */
	public int materialTotalCount();

	/**
	 * 根据类型来查询物资数
	 * 
	 * @param type_id
	 *            类型id
	 * @return 物资数量
	 */
	public int materialCountByType(int type_id);

	/**
	 * 根据类型来查询物资数
	 * 
	 * @param status_id
	 *            状态id
	 * @return 物资数量
	 */
	public int materialCountByStatus(int status_id);

	/**
	 * 根据物资名字来查询物资数
	 * 
	 * @param material_name
	 *            物资名字
	 * @return 物资数量
	 */
	public int materialCountByName(String material_name);

	/**
	 * 根据物资id来删除物资
	 * 
	 * @param material_id
	 *            物资id
	 * @return
	 */
	public int deleteMaterialById(int material_id);

	/**
	 * 根据物资类型来删除物资
	 * 
	 * @param type_id
	 * @throws SQLException 
	 * @returns
	 */
	public int deleteMaterialByType(int type_id) throws SQLException;

	/**
	 * 根据物资名字来删除物资
	 * 
	 * @param material_nameString
	 *            物资名字
	 * @return
	 */
	public int deleteMaterialByName(String material_nameString);

	/**
	 * 更新物资
	 * 
	 * @param material
	 *            物资对象
	 * @return
	 */
	public int updateMaterial(Material material);

	/**
	 * 更新物资的状态
	 * 
	 * @param material_id
	 *            物资id
	 * @param status_id
	 *            状态id
	 * @return
	 * @throws SQLException 
	 */
	public int updateMaterialStatus(int material_id, int status_id) throws SQLException;

	/**
	 * 添加一个物资
	 * 
	 * @param material
	 *            物资对象
	 * @return
	 * @throws SQLException 
	 */
	public int addMaterial(Material material) throws SQLException;
}
