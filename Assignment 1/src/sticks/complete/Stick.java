package sticks.complete;

public class Stick {
	
	private boolean active;
	
	public Stick() {
		active = true;
	}
	
	public void setInactive()	{ active = false; }
	public boolean isActive()	{ return active; }
	
	@Override
	public String toString() {
		
		if (active)
			return "I";
		else return "-";
		
	}
	
}
