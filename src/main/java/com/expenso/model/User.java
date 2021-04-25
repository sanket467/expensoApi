package com.expenso.model;
import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
	
	@JsonProperty("uid")
	private String uid;
	
	@JsonProperty("uname")
	private String uname;
	
	@JsonProperty("password")
	private String password;
	
	@JsonProperty("fname")
	private String fname;
	
	@JsonProperty("lname")
	private String lname;
	
	@JsonProperty("contact")
	private String contact;
	
	@JsonProperty
	private String email;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", password=" + password + ", fname=" + fname + ", lname="
				+ lname + ", contact=" + contact + ", email=" + email + "]";
	}
	
	
}
