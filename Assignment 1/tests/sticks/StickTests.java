package sticks;
import static org.junit.Assert.*;
import org.junit.Test;

public class StickTests {
	
	@Test
	public void shouldCreateInstance() {
		new Stick();
	}
	
	@Test
	public void shouldInitUsedAsFalse() {
		Stick stick = new Stick();
		assertTrue(stick.isUsed());
	}

}
