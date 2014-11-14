package sticks;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Random;

import sticks.Stick;
import sticks.StickList;

/*
 * Include with Code Coverage.
 */
public class Main {
	
	public static void main(String[] args) {
		
		testStickList();
		runManual();
		runAutomatically(100);
		runAutomaticallyWithPreInput();
		
	}
	
	private static void runManual() {
		
		//Manual testing, requires input
		Game game = initGame(false);
		while (!game.isDone())
			game.play();
		
	}
	
	private static void runAutomatically(int runTimes) {
		
		//Run the program without need for input, for testing purposes. Does not run the program in sequence.
		Game game = initGame(true);
		for (int i=0; i<runTimes; i++) {
			while (!game.isDone()) {
				int answer = randomNumber(3, 1);
				when(game.getPlayer().drawSticks(game.getStickList().unused())).thenReturn(answer);
				System.out.println("Mock Player draws: " + answer);
				game.play();
			}
			game.restart();
		}
	}
	
	private static void runAutomaticallyWithPreInput() {
		
		//Run the program without need for input, for testing purposes. Does not run the program in sequence.
		Game game = initGame(true);
		when(game.getPlayer().drawSticks(game.getStickList().unused())).thenReturn(3);
		game.play();
		when(game.getPlayer().drawSticks(game.getStickList().unused())).thenReturn(2);
		game.play();
		when(game.getPlayer().drawSticks(game.getStickList().unused())).thenReturn(1);
		game.play();
		when(game.getPlayer().drawSticks(game.getStickList().unused())).thenReturn(0);
		game.play();
		game.play();			//One last run, which should not be running at all.
		
	}
	
	private static void testStickList() {
		
		StickList list = new StickList();
		list.add(new Stick());
		list.add(new Stick());
		list.add(new Stick());
		Stick stick = list.get(0);
		list.add(stick);
		list.remove(0);
		list.use(9);
		list.get(9);
		
	}
	
	private static Game initGame(boolean mock) {
		StickList list = new StickList();
		for (int i=0; i<30; i++)
			list.add(new Stick());
		if (mock)
			return new Game(list, mock(Player.class), new AI());
		else return new Game(list, new Player(), new AI());
	}
	
	private static int randomNumber(int value, int add) {
		Random rand = new Random();
		return  rand.nextInt(value) + add;
	}
	
}
