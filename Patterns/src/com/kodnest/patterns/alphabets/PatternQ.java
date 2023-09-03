package com.kodnest.patterns.alphabets;

public class PatternQ {

	public static void main(String[] args) {
		int n=16;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j==1&&i<n/2||i==n/2&&j<=n/2||j==n/2&&i<=n/2||i==1&&j<=n/2||i==j&&i<=n-2&&i>3&&i<n-3)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
