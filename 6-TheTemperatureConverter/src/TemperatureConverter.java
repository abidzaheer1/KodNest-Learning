import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] args) {
		TemperatureConverter obj = new TemperatureConverter();
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("enter the temp in fahrenheit to convert in Celsius");
		double fahrenheit = scan.nextDouble();
;		
		System.out.println( "in Celsius: "+obj.convertFahrenheitToCelsius(fahrenheit));
		
		
 
	}
	public double convertFahrenheitToCelsius(double fahrenheit)
	{
		return (fahrenheit - 32) * 5/9;
	}

}
