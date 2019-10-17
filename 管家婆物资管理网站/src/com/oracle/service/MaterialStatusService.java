package com.oracle.service;

import java.sql.SQLException;

import com.oracle.dao.MaterialStatusDao;
import com.oracle.interfaces.service.MaterialServiceInterface;

public class MaterialStatusService implements MaterialServiceInterface {

	public int updateMaterialStatus(int material_id, String status) throws SQLException {
		MaterialStatusDao md = new MaterialStatusDao();
		int update=0;
		 if(status.equals("Î´½è³ö")){
          update= md.updateMaterialStatus(material_id, material_id);
			 
			 
		 }else{
			 update=-1;
			 
			 
		 }
		return update;
	}

}
