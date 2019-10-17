package com.oracle.interfaces.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.faces.component.UpdateModelException;

import com.oracle.entity.Material;
import com.oracle.entity.Status;

public interface MaterialDAOInterface {
	
	/**
	 * ��ѯ���е�����
	 * 
	 * @return ���ʼ���
	 * @throws SQLException 
	 */
	public List<Map<String, Object>> findAllMaterial() throws SQLException;
	/**
	 * ģ����ѯ����
	 * @param name ģ��������
	 * @return ���ز�ѯ�Ľ��
	 * @throws SQLException 
	 */
	public List<Material> findLinkMaterial(String name) throws SQLException;

	/**
	 * �������ʵ�id��ѯ����
	 * 
	 * @param material_id
	 *            ���ʱ��id
	 * @return ���ʼ���
	 */
	public ArrayList<Material> findMaterialById(int material_id);

	/**
	 * �������ʵ���������ѯ����
	 * 
	 * @param type_id
	 *            ����id
	 * @return ���ʼ���
	 * @throws SQLException 
	 */
	public List<Map<String, Object>> findMaterialByType(int type_id) throws SQLException;

	/**
	 * �������ʵ�״̬����ѯ����
	 * 
	 * @param status_id
	 *            ״̬id
	 * @return ���ʼ���
	 */
	public ArrayList<Material> findMaterialByStatus(int status_id);

	/**
	 * ��ѯ�������ʵļ�¼����
	 * 
	 * @return ��������
	 */
	public int materialTotalCount();

	/**
	 * ������������ѯ������
	 * 
	 * @param type_id
	 *            ����id
	 * @return ��������
	 */
	public int materialCountByType(int type_id);

	/**
	 * ������������ѯ������
	 * 
	 * @param status_id
	 *            ״̬id
	 * @return ��������
	 */
	public int materialCountByStatus(int status_id);

	/**
	 * ����������������ѯ������
	 * 
	 * @param material_name
	 *            ��������
	 * @return ��������
	 */
	public int materialCountByName(String material_name);

	/**
	 * ��������id��ɾ������
	 * 
	 * @param material_id
	 *            ����id
	 * @return
	 */
	public int deleteMaterialById(int material_id);

	/**
	 * ��������������ɾ������
	 * 
	 * @param type_id
	 * @throws SQLException 
	 * @returns
	 */
	public int deleteMaterialByType(int type_id) throws SQLException;

	/**
	 * ��������������ɾ������
	 * 
	 * @param material_nameString
	 *            ��������
	 * @return
	 */
	public int deleteMaterialByName(String material_nameString);

	/**
	 * ��������
	 * 
	 * @param material
	 *            ���ʶ���
	 * @return
	 */
	public int updateMaterial(Material material);

	/**
	 * �������ʵ�״̬
	 * 
	 * @param material_id
	 *            ����id
	 * @param status_id
	 *            ״̬id
	 * @return
	 */
	public int updateMaterialStatus(int material_id, int status_id);

	/**
	 * ���һ������
	 * 
	 * @param material
	 *            ���ʶ���
	 * @return
	 * @throws SQLException 
	 */
	public int addMaterial(Material material) throws SQLException;
}
