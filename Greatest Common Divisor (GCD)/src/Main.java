import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
//		System.out.println("enter 2 number");
		int a = scan.nextInt(),b= scan.nextInt();
		findGCD(a, b);
		scan.close();

	}
	public static void findGCD(int a, int b)

	{
		
		while(b!=0) {
		int rem= a%b;
		 a=b;
		 b=rem;
		 
		}
		System.out.println(a);

	}

}
