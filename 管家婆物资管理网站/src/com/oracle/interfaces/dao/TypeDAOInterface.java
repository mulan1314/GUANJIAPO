package com.oracle.interfaces.dao;

import java.util.ArrayList;

import com.oracle.entity.Type;

public interface TypeDAOInterface {
	/**
	 * 查询所有的物资类型
	 * 
	 * @return 物资类型集合
	 */
	public ArrayList<Type> findAllType();

	/**
	 * 删除物资类型
	 * 
	 * @param type_id
	 *            类型id
	 * @return
	 */
	public int deleteType(int type_id);

	/**
	 * 更新物资类型
	 * 
	 * @param type_id
	 *            物资类型id
	 * @param material_type
	 *            物资类型名称
	 * @return
	 */
	public int updateType(int type_id, String material_type);

	/**
	 * 添加物资类型
	 * 
	 * @param type
	 *            物资类型对象
	 * @return
	 */
	public int addType(Type type);
}
