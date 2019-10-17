package com.oracle.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.commons.dbutils.QueryRunner;

import com.oracle.dbutils.DataSourceUtil;
import com.oracle.entity.Record;
import com.oracle.interfaces.dao.RecordDAOInterface;

public class AddRecordDao implements RecordDAOInterface{

	/**
	 * 增添记录信息
	 * @throws SQLException 
	 */
	public int addRecord(Record record) throws SQLException {
		QueryRunner qr = new QueryRunner(DataSourceUtil.getDataSource());
		String sql="insert into record(material_id,user_id,loan_time,record_reason) values(?,?,?,?)";
		           int update = qr.update(sql, record.getMaterial_id(),record.getUser_id(),record.getLoan_time(),record.getRecord_reason());
				return update;
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public ArrayList<Record> findAllRecord() {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Record> findRecordByMaterial(int material_id) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Record> findRecordById(int record_id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public ArrayList<Record> findRecordByUser(int user_id) {
		// TODO Auto-generated method stub
		return null;
	}

}
