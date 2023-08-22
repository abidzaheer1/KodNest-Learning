package com.methods;

import java.util.Scanner;

public class TemperatureConversion {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Temperature Conversion Tool!");
        System.out.println("Select an option:\r\n 1. Convert Celsius to Fahrenheit\r\n 2. Convert Fahrenheit to Celsius\r\n Enter your choice:");
	    int option = scan.nextInt();
	    if(option==1) {
	    	System.out.println("Enter the temperature in Celsius: ");
	    	double celsius = scan.nextDouble();
	    	celsiusToFahrenheit(celsius);
	    }
	    else if (option == 2) {
	    	System.out.println("Enter the temperature in Fahrenheit: ");
	    	double fahrenhiet = scan.nextDouble();
	    	fahrenheitToCelsius(fahrenhiet);
	    	
	    }
	    scan.close();
	}
	public static void celsiusToFahrenheit(double celsius){
		System.out.println(celsius+"°C is equivalent to"+((celsius*9/5) + 32)+"°F");
		
	}
	public static void fahrenheitToCelsius(double fahrenhiet) {
		System.out.println(fahrenhiet+"2°F is equivalent to"+((fahrenhiet - 32)*5/9)+"°C");
	}
	

}
