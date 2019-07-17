package com.capgemini.contactbook.dao;

import java.util.HashMap;

import com.capgemini.contactbook.bean.EnquiryBean;

public interface ContactBookDao {
	HashMap<Long,EnquiryBean> hm=new HashMap<Long,EnquiryBean>();
	public void addEnquiry(EnquiryBean beanobj);
	public HashMap<Long,EnquiryBean> hm();
	public void getEnquiryDetails(EnquiryBean beanobj);
	public long showDetails(long enquiryId) ;
}
