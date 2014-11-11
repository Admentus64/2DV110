package sticks;

/*
 * Include with Code Coverage.
 */
public class Stick {
	
	private boolean used;
	
	public Stick() {
		used = false;
	}
	
	public boolean isUsed()				{ return used; }
	public void setUsed()				{ used = true; }
	
	@Override
	public String toString() {
		if (used)
			return "-";
		else return "I";
	}
	
}
