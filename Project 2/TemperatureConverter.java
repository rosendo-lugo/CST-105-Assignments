import java.util.Scanner;

public class TemperatureConverter {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a Fahrenheit temperature: ");
    int fahrenheit = input.nextInt(); 

    // Convert Fahrenheit to Celsius
    double celsius = (5.0 / 9) * (fahrenheit - 32);
    System.out.println( + fahrenheit + "F is equivalent to " + 
      celsius + " in Celsius");  
  
    System.out.print("Enter a Celsius temperature: ");
	int celsius1 = input.nextInt(); 

    // Convert Celsius to Fahrenheit
    int fehrenheit1 = ((celsius1 * 9/5) + 32);
    System.out.println( + celsius1 + "C is equivalent to " + 
      fehrenheit1 + "F");  
  }
}