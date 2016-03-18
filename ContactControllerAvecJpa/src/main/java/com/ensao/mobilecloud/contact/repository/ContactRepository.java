package com.ensao.mobilecloud.contact.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//Annotation allowing to consider this class as Repository
@Repository
public interface ContactRepository extends CrudRepository<Contact, Long> {
	
	
}
