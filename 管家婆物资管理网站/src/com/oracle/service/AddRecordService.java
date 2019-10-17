package com.oracle.service;

import java.sql.SQLException;

import com.oracle.dao.AddRecordDao;
import com.oracle.entity.Record;
import com.oracle.interfaces.service.RecordServiceInterface;

public class AddRecordService  implements RecordServiceInterface{

	public int addRecord(Record record) throws SQLException {
		AddRecordDao rd = new AddRecordDao();
		return rd.addRecord(record);
	
	}

}
