package com.kodnest.patterns.alphabets;

public class PatternN {

	public static void main(String[] args) {
		int n=14;
		for(int i=2;i<=n-1;i++) {
			for(int j=1;j<=n;j++) {
				if(j==1||j==n||i==j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
