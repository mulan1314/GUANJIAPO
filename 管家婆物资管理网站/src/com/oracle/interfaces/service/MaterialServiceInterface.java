package com.oracle.interfaces.service;

import java.sql.SQLException;
<<<<<<< HEAD
=======
import java.util.ArrayList;
import java.util.List;

import com.oracle.entity.Material;
>>>>>>> 7aae61af061f9b2d2d5818c28e6bcc1706e52159

public interface MaterialServiceInterface {
	/** 查询所有的物资
	 * 
	 * @return 物资集合
	 * @throws SQLException 
	 */
	public List<Material> FindAllMaterial() throws SQLException;

	/**
	 * 模糊查询物资
	 * @param name 模糊的内容
	 * @return 返回查询的结果
	 * @throws SQLException 
	 */
	public List<Material> FindLinkMaterial(String name) throws SQLException;
	
	/**
	 * 根据物资的id查询物资
	 * 
	 * @param material_id
	 *            物资编号id
	 * @return 物资集合
	 */
	

	public ArrayList<Material> FindMaterialById(int material_id);

	/**
	 * 根据物资的类型来查询物资
	 * 
	 * @param type_id
	 *            类型id
	 * @return 物资集合
	 * @throws SQLException 
	 */
	public List<Material> FindMaterialByType(int type_id) throws SQLException;

	/**
	 * 根据物资的状态来查询物资
	 * 
	 * @param status_id
	 *            状态id
	 * @return 物资集合
	 */
	public ArrayList<Material> FindMaterialByStatus(int status_id);

	/**
	 * 查询所有物资的记录条数
	 * 
	 * @return 物资数量
	 */
	public int MaterialTotalCount();

	/**
	 * 根据类型来查询物资数
	 * 
	 * @param type_id
	 *            类型id
	 * @return 物资数量
	 */
	public int MaterialCountByType(int type_id);

	/**
	 * 根据类型来查询物资数
	 * 
	 * @param status_id
	 *            状态id
	 * @return 物资数量
	 */
	public int MaterialCountByStatus(int status_id);

	/**
	 * 根据物资名字来查询物资数
	 * 
	 * @param material_name
	 *            物资名字
	 * @return 物资数量
	 */
	public int MaterialCountByName(String material_name);

	/**
	 * 根据物资id来删除物资
	 * 
	 * @param material_id
	 *            物资id
	 * @return
	 */
	public int DeleteMaterialById(int material_id);

	/**
	 * 根据物资类型来删除物资
	 * 
	 * @param type_id
	 * @returns
	 */
	public int DeleteMaterialByType(int type_id);

	/**
	 * 根据物资名字来删除物资
	 * 
	 * @param material_nameString
	 *            物资名字
	 * @return
	 */
	public int DeleteMaterialByName(String material_nameString);

	/**
	 * 更新物资
	 * 
	 * @param material
	 *            物资对象
	 * @return
	 */
	public int UpdateMaterial(Material material);

	/**
	 * 更新物资的状态
	 * 
	 * @param material_id
	 *            物资id
	 * @param status_id
	 *            状态id
	 * @return
	 */
	public int UpdateMaterialStatus(int material_id, int status_id);

	/**
<<<<<<< HEAD
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
=======
	 * 添加一个物资
	 * 
	 * @param material
	 *            物资对象
	 * @return
	 * @throws SQLException 
	 */
	public int AddMaterial(List<String> list) throws SQLException;
}
>>>>>>> 7aae61af061f9b2d2d5818c28e6bcc1706e52159
