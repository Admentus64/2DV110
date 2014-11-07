package sticks.complete;

public class Main {
	
	public static void main(String[] args) {
		
		runManual();
		
	}
	
	public static void runManual() {
		
		//Manual testing, requires input
		Player human = new Player();
		Player pc = new Player();
		StickList sticks = new StickList();
		for (int i=0; i<30; i++)
			sticks.add(new Stick());
				
		Game game = new Game(sticks, human, pc);
		while (game.play()) { }
		
	}
	
	public static void runAutomatically() {
		
		//Run the program without need for input, for testing purposes. Does not run the program in sequence.
		
	}
		
}