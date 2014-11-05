package sudoku;

import static org.junit.Assert.*;
import org.junit.Test;

public class SudokuBoardTests {
	
	@Test
	public void shouldThrowsOnNullInput() {
		assertThrows(null);
	}
	
	@Test
	public void shouldCreateInstance() {
		Number[][] input = new Number[9][];
		for (int x=0; x<9; x++) {
			input[x] = new Number[9];
			for (int y=0; y<9; y++)
				input[x][y] = new Number(9);
		}
		
		new SudokuBoard(input);
	}
	
	@Test
	public void shouldThrowOnWrongDimensions() {
		Number[][] input = new Number[10][];
		for (int x=0; x<10; x++) {
			input[x] = new Number[9];
			for (int y=0; y<9; y++)
				input[x][y] = new Number(9);
		}
		
		assertThrows(input);
	}
	
	public void assertThrows(Number[][] input) {
		try {
			new SudokuBoard(input);
			fail("Should Throw IllegalArgumentException");
		}
		catch (IllegalArgumentException e) { }
	}
	
}
