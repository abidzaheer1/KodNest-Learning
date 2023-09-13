package com.Question1;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array length ");
		int arr[] = new int[scan.nextInt()];
		System.out.println("Enter array elements");
		for(int i =0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();	
		}
		System.out.println("Enter two indexes");
		int FrstIndex= scan.nextInt(), scndIndex = scan.nextInt();
		System.out.println("Before swapping");
		System.out.print("Arr--> ");
		for(int i =0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
		int c=arr[FrstIndex-1];
		arr[FrstIndex-1]=arr[scndIndex-1];
		arr[scndIndex-1]=c;
		System.out.println();
		System.out.println("After swapping");
		System.out.print("Arr--> ");
		for(int i =0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
		scan.close();
	}

}
