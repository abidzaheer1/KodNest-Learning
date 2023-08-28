package kodjuly;

import java.util.Scanner;

public class StringJoiner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("enter the first name and last name");
		String str1= scan.next();
//		scan.next();
//		System.out.println("enter last name");
		String str2= scan.next();
		System.out.println("your full name is : "+joinStrings(str1, str2));
		

	}
	public static String joinStrings(String str1, String str2) {
		return str1+" "+str2;
	}

}
