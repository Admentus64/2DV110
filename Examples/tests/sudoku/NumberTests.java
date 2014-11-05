package sudoku;
import static org.junit.Assert.*;
import org.junit.Test;

public class NumberTests {
	
	@Test
	public void shouldCreateAInstace() {
		new Number(0);
	}
	
	@Test
	public void shouldThrow() {
		assertThrows(10);
	}
	
	@Test
	public void shouldThrowOnNegative() {
		assertThrows(-1);
	}
	
	@Test
	public void shouldThrowOnTooLarge() {
		assertThrows(11);
	}
	
	public void assertThrows(int input) {
		try {
			new Number(input);
			fail("Should Throw IllegalArgumentException");
		}
		catch (IllegalArgumentException e) { }
	}
	
}
