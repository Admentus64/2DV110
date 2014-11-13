package sticks;
import java.util.Scanner;

/*
 * TODO
 * Include with Code Coverage.
 */
public class Player {
	
	public Player() {
	}
	
	public int drawSticks(int max) {
		int number = -1;
		while (number < 0) {
			System.out.print("(Enter 0 to quit) How many sticks do you want to draw? Choose 1, 2 or 3: ");
			number = readInput();
			if (number >= 1 && number <= 3)
				if (number > max)
				number = -1;
		}
		return number;
	}
    
    private int readInput() {
    	Scanner scan = new Scanner(System.in);
    	try	{ return scan.nextInt(); }
    	catch(Exception e) {
    		System.err.println("Error with input, try again please.");
    		return -1;
    	}
    }
    
}
