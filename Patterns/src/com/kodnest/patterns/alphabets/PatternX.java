package com.kodnest.patterns.alphabets;

public class PatternX {

	public static void main(String[] args) {
		int n = 11;
		for(int i=1;i<n;i++) {
			for(int j=1;j<=n;j++) {
				if(j==i||i+j==n)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
