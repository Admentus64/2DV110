package sticks;
import static org.junit.Assert.*;
import org.junit.Test;

public class PlayerTests {
	
	@Test
	public void shouldCreateInstance() {
		new Player();
	}
	
	@Test
	public void shouldInputNumber() {
		Player player = new Player();
		int i = player.drawSticks(5);			//Lets say the max value to draw is 5 so the player can draw freely between 1 and 3.
		System.out.println(i);
		assertTrue(i>=0 && i<=3);
	}
	
}
