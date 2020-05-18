package com.dome.utility;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
/*
* @Title: Sales.java 
* @Package com.dome.utility 
* @Description: Sales class fetches the past sales data text file and prints in console.
* @Topic: Static Inner class, Exception Handling and File Handling
 */
public class Sales {

	public static class ReadSalesReport { 									//Static Inner class
		public void showSalesRecord() throws IOException {
			FileInputStream fstream = new FileInputStream("./SupportDocuments/Sales.txt");	//FileInputStream class object
			BufferedReader br = new BufferedReader(new InputStreamReader(fstream));			//Buffer class object
			try {
				
				String strLine;
				while ((strLine = br.readLine()) != null) {
					System.out.println(strLine);
				}

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				br.close();
				fstream.close();
			}
		}
	}

}
