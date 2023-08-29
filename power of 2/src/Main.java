import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a number");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		PowerCalc ob = new PowerCalc();
		ob.powerCal(a);

	}

}
