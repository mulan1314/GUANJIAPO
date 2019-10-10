package com.oracle.interfaces.dao;

import java.util.ArrayList;

import com.oracle.entity.Record;

public interface RecordDAOInterface {
	/**
	 * 查询所有的记录信息
	 * 
	 * @return 记录集合
	 */
	public ArrayList<Record> findAllRecord();

	/**
	 * 根据物资的id查找记录
	 * 
	 * @param material_id
	 *            物资id
	 * @return 记录集合
	 */
	public ArrayList<Record> findRecordByMaterial(int material_id);

	/**
	 * 根据记录id查找记录
	 * 
	 * @param record_id
	 *            记录id
	 * @return 记录集合
	 */
	public ArrayList<Record> findRecordById(int record_id);

	/**
	 * 根据用户查找记录
	 * 
	 * @param user_id
	 *            记录id
	 * @return 记录集合
	 */
	public ArrayList<Record> findRecordByUser(int user_id);

	/**
	 * 添加记录
	 * 
	 * @param record
	 *            记录对象
	 * @return
	 */
	public int addRecord(Record record);
}
