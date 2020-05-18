package com.dome.source;

import java.io.IOException;
import java.util.Scanner;
import com.dome.utility.Crm;
import com.dome.utility.Inventory;
import com.dome.utility.Sales;
/*
* @Title: Erp.java 
* @Package com.dome.source 
* @Description: Main Program
 */
public class Erp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in); // Create a Scanner object
		System.out.println("Welcome to DOME ERP \nKindly choose any one from the below options:");
		System.out.println("1 : Inventory\n2 : CRM\n3 : Sales ");

		int choice = input.nextInt();
		switch (choice) {
		case 1:									// User select Inventory
			Inventory invObj = new Inventory(); //creating an obj for Inventory
			invObj.newProductAdd();
			break;

		case 2: 								//User select CRM
			Crm crmObj = new Crm();				//creating an obj for CRM
			crmObj.display();
			break;

		case 3:
			Sales.ReadSalesReport saleObj = new Sales.ReadSalesReport(); //creating an obj for Sales
			saleObj.showSalesRecord();
			break;

		default:
			System.out.println("Not a valid selection!");

		}
		input.close();						//closing the scanner class object
		

	}

}
