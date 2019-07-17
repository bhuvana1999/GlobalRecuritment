package com.capgemini.contactbook.service;

import com.capgemini.contactbook.bean.EnquiryBean;

public interface ContactBookService {
	public void getEnquiryDetails(EnquiryBean beanobj);
	public long showDetails(long enquiryId) ;
	public long numbercheck(long number);
	 public String namecheck (String name);

}
