package com.oracle.interfaces.service;

import java.sql.SQLException;

import com.oracle.entity.Record;

public interface RecordServiceInterface {
	/**
	 * ��Ӽ�¼
	 * 
	 * @param record
	 *            ��¼����
	 * @return
	 * @throws SQLException 
	 */
	public int addRecord(Record record) throws SQLException;
	
}
