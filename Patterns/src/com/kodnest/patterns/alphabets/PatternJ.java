package com.kodnest.patterns.alphabets;

public class PatternJ {

	public static void main(String[] args) {
		int n=6;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j==n/2||i==n&&j<n/2||i==1||j==1&&i>n/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
