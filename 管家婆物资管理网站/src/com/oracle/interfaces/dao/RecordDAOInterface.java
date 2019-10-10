package com.oracle.interfaces.dao;

import java.util.ArrayList;

import com.oracle.entity.Record;

public interface RecordDAOInterface {
	/**
	 * ��ѯ���еļ�¼��Ϣ
	 * 
	 * @return ��¼����
	 */
	public ArrayList<Record> findAllRecord();

	/**
	 * �������ʵ�id���Ҽ�¼
	 * 
	 * @param material_id
	 *            ����id
	 * @return ��¼����
	 */
	public ArrayList<Record> findRecordByMaterial(int material_id);

	/**
	 * ���ݼ�¼id���Ҽ�¼
	 * 
	 * @param record_id
	 *            ��¼id
	 * @return ��¼����
	 */
	public ArrayList<Record> findRecordById(int record_id);

	/**
	 * �����û����Ҽ�¼
	 * 
	 * @param user_id
	 *            ��¼id
	 * @return ��¼����
	 */
	public ArrayList<Record> findRecordByUser(int user_id);

	/**
	 * ��Ӽ�¼
	 * 
	 * @param record
	 *            ��¼����
	 * @return
	 */
	public int addRecord(Record record);
}
