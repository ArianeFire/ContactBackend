package com.ensao.mobilecloud.contact.application.test;

import java.util.UUID;

import com.ensao.mobilecloud.contact.repository.Contact;
import com.ensao.mobilecloud.contact.repository.Video;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
*
 * @author Seydou Berthe
 *
 */
public class TestData {

	private static final ObjectMapper objectMapper = new ObjectMapper();
	

	public static Contact randomContact() {
	
		Contact contact = new Contact();
		contact.setNom("Seydou One");
		contact.setEmail("seydouone100@gmail.com");
		contact.setAddress("Silicon Valley Great Developper");
		contact.setPhone("Private lo!");
		return contact;
	}
	
	public static String toJson(Object o) throws Exception{
		return objectMapper.writeValueAsString(o);
	}
}
