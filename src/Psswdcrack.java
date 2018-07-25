import java.util.Scanner; //Imports a scanner so a user can input data
/**
* The PasswordCrack program implements an application that
* simply cracks an inputed password displaying it to the standard output.
*
* @author  Armaan Syed 
* @version 1.0
* @since   2018-07-21 
*/
public class Psswdcrack {
	public static void main(String[] args) {
	
	Scanner input = new Scanner( System.in ); //Sets up scanner to take in user input 
	System.out.println("Enter a 8 digit password:"); //Prints 
	
	int password = Integer.parseInt(input.next( )); //Takes in user inputted password 
	
	final long startTime = System.nanoTime(); //Records program start time
	
	for (int i=0; i<=999999999; i++){ //Loops through numbers 0 to 999,999,999
		if (i == password){ //Determines whether a number in the loop is the same as the inputted password 
			final long duration = (System.nanoTime() - startTime); //Records program end time
			System.out.println("Your password was " + i + ". It took " + duration + " nanoseconds to find."); //Prints password and how long it took to determine password
		}
		
	}
}
}
