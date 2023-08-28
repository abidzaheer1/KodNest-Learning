import java.util.Scanner;

public class Main {
	public static void calculateSumOfDigits(int n)

	{
		int sum = 0;
		while(n>0) {
			int lastD = n%10;
			sum = sum+lastD;
			n = n/10;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("eneter a num");
		int num = scan.nextInt();
		calculateSumOfDigits(num);
		scan.close();

	}

}
