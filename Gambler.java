package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Utility;

public class Gambler {

	public static void main(String[] args) {

		int $stake,$goal;
		

		Utility utility = new Utility();
		
		System.out.println("enter stakes:\n");
		$stake=utility.inputInteger();
		
		System.out.println("enter goals:\n");
		$goal=utility.inputInteger();
		
		
		System.out.println("Enter number of times:\n");
		int noOfTimes=utility.inputInteger();
		
		utility.gambler($stake,$goal,noOfTimes);
		
	}

}
