package com.Question2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array length ");
		int arr[] = new int[scan.nextInt()];
		System.out.println("Enter array elements");
		for(int i =0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();	
		}
		PrintArray obj = new PrintArray();
		obj.printArray(arr);
	}

}
