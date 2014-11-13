package sticks;
import static org.junit.Assert.*;
import org.junit.Test;

public class GameTests {
	
	@Test
	public void shouldCreateInstance() {
		initGame();
	}
	
	@Test
	public void shouldPlayGame() {
		Game game = initGame();
		try					{ while (game.play()); }
		catch(Exception e)	{ fail("Failed test"); }
	}
	
	
	
	private Game initGame() {
		StickList list = new StickList();
		for (int i=0; i<30; i++)
			list.add(new Stick());
		return new Game(list, new Player(), new AI());
	}
	
}
