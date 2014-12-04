package sticks;
import static org.mockito.Mockito.*;
import java.util.Random;

/*
 * Include with Code Coverage.
 */
public class Main {
	
	public static void main(String[] args) {
		
		testStickList();
		testAI();
		testGameComponents();
		runManual();
		runAutomatically(100);
		runAutomaticallyWithStaticInput();
		System.out.println("\nReached end of program");
	}
	
	private static void runManual() {
		
		//Manual testing, requires input
		Game game = initGame(false);
		do { game.play(); } while (!game.isDone());
		
	}
	
	private static void runAutomatically(int runTimes) {
		
		//Run the program without need for input, for testing purposes.
		Game game = initGame(true);
		for (int i=0; i<runTimes; i++) {		//Will always run 100 times as set by the main method
			do {
				int answer = randomNumber(3, 1);
				when(game.getPlayer().draw()).thenReturn(answer);
				System.out.println("Mock Player draws: " + answer);
				game.play();
			} while (!game.isDone());
			game.restart();
		}
	}
	
	private static void runAutomaticallyWithStaticInput() {
		
		//Run the program without need for input, for testing purposes.
		Game game = initGame(true);
		game.restart();			//Should not work now
		for (int i=3; i>=0; i--)
			runStaticInput(game, i);
		game.play();			//One last run, which should not be running at all.
		
	}
	
	private static void runStaticInput(Game game, int answer) {
		when(game.getPlayer().draw()).thenReturn(answer);
		System.out.println("Mock Player draws: " + answer);
		game.play();
	}
	
	private static void testGameComponents() {
		Game game = initGame(false);
		game.getPlayer();
		game.getAI();
		game.getStickList();
	}
	
	private static void testStickList() {
		
		StickList list = new StickList();
		list.reset();
		list.toString();
		list.used();
		list.add(new Stick());
		
		list.reset();
		list.toString();
		list.used();
		list.add(new Stick());
		list.add(new Stick());
		
		list.use();
		list.use(0);
		list.use(1);
		list.use(2);
		list.use(-1);
		list.use(9);
		list.get(0);
		list.get(1);
		list.get(2);
		list.get(-1);
		list.get(9);
		list.remove(0);
		list.remove(1);
		list.remove(2);
		list.remove(-1);
		list.remove(9);
		
	}
	
	private static void testAI() {
		AI ai = new AI();
		ai.setMax(-1);
		ai.setMax(2);
	}
	
	private static Game initGame(boolean mock) {
		StickList list = new StickList();
		for (int i=0; i<30; i++)			//Will always run 30 times
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
