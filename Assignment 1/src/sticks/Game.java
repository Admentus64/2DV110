package sticks;

public class Game {
	
	private StickList list;
	private Player player;
	private AI ai;
	private boolean done;
	
	public Game(StickList list, Player player, AI ai) {
		this.list = list;
		this.player = player;
		this.ai = ai;
		done = false;
	}
	
	public void restart() {
		if (done) {
			done = false;
			list.reset();
		}
	}
	
	public void play() {
		if (done)
			return;
		int input = player.draw();
		if (!isValidDraw(input, 0, 3))
			return;
		if (input == 0) {
			System.out.println("Player ended game before it was finished.");
			done = true;
			return;
		}
			
		
		removeSticks(input);
		if (checkEndOfGame(true))
			return;
		
		removeSticks(ai.runAI(list.unused()));
		if (checkEndOfGame(false))
			return;
		
		printSticks();
	}
	
	public StickList getStickList()			{ return list; }
	public boolean isDone()					{ return done; }
	public Player getPlayer()				{ return player; }
	
	
	private boolean isValidDraw(int value, int min, int max) {
		return (value >= min && value <= max && value < list.unused());
	}
	
	private void removeSticks(int number) {
		for (int i=0; i<number; i++)
			list.use();
	}
	
	private boolean checkEndOfGame(boolean playerInput) {
		if (list.unused() == 1) {
			printSticks();
			done = true;
			if (!playerInput)
				System.out.println("Player loses, AI wins!");
			else System.out.println("Player wins, AI loses!");
		}
		return done;
	}
	
	private void printSticks() {
		System.out.print("Sticks remaining: " + list.toString() + "   (" + list.unused() +")");
		for (int i=0; i<2; i++)
			System.out.println();
	}
	
}
