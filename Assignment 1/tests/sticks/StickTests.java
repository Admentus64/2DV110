package sticks;
import static org.junit.Assert.*;
import org.junit.Test;

public class StickTests {
	
	@Test
	public void shouldCreateInstance() {
		new Stick();
	}
	
	@Test
	public void shouldBeUnused() {
		Stick stick = new Stick();
		assertTrue(!stick.isUsed());
	}
	
	@Test
	public void shouldPresentUsed() {
		Stick stick = new Stick();
		assertEquals(stick.toString(), "-");
	}

}
