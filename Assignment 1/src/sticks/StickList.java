package sticks;
import java.util.ArrayList;

/*
 * Include with Code Coverage.
 */
public class StickList {
	
	private ArrayList<Stick> sticks;
	
	public StickList() {
		sticks = new ArrayList<Stick>();
	}
	
	public void add(Stick stick) {
		sticks.add(stick);
	}
	
	public void remove(int i) {
		if (i>=0 && i<=sticks.size())
			sticks.remove(i);
	}
	
	public Stick get(int i) {
		if (i < 0 || i > sticks.size())
			return null;
		return sticks.get(i);
	}
	
	@Override
	public String toString() {
		String output = "";
		for (Stick stick : sticks)
			output += stick.toString();
		return output;
	}
	
	public int size()		{ return sticks.size(); }
	
}
