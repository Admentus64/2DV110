package sticks;
import static org.mockito.Mockito.*;
import java.util.Random;
import org.junit.Test;

public class GameTests {
	
	@Test
	public void shouldCreateInstance() {
		initGame(false);
	}
	
	@Test
	public void shouldPlayGameWithoutUserWithAnswerOne() {
		Game game = initGame(true);
		while (!game.isDone()) {
			int answer = 1;
			when(game.getPlayer().draw()).thenReturn(answer);
			System.out.println("Mock Player draws: " + answer);
			game.play();
		}
	}
	
	@Test
	public void shouldPlayGameWithoutUserWithRandomAnswer() {
		Game game = initGame(true);
		while (!game.isDone()) {
			int answer = randomNumber(3, 1);
			when(game.getPlayer().draw()).thenReturn(answer);
			System.out.println("Mock Player draws: " + answer);
			game.play();
		}
	}
	
	@Test
	public void shouldPlayGameWithUser() {
		Game game = initGame(false);
		while (!game.isDone())
			game.play();
	}
	
	
	
	private Game initGame(boolean mock) {
		StickList list = new StickList();
		for (int i=0; i<30; i++)
			list.add(new Stick());
		if (mock)
			return new Game(list, mock(Player.class), new AI());
		else return new Game(list, new Player(), new AI());
	}
	
	private int randomNumber(int value, int add) {
		Random rand = new Random();
		return  rand.nextInt(value) + add;
	}
	
}
