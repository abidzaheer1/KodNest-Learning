package com.kodnest.patterns.alphabets;

public class PatternV {

	public static void main(String[] args) {
		int n=14;
		for(int i=2;i<=n-2;i++) {
			for(int j=1;j<=n;j++) {
				if(i==j&&j<=n/2||j+i==n+1&&i<=n/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
