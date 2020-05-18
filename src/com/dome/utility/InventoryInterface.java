package com.dome.utility;

import java.util.HashMap;
/*
* @Title: InventoryInterface.java
* @Package com.dome.utility 
* @Description: Interface, which is giving a blueprint to the Inventory class.
* @Topic:Collections Interface
 */
public interface InventoryInterface {
	abstract void newProductAdd();
	abstract void veiwProduct(HashMap<String, String> map);
	
	
}
