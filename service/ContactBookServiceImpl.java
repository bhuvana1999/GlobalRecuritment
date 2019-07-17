package com.capgemini.contactbook.service;

import java.util.Scanner;
import java.util.regex.Pattern;
import com.capgemini.contactbook.bean.EnquiryBean;
import com.capgemini.contactbook.dao.ContactBookDaoImpl;

public class ContactBookServiceImpl implements  ContactBookService{
	Scanner sc=new Scanner(System.in);
	ContactBookDaoImpl daoobj=new ContactBookDaoImpl();

	public void getEnquiryDetails(EnquiryBean beanobj)
	{
		 daoobj. getEnquiryDetails(beanobj);
	}

	public long showDetails(long enquiryId) {
		
		return daoobj.showDetails(enquiryId);
	}
	//mobile number check
   public long numbercheck(long number)
   {
	   while(true)
		{
			if(String.valueOf(number).length()>10 || String.valueOf(number).length()<10 ) 
			{
				System.out.println("Enter valid mobile number");
				number=sc.nextLong();
			}
			else
			{
				return number;
			}
		
		}
   }
   //name check
   public String namecheck (String name)
	{
		while(true)
		{
			if(Pattern.matches(("([A-Z])*([a-z])*"),name))
					{
				    return name;
					}
			else
			{
				System.out.println("Name should have only alphabets");
				System.out.println("Enter again");
				name=sc.next();
			}
		}
	}
}
