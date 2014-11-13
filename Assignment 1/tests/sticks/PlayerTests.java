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
		int i = player.drawSticks();
		System.out.println(i);
		assertTrue(i>=0 && i<=3);
	}
	
}
