package com.capgemini.contactbook.ui;

import java.util.Random;
import java.util.Scanner;

import com.capgemini.contactbook.bean.EnquiryBean;
import com.capgemini.contactbook.service.ContactBookException;
import com.capgemini.contactbook.service.ContactBookServiceImpl;


public class Client {
	public static void main(String[] args) {
		ContactBookServiceImpl serviceobj=new ContactBookServiceImpl ();
		Scanner sc=new Scanner(System.in);
		System.out.println("**********Global Recruitments**********");
		System.out.println("1.Enter Enquiry Details");
		System.out.println("2.View Enquiry Details on Id");
		System.out.println("3.Exit");
		System.out.println("***************************************");
		int ch;
		
		do { 
			System.out.println("enter your choice");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				try
				{
				System.out.println("Enter First Name");
				String fName=serviceobj.namecheck(sc.next());
				System.out.println("Enter Last Name");
				String lName=serviceobj.namecheck(sc.next());
				System.out.println("Enter Contact Number");
				long contactNo=serviceobj.numbercheck(sc.nextLong());
				System.out.println("Enter preferred Domain");
				String pDomain=serviceobj.namecheck(sc.next());
				System.out.println("Enter preferred Location");
				String pLocation=serviceobj.namecheck(sc.next());
				Random r=new Random();
				long enquiryId=r.nextInt(10000);
				EnquiryBean beanobj=new EnquiryBean(enquiryId,fName,lName,contactNo,pDomain,pLocation);
				System.out.println("Thank you "+fName+" "+lName+" Your Unique Id is "+enquiryId+" we will contact you shortly");
				serviceobj.getEnquiryDetails(beanobj);
				break;
				}
				catch(ContactBookException e)
				{
					System.out.println("something went wrong");
				}
			case 2:
				System.out.println("Enter the Enquiry No: ");
			   long enquiryId=sc.nextInt();
				serviceobj.showDetails(enquiryId);
				break;
			case 3:
				System.out.println("Thank you selecting us!!");
				System.exit(0);
				break;
	        }
			

          }while(ch !=3);
		sc.close();
		System.out.println("Thank you");
		System.exit(0);
	}
}
