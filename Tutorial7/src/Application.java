import java.util.Scanner;

public class Application {
	public static void main(String[] args) {

	
		// Create scanner object
		Scanner input = new Scanner(System.in);
		// Output the prompt
		System.out.println("Enter a floating point value:  ");
		
		// Wait for the user to  enter a  line
		double value = input.nextDouble();
		
		System.out.println("Enter next integer: ");
		
		int i = input.nextInt();
		
	
		//Tell them what they entered
		System.out.println("You entered: " + value + " Integer is: " + i);
	}

}
