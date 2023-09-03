package com.kodnest.patterns.complex;

public class Demo1 {

	public static void main(String[] args) {
		
		for(int i=1;i<=11;i++) {
			for(int j=1;j<=17;j++) {
				if((i==1&&j<8)||(i==6&&j<8)||(j==1&&i<7)||(j==8&&i<7)||(j==10&&i>=6)||(i==6&&j>10)||(j==17&&i>=6)||(i==11&&j>9))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}


	}

}
