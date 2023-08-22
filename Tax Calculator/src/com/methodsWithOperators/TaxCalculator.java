package com.methodsWithOperators;

import java.util.Scanner;

public class TaxCalculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the purchase amount :");
		int purchaseAmount = scan.nextInt();
		System.out.println("Enter the tax rate (in decimal form");
		double taxRate = scan.nextDouble();
		System.out.println("Total cost including tax: "+calculateTotalWithTaxdoubles(purchaseAmount, taxRate));
		scan.close();
	}
	public static double calculateTotalWithTaxdoubles ( double purchaseAmount , double taxRate) {
		return purchaseAmount+= purchaseAmount*taxRate;
	}

}
