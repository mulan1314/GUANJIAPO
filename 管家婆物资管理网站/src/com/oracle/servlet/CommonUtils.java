package com.oracle.servlet;

import java.util.Map;
import java.util.UUID;

import org.apache.commons.beanutils.BeanUtils;

public class CommonUtils {
	
	public static String uuid() {
		return UUID.randomUUID().toString().replace("-", "").toUpperCase();
	}
	// ��mapת����ָ�����͵�javaBean����
	public static <T> T toBean(Map map, Class<T> clazz) {
		try {
			/*
			 * 1. ����ָ�����͵�javabean����
			 */
			T bean = clazz.newInstance();
			/*
			 * 2. �����ݷ�װ��javabean��
			 */
			BeanUtils.populate(bean, map);
			/*
			 * 3. ����javabean����
			 */
			return bean;
		} catch(Exception e) {
			throw new RuntimeException(e);		//��������û�����ʱ����try-catch��ʹ��throw new RuntimeException(e)���׳������쳣
		}
	}

}
