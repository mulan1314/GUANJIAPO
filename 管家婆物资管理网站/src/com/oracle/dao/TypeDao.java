package com.oracle.dao;
/**
 * 物资类型Dao
 */
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.oracle.dbutils.DataSourceUtil;
import com.oracle.entity.Type;
import com.oracle.interfaces.dao.TypeDAOInterface;

public class TypeDao implements TypeDAOInterface {
	//创建数据库连接池对象
	QueryRunner qr=new QueryRunner(DataSourceUtil.getDataSource());
	
	public ArrayList<Type> findAllType() throws SQLException {
		//查询所有物资类型
		String sql="select * from type";
		ArrayList<Type> arrayList=(ArrayList<Type>) qr.query(sql, new BeanListHandler<Type>(Type.class));
		
		return arrayList;
	}

	public int deleteType(int type_id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateType(int type_id, String material_type) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int addType(Type type) {
		// TODO Auto-generated method stub
		return 0;
	}

}
