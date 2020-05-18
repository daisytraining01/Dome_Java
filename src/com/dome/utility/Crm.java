package com.dome.utility;

import java.util.Random;
import java.util.Scanner;

/*
* @Title: Crm.java 
* @Package com.dome.utility 
* @Description: CRM class handles all the complains from the user and assigns issue number.
* @Topic: Constructor,Nested If,Method overloading, Encapsulation and Inheritance
 */
public class Crm extends UserDetails {

	public Crm() {															// Constructor
		// TODO Auto-generated method stub
		String name, idNum;
		System.out.println("Type of issues encountered !!\n1 : Manufacturing\n2 : Delivery");
		UserDetails userObj = new UserDetails();
		Scanner input = new Scanner(System.in); 							// Create a Scanner object
		int choice = input.nextInt();

		if (choice == 1) {													//Nested If

			System.out.println("Manufacturing Issue\n");
			System.out.println("Please enter User Name: ");
			name = input.next();
			userObj.setName(name);											//Setter method
			System.out.println("Please enter User ID: ");
			idNum = input.next();
			userObj.setIdNum(idNum);
			String getName, getId;
			getName = userObj.getName();									//getter method
			getId = userObj.getIdNum();
			display(getName, getId);

		}

		else if (choice == 2) {

			System.out.println("Delivery Issue\n");
			System.out.println("Please enter User Name: ");
			name = input.next();
			userObj.setName(name);
			System.out.println("Please enter User ID: ");
			idNum = input.next();
			userObj.setIdNum(idNum);

		} else {
			System.out.println("Not a valid selection!");
		}

		input.close();

	}

	public void display(String getName, String getIdNum) {				

		System.out.println("User details");
		System.out.println("Name : " + getName);
		System.out.println("ID : " + getIdNum);

	}

	public void display() {													//method overloading

		Random rand = new Random();
		System.out.println("Complain Number: " + rand.nextInt());
	}

}
