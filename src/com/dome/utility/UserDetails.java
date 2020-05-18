package com.dome.utility;
/*
* @Title: UserDetails.java 
* @Package com.dome.utility 
* @Description: CRM class handles all the complains from the user and assigns issue number.
* @Topic: Overriding, Encapsulation and Inheritance
 */
public class UserDetails {
	
	   private String name;
	   private String idNum;
	   
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIdNum() {
		return idNum;
	}
	public void setIdNum(String idNum) {
		this.idNum = idNum;
	}
	
	public void display(){
		System.out.println("Display Method!");
	}

}
