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
	
	@Test
	public void shouldRemoveStickWithoutError() {
		StickList list = createStickList(30);
		list.remove(0);
		
	}
	
	@Test
	public void shouldRemoveStickWithError() {
		StickList list = createStickList(30);
		int error = 0;
		try					{ list.remove(-1); }
		catch(Exception e)	{ error++; }
		try					{ list.remove(31); }
		catch(Exception e)	{ error++; }
		if (error != 2)
			fail("Failed test");
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
