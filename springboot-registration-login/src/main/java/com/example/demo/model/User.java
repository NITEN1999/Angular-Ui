package com.example.demo.model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "user", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class User {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
   private Long id;
	
	
	@Column(name = "first name")
   private String firstname;
	
	@Column(name = "lasr name")
   private String lastname;
   private String password;
   private String email;
   private Integer phonenumber;
 public User(String firstname, String lastname, String password, String email, Integer phonenumber) {
	super();
	this.firstname = firstname;
	this.lastname = lastname;
	this.password = password;
	this.email = email;
	this.phonenumber = phonenumber;
}
 public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
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
