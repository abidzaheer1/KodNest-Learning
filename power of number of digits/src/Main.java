import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		Power power = new Power();
		
		System.out.println("powerd with digits : "+power.p(a));

	}

}
