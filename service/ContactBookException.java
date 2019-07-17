package com.capgemini.contactbook.service;

@SuppressWarnings("serial")
public class ContactBookException extends RuntimeException{
	public  ContactBookException(String msg, Throwable ex)
	{
		super(msg,ex);
	}

	public ContactBookException(String string) {
		System.out.println("somthing went wrong");
	}
	}
