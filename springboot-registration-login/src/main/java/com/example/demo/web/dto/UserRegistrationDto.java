package com.example.demo.web.dto;

public class UserRegistrationDto {
 private String firstname;
 private String lastname;
 private String password;
 private String email;
 private Integer phonenumber;
 UserRegistrationDto(){
	 
 }
 
 
 
public UserRegistrationDto(String firstname, String lastname, String password, String email, Integer phonenumber) {
	super();
	this.firstname = firstname;
	this.lastname = lastname;
	this.password = password;
	this.email = email;
	this.phonenumber = phonenumber;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Integer getPhonenumber() {
	return phonenumber;
}
public void setPhonenumber(Integer phonenumber) {
	this.phonenumber = phonenumber;
}
}
