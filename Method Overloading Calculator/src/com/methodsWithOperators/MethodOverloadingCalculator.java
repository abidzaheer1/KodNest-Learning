package com.methodsWithOperators;

import java.util.Scanner;

public class MethodOverloadingCalculator {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = scan.nextInt();
        
        System.out.println("Enter the second number: ");
        int b = scan.nextInt();
      
        System.out.println("Enter the operator (+, -, *, /): ");
        char c = scan.next().charAt(0);
        scan.close();
        switch(c) {
        case '+' : System.out.println("Result: "+calculate(a, b));
        break;
        case '-' : System.out.println("Result: "+ calculate(a, (double)b ));
        break;
        case '*' :System.out.println("Result: "+ calculate((double)a,b));
        break;
        case '/' : System.out.println("Result: "+ calculate((double)a,(double)b));
        }
        

	}
	public static int calculate(int a , int b) {
		return a+b;
	}
	public static double calculate(int a , double b) {
		return a-b;
	}
	public static double calculate( double a, int b ) {
		return a*b;
	}
	public static double calculate( double a, double b ) {
		return a/b;
	
	}
	
	

}
