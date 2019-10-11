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
	// 1加载驱动
	static {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 更新
	public int preUpdate(String sql, Object... arr) {
		int no = 0;
		try {
			// 2创建链接
			coon = DriverManager.getConnection(URL, USER, PASSWORD);
			// 3创建执行对象
			// 3.1 预编译
			ps = coon.prepareStatement(sql);
			// ps 设置
			if (arr != null) {
				for (int i = 0; i < arr.length; i++) {
					ps.setObject(i + 1, arr[i]);
				}
			}
			// 4执行

			no = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
              close();
		}
		return no;

	}

	// 查询
	public ResultSet preQuery(String sql, Object... arr) {
		try {
			// 创建链接
			coon = DriverManager.getConnection(URL, USER, PASSWORD);
			// 预编译
			PreparedStatement ps = coon.prepareStatement(sql);
			// 设置值
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
