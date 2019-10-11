package com.oracle.dbutils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DButils {
	private static final String URL = "jdbc:mysql://localhost:3306/super";
	private static final String USER = "root";
	private static final String PASSWORD = "mysql";

	private Connection coon = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	// 1��������
	static {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// ����
	public int preUpdate(String sql, Object... arr) {
		int no = 0;
		try {
			// 2��������
			coon = DriverManager.getConnection(URL, USER, PASSWORD);
			// 3����ִ�ж���
			// 3.1 Ԥ����
			ps = coon.prepareStatement(sql);
			// ps ����
			if (arr != null) {
				for (int i = 0; i < arr.length; i++) {
					ps.setObject(i + 1, arr[i]);
				}
			}
			// 4ִ��

			no = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
              close();
		}
		return no;

	}

	// ��ѯ
	public ResultSet preQuery(String sql, Object... arr) {
		try {
			// ��������
			coon = DriverManager.getConnection(URL, USER, PASSWORD);
			// Ԥ����
			PreparedStatement ps = coon.prepareStatement(sql);
			// ����ֵ
			if (arr != null) {
				for (int i = 0; i < arr.length; i++) {
					ps.setObject(i + 1, arr[i]);
				}
				rs = ps.executeQuery();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;

	}
  public void close(){
	  try {
		if(rs!=null){
			  rs.close();
		  }
		  if(ps!=null){
			  ps.close();
		  }
		  if(coon!=null){
			  coon.close();
		  }
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
	
	
	
}
