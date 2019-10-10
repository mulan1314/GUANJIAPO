package com.oracle.interfaces.dao;

import java.util.ArrayList;

import javax.faces.component.UpdateModelException;

import com.oracle.entity.Material;

public interface MaterialDAOInterface {
	/**
	 * ��ѯ���е�����
	 * 
	 * @return ���ʼ���
	 */
	public ArrayList<Material> findAllMaterial();

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
	 */
	public ArrayList<Material> findMaterialByType(int type_id);

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
	 * @returns
	 */
	public int deleteMaterialByType(int type_id);

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
	 */
	public int addMaterial(Material material);
}
