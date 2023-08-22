package com.methodsWithoperators;

import java.util.Scanner;

public class LogicalOperatorValidator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Is input valid (true/false): ");
		boolean inputValid = scan.nextBoolean();
		System.out.println("Does input meet a certain condition (true/false):");
		boolean condition = scan.nextBoolean();
	
		
		boolean result = isValidInput(inputValid, condition);
//		System.out.println(result);
		if(result==true){
			System.out.println("Input is valid.");
		}
		  else {
			System.out.println("Input is Invalid.");
		}	

	}
	public static boolean isValidInput(boolean inputValid , boolean condition) {
		return (inputValid && condition);
	}
			

}
