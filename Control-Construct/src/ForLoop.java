import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Weather is good?");
		String weather = scan.next();
		if(weather.equals("yes")) {
			System.out.println("is your frnd comming");
			String coming=scan.next();
			if(coming.equals("yes")) {
				System.out.println("go out");
			}
		}
		scan.close();
	}

}
