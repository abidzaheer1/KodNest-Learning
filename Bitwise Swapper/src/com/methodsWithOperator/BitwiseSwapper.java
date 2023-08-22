package com.methodsWithOperator;

import java.util.Scanner;

public class BitwiseSwapper {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first integer: ");
		int firstInt = scan.nextInt();
		System.out.println("Enter the second integer: ");
		int SecoundInt = scan.nextInt();
		swapUsingBitwise(firstInt, SecoundInt);
		
	}
	public static void swapUsingBitwise(int x , int y) {
		 x = x ^ y;
		 y = x ^ y;
		 x = x ^ y;
		 System.out.println("After swapping: First = "+ x+", Second = 5"+y);
		
	}

}
