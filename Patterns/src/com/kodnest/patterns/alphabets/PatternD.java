package com.kodnest.patterns.alphabets;

public class PatternD {

	public static void main(String[] args) {
		int n=10;
		for(int i=2;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j==1||i==j&&j<7||(i+j==12)&&(j<7))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	

	}

}
