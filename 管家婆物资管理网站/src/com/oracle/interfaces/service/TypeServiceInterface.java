package com.oracle.interfaces.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.oracle.entity.Type;

/**
 * 物资类型service接口
 * @author 33102
 *
 */
public interface TypeServiceInterface {
	/**
	 * 查询所有的物资类型
	 * 
	 * @return 物资类型集合
	 * @throws SQLException 
	 */
	public ArrayList<Type> FindAllType() throws SQLException;

	/**
	 * 删除物资类型
	 * 
	 * @param type_id
	 *            类型id
	 * @return
	 */
	public int DeleteType(int type_id);

	/**
	 * 更新物资类型
	 * 
	 * @param type_id
	 *            物资类型id
	 * @param material_type
	 *            物资类型名称
	 * @return
	 */
	public int UpdateType(int type_id, String material_type);

	/**
	 * 添加物资类型
	 * 
	 * @param type
	 *            物资类型对象
	 * @return
	 */
	public int AddType(Type type);
}
