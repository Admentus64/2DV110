package sticks;
import java.util.ArrayList;

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
	
}
