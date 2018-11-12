package com.bridgelabz.utility;

import java.util.Scanner;

public class Utility {

	Scanner scanner = new Scanner(System.in);
	
	/**
	 * This method takes an input string from the user and returns
	 * it to the specified method. 
	 * 
	 * @return String: the input string given by the user
	 */
	public String inputString() {
		return scanner.next();
	}
	
	/**
	 * This method takes an input string from the user and returns
	 * it to the specified method. 
	 * 
	 * @return String: the input string given by the user
	 */
	public Integer inputInteger() {
		return scanner.nextInt();
	}
	
	
	/**
	 * This method replaces the template with the given input string
	 * 
	 * @param template the string which needs to be modified
	 * @param userName the input string given by the user
	 * @return output the modified string
	 */
	public String replaceString(String template, String userName) {
		if (userName.length() < 3)
			return "Please input name with more than 3 characters";
		else {
			String output = template.replace("<<UserName>>", userName);
			return output;
		}
	}
}
