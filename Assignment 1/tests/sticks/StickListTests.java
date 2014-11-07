package sticks;
import static org.junit.Assert.*;
import org.junit.Test;

public class StickListTests {
	
	@Test
	public void shouldCreateEmptyInstance() {
		new StickList();
	}
	
	@Test
	public void shouldCreateFilledInstance() {
		createStickList(30);
	}
	
	
	
	private StickList createStickList(int size) {
		StickList list = new StickList();
		for (int i=0; i<size; i++) {
			Stick stick = new Stick();
			list.add(stick);
		}
		return list;
	}
	
}
