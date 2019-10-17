package com.oracle.service;
/**
 * 物资类型Service
 */
import java.sql.SQLException;
import java.util.ArrayList;

import com.oracle.dao.TypeDao;
import com.oracle.entity.Type;
import com.oracle.interfaces.service.TypeServiceInterface;

public class TypeService implements TypeServiceInterface {
	public static void main(String[] args) throws SQLException {
		TypeService ts=new TypeService();
		ArrayList<Type> a=ts.FindAllType();
		for (Type type : a) {
			System.out.println(type.getMaterial_type());
		}
		
	}
	//物资类型Dao对象
	TypeDao td=new TypeDao();
	public ArrayList<Type> FindAllType() throws SQLException {
		ArrayList<Type> ArrayList=td.findAllType();
		return ArrayList;
	}

	public int DeleteType(int type_id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int UpdateType(int type_id, String material_type) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int AddType(Type type) {
		// TODO Auto-generated method stub
		return 0;
	}

}
