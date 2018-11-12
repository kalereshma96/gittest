package com.bridgelabz.functionalprograms;

//import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Utility utility = new Utility();
		int year;
		System.out.println("Enter year to check if it is leap year or not:\n");
 
		year=utility.inputInteger();
        
        
        utility.leap(year);
	}

}
