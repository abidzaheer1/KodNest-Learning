package com.kodnest.patterns.alphabets;

public class PatternT {

	public static void main(String[] args) {
		int n=10;
		for(int i=1;i<=n/2;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1||j==n/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
