package sticks;
import java.util.Scanner;

/*
 * Include with Code Coverage.
 */
public class Player {
	
	private Scanner scan;

	public int drawSticks(int max) {
		System.out.print("(Enter 0 to quit) How many sticks do you want to draw? Choose 1, 2 or 3: ");
		int draw = readInput();
		if (draw < 0 || draw > 3 || draw >= max)
				return -1;
		return draw;
	}
    
    private int readInput() {
    	scan = new Scanner(System.in);
    	try	{ return scan.nextInt(); }
    	catch(Exception e) {
    		System.err.println("Error with input, try again please.");
    		return -1;
    	}
    }
    
}
