package com.ensao.mobilecloud.contact.client;

import java.util.Collection;

import com.ensao.mobilecloud.contact.repository.Contact;

import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.PUT;

public interface ContactSvcApi {
	
	static final String CONTACT_PATH="/contacts";
	static final String CONTACT_ADD = "/add";
	
	@GET(CONTACT_PATH)
	public Collection<Contact> getContactList();
	
	@POST(CONTACT_PATH)
	public boolean addContact(@Body Contact c);

}
