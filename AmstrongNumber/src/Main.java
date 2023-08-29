import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number to find amstrong number");
	int a = scan.nextInt();
	AmstrongNumber ob = new AmstrongNumber();
	int cal = ob.amsCal(a);
	if(cal==a){
		System.out.println("Given number is Amstrong Number");
	}
	else
		System.out.println("Given number is Not an Amstrong Number");
	scan.close();
}
}
