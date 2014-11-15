package sticks;
import java.util.ArrayList;

/*
 * Include with Code Coverage.
 */
public class StickList {
	
	private ArrayList<Stick> sticks = new ArrayList<Stick>();
	
	public void add(Stick stick) {
		sticks.add(stick);
	}
	
	public void remove(int i) {
		if (i>=0 && i<sticks.size())
			sticks.remove(i);
	}
	
	public Stick get(int i) {
		if (i < 0 || i > sticks.size())
			return null;
		return sticks.get(i);
	}
	
	public void use(int number) {
		if (number > unused() || number < 0)
			return;
		for (int i=0; i<number; i++)
			sticks.get(size()-used()-1).use();
	}
	
	public void reset() {
		for (Stick stick : sticks)
			stick.unuse();
	}
	
	@Override
	public String toString() {
		String output = "";
		for (Stick stick : sticks)
			output += stick.toString();
		return output;
	}
	
	public int size()		{ return sticks.size(); }
	public int unused()		{ return size() - used(); }
	
	public int used() {
		int count = 0;
		for (Stick stick : sticks)
			if (stick.isUsed())
				count++;
		return count;
	}
	
	
	
}
