package com.Kodnest.ControlConstruct.Switch;
import java.util.Scanner;
public class Demo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number between 1-7 to find which day is that");
		int num = scan.nextInt();
		scan.close();
		switch(num)
		{
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default:
				System.out.println("Idiot... check it again and enter correct number");
		}
	}
}