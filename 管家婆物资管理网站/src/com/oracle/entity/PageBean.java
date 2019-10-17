package com.oracle.entity;

import java.util.ArrayList;
import java.util.List;

public class PageBean<T> {
private int pageNow;//1.��ǰҳ
	private int pageSize;//2.ÿҳ��ʾ��������
	private int totalCount;//3.�ܹ�����������
	private int totalPage;//4.�ܹ�����ҳ
	private List<T> list=new ArrayList<T>();//5.�������ݵļ���
	public int getPageNow() {
		return pageNow;
	}
	public void setPageNow(int pageNow) {
		this.pageNow = pageNow;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public List<T> getList() {
		return list;
	}
	public void setList(List<T> list) {
		this.list = list;
	}
	
}
