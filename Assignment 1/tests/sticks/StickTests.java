package sticks;
import sticks.Stick;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
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
	
	@Test
	public void shouldUseStick() {
		Stick stick = createStick(false);
		stick.use();
		assertTrue(stick.isUsed());
	}
	
	@Test
	public void shouldVerifyStick() {
		Stick stick = mock(Stick.class);
		stick.use();
		verify(stick).use();
		when(stick.isUsed()).thenReturn(true);
		if (stick.isUsed())
			stick.unuse();
		verify(stick).unuse();
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
			stick.use();
		return stick;
	}
	
}
