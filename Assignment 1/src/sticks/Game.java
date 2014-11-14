package sticks;

public class Game {
	
	private StickList list;
	private Player player;
	private AI ai;
	
	public Game(StickList list, Player player, AI ai) {
		this.list = list;
		this.player = player;
		this.ai = ai;
	}
	
	public boolean play() {
		int input = -1;
		while (!isValidDraw(input, 0, 3))
			input = player.drawSticks(list.unused());
		if (input == 0)
			return false;
		removeSticks(input);
		if (checkEndOfGame())
			return false;
		removeSticks(ai.drawSticks(list.unused()));
		if (checkEndOfGame())
			return false;
		printSticks();
		return true;
	}
	
	
	
	private boolean isValidDraw(int value, int min, int max) {
		return value >= min && value <= max;
	}
	
	private void removeSticks(int number) {
		for (int i=0; i<number; i++)
			list.use();
	}
	
	private boolean checkEndOfGame() {
		if (list.unused() == 0) {
			printSticks();
			return true;
		}
		return false;
	}
	
	private void printSticks() {
		System.out.print("Sticks remaining: " + list.toString() + "   (" + list.unused() +")");
		for (int i=0; i<2; i++)
			System.out.println();
	}
	
}
