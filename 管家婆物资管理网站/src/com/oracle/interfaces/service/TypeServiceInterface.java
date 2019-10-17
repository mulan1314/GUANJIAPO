package com.oracle.interfaces.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.oracle.entity.Type;

/**
 * ��������service�ӿ�
 * @author 33102
 *
 */
public interface TypeServiceInterface {
	/**
	 * ��ѯ���е���������
	 * 
	 * @return �������ͼ���
	 * @throws SQLException 
	 */
	public ArrayList<Type> FindAllType() throws SQLException;

	/**
	 * ɾ����������
	 * 
	 * @param type_id
	 *            ����id
	 * @return
	 */
	public int DeleteType(int type_id);

	/**
	 * ������������
	 * 
	 * @param type_id
	 *            ��������id
	 * @param material_type
	 *            ������������
	 * @return
	 */
	public int UpdateType(int type_id, String material_type);

	/**
	 * �����������
	 * 
	 * @param type
	 *            �������Ͷ���
	 * @return
	 */
	public int AddType(Type type);
}
