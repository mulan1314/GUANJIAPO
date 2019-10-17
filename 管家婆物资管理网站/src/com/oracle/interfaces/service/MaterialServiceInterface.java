package com.oracle.interfaces.service;

import java.sql.SQLException;
<<<<<<< HEAD
=======
import java.util.ArrayList;
import java.util.List;

import com.oracle.entity.Material;
>>>>>>> 7aae61af061f9b2d2d5818c28e6bcc1706e52159

public interface MaterialServiceInterface {
	/** ��ѯ���е�����
	 * 
	 * @return ���ʼ���
	 * @throws SQLException 
	 */
	public List<Material> FindAllMaterial() throws SQLException;

	/**
	 * ģ����ѯ����
	 * @param name ģ��������
	 * @return ���ز�ѯ�Ľ��
	 * @throws SQLException 
	 */
	public List<Material> FindLinkMaterial(String name) throws SQLException;
	
	/**
	 * �������ʵ�id��ѯ����
	 * 
	 * @param material_id
	 *            ���ʱ��id
	 * @return ���ʼ���
	 */
	

	public ArrayList<Material> FindMaterialById(int material_id);

	/**
	 * �������ʵ���������ѯ����
	 * 
	 * @param type_id
	 *            ����id
	 * @return ���ʼ���
	 * @throws SQLException 
	 */
	public List<Material> FindMaterialByType(int type_id) throws SQLException;

	/**
	 * �������ʵ�״̬����ѯ����
	 * 
	 * @param status_id
	 *            ״̬id
	 * @return ���ʼ���
	 */
	public ArrayList<Material> FindMaterialByStatus(int status_id);

	/**
	 * ��ѯ�������ʵļ�¼����
	 * 
	 * @return ��������
	 */
	public int MaterialTotalCount();

	/**
	 * ������������ѯ������
	 * 
	 * @param type_id
	 *            ����id
	 * @return ��������
	 */
	public int MaterialCountByType(int type_id);

	/**
	 * ������������ѯ������
	 * 
	 * @param status_id
	 *            ״̬id
	 * @return ��������
	 */
	public int MaterialCountByStatus(int status_id);

	/**
	 * ����������������ѯ������
	 * 
	 * @param material_name
	 *            ��������
	 * @return ��������
	 */
	public int MaterialCountByName(String material_name);

	/**
	 * ��������id��ɾ������
	 * 
	 * @param material_id
	 *            ����id
	 * @return
	 */
	public int DeleteMaterialById(int material_id);

	/**
	 * ��������������ɾ������
	 * 
	 * @param type_id
	 * @returns
	 */
	public int DeleteMaterialByType(int type_id);

	/**
	 * ��������������ɾ������
	 * 
	 * @param material_nameString
	 *            ��������
	 * @return
	 */
	public int DeleteMaterialByName(String material_nameString);

	/**
	 * ��������
	 * 
	 * @param material
	 *            ���ʶ���
	 * @return
	 */
	public int UpdateMaterial(Material material);

	/**
	 * �������ʵ�״̬
	 * 
	 * @param material_id
	 *            ����id
	 * @param status_id
	 *            ״̬id
	 * @return
	 */
	public int UpdateMaterialStatus(int material_id, int status_id);

	/**
<<<<<<< HEAD
	 * �������ʵ�״̬
	 * 
	 * @param material_id
	 *            ����id
	 * @param status_id
	 *            ����״̬
	 * @return
	 * @throws SQLException 
	 */
	public int updateMaterialStatus(int material_id,String status ) throws SQLException;

	
}
=======
	 * ���һ������
	 * 
	 * @param material
	 *            ���ʶ���
	 * @return
	 * @throws SQLException 
	 */
	public int AddMaterial(List<String> list) throws SQLException;
}
>>>>>>> 7aae61af061f9b2d2d5818c28e6bcc1706e52159
