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
		Stick stick = createStick(false);
		assertTrue(!stick.isUsed());
	}
	
	@Test
	public void shouldPrintSticks() {
		shouldPrintUsedStick();
		shouldPrintUnusedStick();
	}
	
	
	
	private void shouldPrintUsedStick() {
		Stick stick = createStick(true);
		assertEquals(stick.toString(), "-");
	}
	
	private void shouldPrintUnusedStick() {
		Stick stick = createStick(true);
		assertEquals(stick.toString(), "-");
	}
	
	private Stick createStick(boolean used) {
		Stick stick = new Stick();
		if (used)
			stick.setUsed();
		return stick;
	}

}
