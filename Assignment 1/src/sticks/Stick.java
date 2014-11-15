package sticks;

/*
 * Include with Code Coverage.
 */
public class Stick {
	
	private boolean used = false;
	
	public boolean isUsed()				{ return used; }
	public void use()					{ used = true; }
	public void unuse()					{ used = false; }
	
	@Override
	public String toString() {
		if (used)
			return "-";
		else return "I";
	}
	
}
