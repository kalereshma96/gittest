package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	               	Utility utility = new Utility();
                    System.out.println("enter number:");
					Scanner scan=new Scanner(System.in);
					int n=scan.nextInt();
					scan.close();
					utility.prime(n);
	            				
	}
	}


