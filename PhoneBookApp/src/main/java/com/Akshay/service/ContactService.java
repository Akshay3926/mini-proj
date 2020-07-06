package com.Akshay.service;

import java.util.List;

import com.Akshay.dto.Contact;


public interface ContactService {
	 
	boolean saveContact(Contact c);
	List<Contact> getAllContacts();
	Contact getContactById(Integer cid);
	boolean updateContact(Contact c);
	boolean deleteContact(Integer cid);
	

}
