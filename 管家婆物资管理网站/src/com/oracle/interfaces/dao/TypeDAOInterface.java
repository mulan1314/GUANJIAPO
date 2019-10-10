package com.oracle.interfaces.dao;

import java.util.ArrayList;

import com.oracle.entity.Type;

public interface TypeDAOInterface {
	/**
	 * ��ѯ���е���������
	 * 
	 * @return �������ͼ���
	 */
	public ArrayList<Type> findAllType();

	/**
	 * ɾ����������
	 * 
	 * @param type_id
	 *            ����id
	 * @return
	 */
	public int deleteType(int type_id);

	/**
	 * ������������
	 * 
	 * @param type_id
	 *            ��������id
	 * @param material_type
	 *            ������������
	 * @return
	 */
	public int updateType(int type_id, String material_type);

	/**
	 * �����������
	 * 
	 * @param type
	 *            �������Ͷ���
	 * @return
	 */
	public int addType(Type type);
}
