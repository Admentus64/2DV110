package sticks.complete;
import java.io.IOException;
import java.util.ArrayList;

public class Game {
	
	private ArrayList<Stick> sticks;
	private Player human;
	private Player pc;
	
	
	public Game(ArrayList<Stick> sticks, Player human, Player pc) {
		this.sticks = sticks;
		this.human = human;
		this.pc = pc;
	}
	
	public int remaining()		{ return sticks.size(); }
	public Player human()		{ return human; }
	public Player pc()			{ return pc; }
	
	public void drawHuman() {
		int draw = askDrawHuman();
		for (int i=0; i<draw; i++)
			sticks.remove(0);
		drawPC();
		//checkWin();
	}
	
	private int askDrawHuman() {
		
		int output = 0;
		try {
			System.out.println("How many sticks do you want to draw? Choose 1, 2 or 3: ");
			output = (char) System.in.read();
		}
        catch (IOException e) {
            System.out.println(e);
            System.exit(0);
        }
		
		return output;
		
	}
	
	/* private boolean checkInvalidInput(int i) {
		if (i == 1 || i == 2 || i == 3)
			return true;
		else {
			System.out.println("Invalid input, please try again.");
			return false;
		}
	} */
	
	private void drawPC() {
		
	}
	
	//private int calculateDrawPC() {
	//	
	//}
	
	/* private void checkLose(String player) {
		if (sticks.size() == 1) {
			
			//if (player.equals("pc"))
			
		}
			
	} */
	
}
