package com.ensao.mobilecloud.contact.repository;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.google.common.base.Objects;


@Entity
public class Contact {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String nom;
	private String email;
	private String address;
	private String phone;
	//private String path;
	//private MultiPart multiPart;
	
	public Contact(){}
	
	public Contact(String nom, String email, String address, String phone){
		super();
		this.nom = nom;
		this.email = email;
		this.address = address;
		this.phone = phone;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/*public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}*/
	
	/*public MultiPart getMultiPart() {
		return multiPart;
	}
	public void setMultiPart(MultiPart multiPart) {
		this.multiPart = multiPart;
	}*/
	
	@Override
	public int hashCode() {
		// Google Guava provides great utilities for hashing
		return Objects.hashCode(nom, email, address, phone);
	}

	/**
	 * Two Videos are considered equal if they have exactly the same values for
	 * their name, url, and duration.
	 * 
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Contact) {
			Contact other = (Contact) obj;
			// Google Guava provides great utilities for equals too!
			return Objects.equal(nom, other.nom)
					&& Objects.equal(email, other.email)
					&& Objects.equal(address, other.address)
					&& Objects.equal(phone, other.phone);
		} else {
			return false;
		}
	}


}
