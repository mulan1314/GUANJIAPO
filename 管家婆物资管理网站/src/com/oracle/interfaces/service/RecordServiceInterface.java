package com.oracle.interfaces.service;

import java.sql.SQLException;

import com.oracle.entity.Record;

public interface RecordServiceInterface {
	/**
	 * 添加记录
	 * 
	 * @param record
	 *            记录对象
	 * @return
	 * @throws SQLException 
	 */
	public int addRecord(Record record) throws SQLException;
	
}
