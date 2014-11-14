package sticks;
import static org.junit.Assert.*;
import org.junit.Test;

public class AITests {
	
	@Test
	public void shouldEmptyCreateInstance() {
		new AI();
	}
	
	@Test
	public void shouldGenerateRandomDraws() {
		AI ai = new AI();
		for (int i=0; i<100; i++) {
			int test = ai.runAI(5);						//Lets say the max value to draw is 5 so the ai can draw freely between 1 and 3.
			assertTrue(test >= 1 && test <= 3);			//Check if all random values are between 1 and 3.
		}
		for (int i=0; i<10; i++) {
			int test = ai.runAI(1);						//Lets say the max value to draw is 1 so the ai draws 1.
			assertTrue(test == 1);						//Check if all values are 1.
		}
		for (int i=0; i<10; i++) {
			int test = ai.runAI(2);						//Lets say the max value to draw is 2 so the pc draws 1.
			assertTrue(test == 1);						//Check if all values are 1.
		}
		for (int i=0; i<10; i++) {
			int test = ai.runAI(3);						//Lets say the max value to draw is 3 so the pc draws 2.
			assertTrue(test == 2);						//Check if all values are 2.
		}
		for (int i=0; i<10; i++) {
			int test = ai.runAI(4);						//Lets say the max value to draw is 4 so the pc draws 3.
			assertTrue(test == 3);						//Check if all values are 3.
		}
	}
	
}
