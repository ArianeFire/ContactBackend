package com.ensao.mobilecloud.controller.test;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.ensao.mobilecloud.contact.application.test.TestData;
import com.ensao.mobilecloud.contact.controller.ContactSvc;
import com.ensao.mobilecloud.contact.repository.Contact;
import com.ensao.mobilecloud.contact.repository.ContactRepository;

public class ContactSvcTest {
	
	@Mock
	private ContactRepository contactRepository;

	// Automatically inject the mock ContactRepository into the ContactSvc
	// object
	@InjectMocks
	private ContactSvc contactService;

	private Contact contact = TestData.randomContact();

	@Before
	public void setUp() {
		// Process mock annotations and inject the mock ContactRepository
		// into the ContactSvc object
		MockitoAnnotations.initMocks(this);

		// Tell the mock ContactRepository to always return the random Contact
		// object that we create above when its getContactList() method is called
		when(contactRepository.findAll()).thenReturn(Arrays.asList(contact));
	}
	
	
	// Yes, this test doesn't do much because ContactSvc is
	// essentially delegating to ContactRepository. The goal is to
	// provide a simple example of testing controllers with mock
	// objects and dependency injection.
	@Test
	public void testVideoAddAndList() throws Exception {

		// Ensure that calling addContact works
		boolean ok = contactService.addContact(contact);
		assertTrue(ok);

		// Make sure that the Contact we added is in the list
		Collection<Contact> contacts = contactService.getContactList();
		assertTrue(contacts.contains(contact));
	}


}
