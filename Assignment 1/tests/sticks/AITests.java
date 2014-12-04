package sticks;
import static org.junit.Assert.*;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class AITests {
	
	@Test
	public void shouldEmptyCreateInstance() {
		new AI();
	}
	
	@Test
	public void shouldGenerateRandomDraws() {
		AI ai = new AI();
		ai.setMax(5);
		for (int i=0; i<100; i++) {
			int test = ai.draw();						//Lets say the max value to draw is 5 so the ai can draw freely between 1 and 3.
			assertTrue(test >= 1 && test <= 3);			//Check if all random values are between 1 and 3.
		}
		ai.setMax(1);
		for (int i=0; i<10; i++) {
			int test = ai.draw();						//Lets say the max value to draw is 1 so the ai draws 1.
			assertEquals(test, 1);						//Check if all values are 1.
		}
		ai.setMax(2);
		for (int i=0; i<10; i++) {
			int test = ai.draw();						//Lets say the max value to draw is 2 so the pc draws 1.
			assertEquals(test, 1);						//Check if all values are 1.
		}
		ai.setMax(3);
		for (int i=0; i<10; i++) {
			int test = ai.draw();						//Lets say the max value to draw is 3 so the pc draws 2.
			assertEquals(test, 2);						//Check if all values are 2.
		}
		ai.setMax(4);
		for (int i=0; i<10; i++) {
			int test = ai.draw();						//Lets say the max value to draw is 4 so the pc draws 3.
			assertEquals(test, 3);						//Check if all values are 3.
		}
	}
	
	@Test
	public void shouldVerifyAIDraw() {
		AI ai = mock(AI.class);
		for (int i=0; i<100; i++)
			ai.draw();
		verify(ai, times(100)).draw();
	}
	
}
