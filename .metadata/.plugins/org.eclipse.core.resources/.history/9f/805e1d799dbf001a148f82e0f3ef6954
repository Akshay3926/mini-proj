package com.Akshay.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.Akshay.dto.Contact;
import com.Akshay.entity.ContactEntity;
import com.Akshay.service.ContactService;

@Controller
public class ContactController {

	@Autowired
	private ContactService contactService;

	@GetMapping(value= {"/","/addContact"})
	public String loadForm(Model model) {
		Contact c =new Contact();
		model.addAttribute("contact",c);
		return "contactInfo";   
	}

	@PostMapping(value="/saveContact")
	public String handleSubmitBtn(@ModelAttribute("contact") Contact c,Model model) {
		boolean isSaved=contactService.saveContact(c);
		if(isSaved) {
			model.addAttribute("succMsg","contact saved");
			
		}else {
			model.addAttribute("errMsg","contact failed "); 
		}
		
		return "contactInfo";
	}
	
	@GetMapping("/viewContacts")
	public String handleViewContacts(Model model) {
		List<Contact> contacts=contactService.getAllContacts();
		model.addAttribute("contacts",contacts);
		return "viewContacts";
	}
}
