package com.javahelps.restservice.entity;

import java.util.Objects;
import javax.persistence.Entity; //JPA ANNOTATION
import javax.persistence.Id;

@Entity
public class User {

private static final boolean InstanceOf = false;
@Id
private String username;
private String password;
private String name;
private String email;

public String getUsername() {
	return username; }

public void setUsername(String username) {
	this.username = username;}

public String getPassword() {
	return password; }

public void setPassword(String password) {
	this.password = password;}

public String getName() {
	return name;}

public void setName(String name) {	this.name = name;}

public String getEmail() {
	return email;}

public void setEmail(String email) {
	this.email = email;}

@Override
public boolean equals(Object O) {
	if(this==O)
		return true;
	if(!(O instanceof User))
		return false;
	User user=(User)O; 
	return Objects.equals(this.username, username) && Objects.equals(this.password, password) && Objects.equals(this.name, name) && Objects.equals(this.email, email);}
@Override
public String toString() {
	return "User{" + "username='" + username + '\'' + ", password='" + password + '\'' + ", name='" + name + '\'' + ", email='" + email + '\'' + '}';}
}
