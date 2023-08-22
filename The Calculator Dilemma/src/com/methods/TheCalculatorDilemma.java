package com.methods;

import java.util.Scanner;

public class TheCalculatorDilemma {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter two number for calculation");
		int a = scan.nextInt(), b = scan.nextInt();
	    System.out.println("Enter the type of operation to perform \n type: \n 1 for additon \n 2 for substraction \n 3 for multiplication \n 4 for division \n 6 for reminder \n");
	    int c = scan.nextInt();
	    cal(a,b,c);
	}
	public static void cal(int a,int b , int c) {
		switch(c) {
		case 1 : System.out.println("ans: "+(a+b));
		break;
		case 2 : System.out.println("ans: "+(a-b));
		break;
		case 3 : System.out.println("ans: "+(a*b));
		break;
		case 4 : System.out.println("ans: "+(a/b));
		break;
		case 5 : System.out.println("ans: "+(a%b));
		break;
		default : System.out.println("invalid input");
		}
	}

}
