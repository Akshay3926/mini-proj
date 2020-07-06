package com.Akshay.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Akshay.dto.Contact;
import com.Akshay.entity.ContactEntity;
import com.Akshay.repo.ContactRepo;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactRepo contactRepo;
	
	@Override
	public boolean saveContact(Contact c) {
		ContactEntity entity=new ContactEntity();
		BeanUtils.copyProperties(c,entity);
		ContactEntity savedEntity = contactRepo.save(entity);
		return savedEntity.getContactId()!=null;
	}

	@Override
	public List<Contact> getAllContacts() {
		List<ContactEntity> entities = contactRepo.findAll();
		List<Contact> contacts=new ArrayList<Contact>();
		entities.stream().map(entity -> {
			Contact contact=new Contact();
			BeanUtils.copyProperties(entity,contact);
			return contact;
		}).collect(Collectors.toList());
		return contacts;
	}

	@Override
	public Contact getContactById(Integer cid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateContact(Contact c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteContact(Integer cid) {
		// TODO Auto-generated method stub
		return false;
	}

}
