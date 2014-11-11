package sticks;
import sticks.Stick;
import sticks.StickList;

/*
 * This class is excluded from testing.
 */
public class Main {
	
	public static void main(String[] args) {
		
		runManual();
		
	}
	
	public static void runManual() {
		
		//Manual testing, requires input
		StickList sticks = new StickList();
		for (int i=0; i<30; i++)
			sticks.add(new Stick());
		
	}
	
	public static void runAutomatically() {
		
		//Run the program without need for input, for testing purposes. Does not run the program in sequence.
		
	}
		
}
