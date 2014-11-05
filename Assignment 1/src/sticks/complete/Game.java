package sticks.complete;
import java.io.IOException;
import java.util.Scanner;
import java.util.Random;

public class Game {
	
	private StickList sticks;
	private Player human;
	private Player pc;
	private Scanner scan = new Scanner(System.in);
	private Random random = new Random();
	
	public Game(StickList sticks, Player human, Player pc) {
		this.sticks = sticks;
		this.human = human;
		this.pc = pc;
	}
	
	public int remaining()		{ return sticks.size(); }
	public Player human()		{ return human; }
	public Player pc()			{ return pc; }
	
	public boolean play() {
		
		removeSticks(askDrawHuman());
		if (checkLose("human")) {
			drawSticks();
			return false;
		}
		removeSticks(calculateDrawPC());
		if (checkLose("pc")) {
			drawSticks();
			return false;
		}
		
		drawSticks();
		return true;
		
	}
	
	private void drawSticks() {
		
		System.out.print("Sticks remaining: ");
		for (int i=0; i<remaining(); i++)
			System.out.print(sticks.get(i).toString());
		System.out.println("   (" + sticks.activeSticks() +")");
		for (int i=0; i<2; i++)
			System.out.println();
		
	}
	
	private int askDrawHuman() {
		
		int output = 0;
		while (!isValidInputRange(output, 1, 3)) {
			System.out.print("How many sticks do you want to draw? Choose 1, 2 or 3: ");
			output = scan.nextInt();
			if (!isValidInputRange(output, 1, 3))
				System.out.println("Invalid input, please try again.");
			if (validSticksRemaining(output)) {
				output = 0;
				System.out.println("Can not remove that many sticks, please try again.");
			}
		}
		return output;
		
	}
	
	private boolean validSticksRemaining(int input) {
		
		if (input < sticks.activeSticks())
			return false;
		return true;
		
	}
	
	private boolean isValidInputRange(int i, int min, int max) {
		
		if (i >= min && i<= max)
			return true;
		else return false;
		
	}
	
	private void removeSticks(int number) {
		
		for (int i=0; i<number; i++)
			sticks.setInactive(sticks.activeSticks()-1);
		
	}
	
	private int calculateDrawPC() {
		
		int draw = 0;
		switch(sticks.activeSticks()) {
			case 1:
				draw = 1;
				break;
			case 2:
				draw = 1;
				break;
			case 3:
				draw = 2;
				break;
			case 4:
				draw = 3;
				break;
			default:
				draw = random.nextInt(3) + 1;
		}
		
		System.out.println("PC draws: " + draw);
		return draw;
		
	}
	
	private boolean checkLose(String player) {
		
		if (sticks.activeSticks() == 1) {
			if (player.equals("pc"))
				System.out.println("PC loses! Player wins!");
			if (player.equals("human"))
				System.out.println("Player loses! PC wins!");
			scan.close();
			return true;
		}
		return false;
		
	}
	
}
