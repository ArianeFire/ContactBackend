package com.ensao.mobilecloud.integration.test;

import static org.junit.Assert.assertTrue;

import java.util.Collection;

import org.junit.Test;

import com.ensao.mobilecloud.contact.application.test.TestData;
import com.ensao.mobilecloud.contact.client.ContactSvcApi;
import com.ensao.mobilecloud.contact.repository.Contact;

import retrofit.RestAdapter;
import retrofit.RestAdapter.LogLevel;

public class ContactSvcClientApiTest {

	private final String TEST_URL = "http://localhost:8080";

	private ContactSvcApi contactService = 
			new RestAdapter.Builder()
			.setEndpoint(TEST_URL)
			.setLogLevel(LogLevel.FULL).build()
			.create(ContactSvcApi.class);

	private Contact contact = TestData.randomContact();
	
	@Test
	public void testContactAddAndList() throws Exception {
		
		// Add the Contact
		boolean ok = contactService.addContact(contact);
		assertTrue(ok);

		// We should get back the contact that we added above
		//Collection<Contact> contacts = contactService.getContactList();
		//assertTrue(contacts.contains(contact));
	}

	
	
}
