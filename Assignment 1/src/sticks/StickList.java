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
		sticks.remove(i);
	}
	
}
