package sticks.complete;
import java.util.ArrayList;

public class StickList {
	
	private ArrayList<Stick> sticks;
	
	public StickList() {
		sticks = new ArrayList<Stick>();
	}
	
	public int activeSticks() {
		
		int activeSticks = 0;
		for (int i=0; i<sticks.size(); i++)
			if (sticks.get(i).isActive())
				activeSticks++;
		return activeSticks;
		
	}
	
	public void add(Stick stick) {
		sticks.add(stick);
	}
	
	public Stick remove(Stick stick) {
		sticks.remove(stick);
		return stick;
	}
	
	public Stick remove(int i) {
		Stick stick = sticks.get(i);
		sticks.remove(i);
		return stick;
	}
	
	public void setInactive(int i) {
		sticks.get(i).setInactive();
	}
	
	public void setInactive() {
		sticks.get(activeSticks()).setInactive();
	}
	
	public Stick get(int i) { return sticks.get(i); }
	
	public int size() { return sticks.size(); }
	
	@Override
	public String toString() {
		
		String str = "";
		for (int i=0; i<sticks.size(); i++) {
			if (sticks.get(i).isActive())
				str += "I";
			else str +=  "-";
		}
		return str;
		
	}
	
}
