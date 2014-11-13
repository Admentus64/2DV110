package sticks;

/*
 * TODO
 * Include with Code Coverage.
 */
public class Player {
	
	public Player() {
	}
	
	public int drawSticks(int max) {
		int number = -1;
		while (number < 0) {
			System.out.print("(Enter 0 to quit) How many sticks do you want to draw? Choose 1, 2 or 3: ");
			try	{
				number = (int) System.in.read();
				if (number >= 48 && number <= 51)
					number -= 48;
				else number = -1;
			}
			catch(Exception e)	{ }
			if (number >= 1 && number <= 3)
				if (number > max)
					number = -1;
			
			if (number < 0)
				System.err.println("Error with input, try again please.");
		}
		return number;
	}
	
}
