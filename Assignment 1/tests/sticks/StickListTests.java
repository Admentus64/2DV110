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
		StickList list = new StickList();
		for (int i=0; i<30; i++) {
			Stick stick = new Stick();
			list.add(stick;)
		}
	}
	
}
