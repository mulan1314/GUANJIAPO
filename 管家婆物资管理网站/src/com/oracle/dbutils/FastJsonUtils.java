package com.oracle.dbutils;
	import java.util.List;
	import java.util.Map; 
	import com.alibaba.fastjson.JSON;
	import com.alibaba.fastjson.JSONObject;
	import com.alibaba.fastjson.serializer.JSONLibDataFormatSerializer;
	import com.alibaba.fastjson.serializer.SerializeConfig;
	import com.alibaba.fastjson.serializer.SerializerFeature;
	 
	/**
	 * fastjson������
	 * @version:1.0.0
	 */
	public class FastJsonUtils {
	 
	    private static final SerializeConfig config;
	 
	    static {
	        config = new SerializeConfig();
	        config.put(java.util.Date.class, new JSONLibDataFormatSerializer()); // ʹ�ú�json-lib���ݵ����������ʽ
	        config.put(java.sql.Date.class, new JSONLibDataFormatSerializer()); // ʹ�ú�json-lib���ݵ����������ʽ
	    }
	 
	    private static final SerializerFeature[] features = {SerializerFeature.WriteMapNullValue, // ��������ֶ�
	            SerializerFeature.WriteNullListAsEmpty, // list�ֶ����Ϊnull�����Ϊ[]��������null
	            SerializerFeature.WriteNullNumberAsZero, // ��ֵ�ֶ����Ϊnull�����Ϊ0��������null
	            SerializerFeature.WriteNullBooleanAsFalse, // Boolean�ֶ����Ϊnull�����Ϊfalse��������null
	            SerializerFeature.WriteNullStringAsEmpty // �ַ������ֶ����Ϊnull�����Ϊ""��������null
	    };
	    
	 
	    public static String convertObjectToJSON(Object object) {
	        return JSON.toJSONString(object, config, features);
	    }
	    
	    public static String toJSONNoFeatures(Object object) {
	        return JSON.toJSONString(object, config);
	    }
	    
	 
	 
	    public static Object toBean(String text) {
	        return JSON.parse(text);
	    }
	 
	    public static <T> T toBean(String text, Class<T> clazz) {
	        return JSON.parseObject(text, clazz);
	    }
	 
	    /**
	     *  ת��Ϊ����
	     * @param text
	     * @return
	     */
	    public static <T> Object[] toArray(String text) {
	        return toArray(text, null);
	    }
	 
	    /**
	     *  ת��Ϊ����
	     * @param text
	     * @param clazz
	     * @return
	     */
	    public static <T> Object[] toArray(String text, Class<T> clazz) {
	        return JSON.parseArray(text, clazz).toArray();
	    }
	 
	    /**
	     * ת��ΪList
	     * @param text
	     * @param clazz
	     * @return
	     */
	    public static <T> List<T> toList(String text, Class<T> clazz) {
	        return JSON.parseArray(text, clazz);
	    }
	 
	    /**
	     * ��stringת��Ϊ���л���json�ַ���
	     * @param keyvalue
	     * @return
	     */
	    public static Object textToJson(String text) {
	        Object objectJson  = JSON.parse(text);
	        return objectJson;
	    }
	    
	    /**
	     * json�ַ���ת��Ϊmap
	     * @param s
	     * @return
	     */
	    public static <K, V> Map<K, V>  stringToCollect(String s) {
	        Map<K, V> m = (Map<K, V>) JSONObject.parseObject(s);
	        return m;
	    }
	    
	    /**
	     * ת��JSON�ַ���Ϊ����
	     * @param jsonData
	     * @param clazz
	     * @return
	     */
	    public static Object convertJsonToObject(String jsonData, Class<?> clazz) {
	        return JSONObject.parseObject(jsonData, clazz);
	    }
	    
	    /**
	     * ��mapת��Ϊstring
	     * @param m
	     * @return
	     */
	    public static <K, V> String collectToString(Map<K, V> m) {
	        String s = JSONObject.toJSONString(m);
	        return s;
	    }
	}

