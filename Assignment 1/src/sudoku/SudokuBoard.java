package sudoku;

public class SudokuBoard {
	
	public SudokuBoard(Object[][] input) {
		
		if (input == null)
			throw new IllegalArgumentException();
		
		if (input.length != 9) {
			throw new IllegalArgumentException();
		}
		
	}
	
	//Testing upload of this comment.
	
}
