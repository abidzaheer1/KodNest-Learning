package com.newQuestion;

import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
		System.out.println("enter a num");
		int n = scan.nextInt();
		printFibonacciSeries(n);
		scan.close();
	
}
 public static void printFibonacciSeries(int n){
		int n1 = 0,n2 = 1;
			 if(n==1) {
				 System.out.println(n1);
			 }
			 else if (n==2) {
				 System.out.print(n2);
				 
			 }
			 else {
				 int n3;
//				 System.out.print(n1+" "+n2);
				 for(int i=3;i<=n;i++) {
					  n3 = n1+n2;
					 n1=n2;
					 n2=n3;
				   if (i==n) {
					   System.out.print(n3);
					   
				   }
					}
			 }

	}
}
