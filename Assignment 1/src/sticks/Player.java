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
		int draw = -1;
		if (max < 1)
			max = 1;
		System.out.print("(Enter 0 to quit) How many sticks do you want to draw? Choose 1, 2 or 3: ");
		draw = readInput();
		if (draw < 0 || draw > 3 || draw >= max)
				return -1;
		return draw;
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
