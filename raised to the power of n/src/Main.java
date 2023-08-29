import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a number");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		System.out.println("enter a power");
		int n = scan.nextInt();
		PowerOfN ob = new PowerOfN();
		System.out.println(ob.power(a, n));
	}

}
