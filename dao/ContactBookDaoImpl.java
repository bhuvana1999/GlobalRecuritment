package com.capgemini.contactbook.dao;

import java.util.HashMap;
import com.capgemini.contactbook.bean.EnquiryBean;
import com.capgemini.contactbook.service.ContactBookException;


public class ContactBookDaoImpl implements ContactBookDao  {
	EnquiryBean beanobj;
	
	HashMap<Long,EnquiryBean> hm=new HashMap<Long,EnquiryBean>();
	
	public void addEnquiry(EnquiryBean beanobj)
	{
		this.beanobj=beanobj;
		hm.put(beanobj.getEnqryId(), beanobj);
		System.out.println(hm);
	}
	public HashMap<Long,EnquiryBean> hm()
	{		                                       
		return hm;
	}

	public void getEnquiryDetails(EnquiryBean beanobj) throws ContactBookException
	{
		hm.put(beanobj.getEnqryId(), beanobj);
		
		beanobj=(EnquiryBean)hm.get(beanobj.getEnqryId());
		

	}
	 public void validationCheck( long EnqryId) {
        boolean noExists = hm().containsKey(EnqryId);
        if (!noExists) {
            throw new ContactBookException("No Account found for this number=" + EnqryId);
        }
	 }

    

	public long showDetails(long enquiryId) //throws ContactBookException
	{
		 beanobj=hm.get(enquiryId);
		 if(hm().isEmpty())
		   {
			   throw new ContactBookException("Something went wrong");
		   }
		 else
		 {
		
		System.out.println("Id "+beanobj.getEnqryId());
		System.out.println("First Name "+beanobj.getfName());
		System.out.println("Last Name "+beanobj.getlName());
		System.out.println("Contact No "+beanobj.getContactNo());
		System.out.println("Preferred Domain "+beanobj.getpDomain());
		System.out.println("Preferred Location "+beanobj.getpLocation());	}
		return enquiryId;
    
	}
}
