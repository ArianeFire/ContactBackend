package com.ensao.mobilecloud.contact.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ensao.mobilecloud.contact.client.ContactSvcApi;
import com.ensao.mobilecloud.contact.repository.Contact;
import com.ensao.mobilecloud.contact.repository.ContactRepository;
import com.google.common.collect.Lists;

@Controller
public class ContactSvc implements ContactSvcApi{
	
	private static final String CONTACT_PATH="/contacts";
	private static final String CONTACT_ADD="/add";
	//private ContactDao dao = new ContactDaoImpl();
	
	//Injection du depot par Injection 
	@Autowired
	private ContactRepository contacts;
	
	
	@RequestMapping(value=CONTACT_PATH, method=RequestMethod.GET)
	public @ResponseBody Collection<Contact> getContactList() {
		// TODO Auto-generated method stub
		return Lists.newArrayList(contacts.findAll());
	}

	@RequestMapping(value=CONTACT_PATH, method=RequestMethod.POST)
	public @ResponseBody boolean addContact(@RequestBody Contact c) {
		// TODO Auto-generated method stub
		contacts.save(c);
		return true;
	}

}
