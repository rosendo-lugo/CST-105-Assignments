import java.util.Scanner;

public class Programming_Exercise_2 {

	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		int fivedigit, number1, number2, number3, number4, number5;
		
		//Prompt the user to enter 5-digits 
	    System.out.print("Please enter a 5-digit positive integer: "); 
        fivedigit = input.nextInt();
    
		number1 = (fivedigit % 100000) / 10000;
		number2 = (fivedigit % 10000) / 1000;	
		number3 = (fivedigit % 1000) / 100;	
		number4 = (fivedigit % 100) / 10;		
		number5 = (fivedigit % 10);

    
	    // Compute sum
	    int sum = (number1 + number2 + number3 + number4 + number5);
	    
	    // Display result
	    System.out.println("The sum of the digits is " + number1 + " + " + number2
	      + " + " + number3 + " + " + number4 + " + " + number5 + " = " + sum);
	    
	    	}
}
