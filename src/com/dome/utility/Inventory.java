package com.dome.utility;

import java.util.HashMap;
import java.util.Scanner;

/*
* @Title: Inventory.java 
* @Package com.dome.utility 
* @Description: Saving the details of newly created products.
* @Topic:Collections (HashMap), Interface
 */
public class Inventory implements InventoryInterface {

	public void newProductAdd() {
		// TODO Auto-generated method stub
		String pCode, pName, pDom;
		
		HashMap<String, String> map = new HashMap<String, String>(); //Creating a HashMap object
		Scanner input = new Scanner(System.in); //Creating a Scanner object
		
		System.out.println("Product Code: ");
		pCode = input.nextLine();

		System.out.println("Product Name: ");
		pName = input.nextLine();

		System.out.println("Date of Manufacturing: ");
		pDom = input.nextLine();

		map.put("Product Code", pCode);
		map.put("Date of Manufacturing", pDom);
		map.put("Product Name", pName);

		veiwProduct(map); //calling function
		input.close();

	}

	
	public void veiwProduct(HashMap<String, String> map) {
		// TODO Auto-generated method stub
		System.out.println("**********Product Detail**********");
		System.out.println(map);
	
	}

}
