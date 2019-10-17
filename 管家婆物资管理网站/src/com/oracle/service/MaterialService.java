package com.oracle.service;
/**
 * 物资表Service
 */
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.junit.Test;

import com.oracle.dao.MaterialDao;
import com.oracle.entity.Material;
import com.oracle.entity.Status;
import com.oracle.interfaces.service.MaterialServiceInterface;
public class MaterialService implements MaterialServiceInterface {
	
//创建MaterialDao的对象
   MaterialDao md=new MaterialDao();
   @Test
	public List<Material> FindAllMaterial() throws SQLException {
		List<Map<String, Object>> map=md.findAllMaterial();
		List<Material> list=new ArrayList<Material>() ;
		//取出map集合中的list里面的map数据
				
				for (Map<String, Object> m : map) {
					Material ma=toMaterial(m);
					Status s=toStatus(m);
					 ma.setStatus(s);
					 list.add(ma);
					
				}
		return list;
	}

	private Status toStatus(Map<String, Object> m) {
		Status s=new Status();
		try {
			BeanUtils.populate(s, m);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return s;
}

	private Material toMaterial(Map<String, Object> m)  {
		Material ma =new Material();
		try {
			BeanUtils.populate(ma, m);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(ma);
		return ma;
}

	public ArrayList<Material> FindMaterialById(int material_id) {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * 根据物资类型查询物资
	 * @throws SQLException 
	 */
	
	public List<Material> FindMaterialByType(int type_id) throws SQLException {
		List<Material> list=null;
		List<Map<String, Object>> map= md.findMaterialByType(type_id);
		//取出map集合中的list里面的map数据
		Material ma=null;
		Status s=null;
		for (Map<String, Object> m : map) {
			 ma=new Material(m,ma);
			 s=new Status(m,s);	
			 ma.setStatus(s);
			 list.add(ma);
			
		}	
		System.out.println(list);
		return list;
	}

	public ArrayList<Material> FindMaterialByStatus(int status_id) {
		// TODO Auto-generated method stub
		return null;
	}

	public int MaterialTotalCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int MaterialCountByType(int type_id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int MaterialCountByStatus(int status_id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int MaterialCountByName(String material_name) {
		// TODO Auto-generated method stub
		return 0;
	}
	/**
	 * 根据物资id删除物资
	 */
	public int DeleteMaterialById(int material_id) {
		int no=md.deleteMaterialById(material_id);
		return no;
	}

	public int DeleteMaterialByType(int type_id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int DeleteMaterialByName(String material_nameString) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int UpdateMaterial(Material material) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int UpdateMaterialStatus(int material_id, int status_id) {
		// TODO Auto-generated method stub
		return 0;
	}
	/**
	 * 
	 * 添加物资
	 * @throws SQLException 
	 */
	public int AddMaterial(List<String> listMaterial) throws SQLException {
		//将物资信息的集合数据 封装进对象
		for (String string : listMaterial) {
			System.out.println(string);
		}
		System.out.println("长度"+listMaterial.size());
		Material material=new Material(listMaterial.get(0),listMaterial.get(1),listMaterial.get(2),listMaterial.get(3),listMaterial.get(4),listMaterial.get(5));
		
		int no=md.addMaterial(material);
		return no;
	}
	/**
	 * 模糊查询物资
	 */
	public List<Material> FindLinkMaterial(String name) throws SQLException {
		List<Material> list=md.findLinkMaterial(name);
		return list;
	}

}
