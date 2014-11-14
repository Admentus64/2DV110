package sticks;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.emptyStandardInputStream;
import java.util.Random;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;

public class PlayerTests {
	
	@Rule
	public final TextFromStandardInputStream systemInMock = emptyStandardInputStream();
	
	@Test
	public void shouldCreateInstance() {
		new Player();
	}
	
	@Test
	public void shouldInputStaticNumberWithoutUser() {
		Player player = new Player();
		int max = 5;					//Lets say the max value to draw is 5 so the player can draw freely between 1 and 3.
		systemInMock.provideText("3");
		int result = player.drawSticks(max);
		assertTrue(result >= 0 && result <= 3);
		assertNotEquals(2, result);
		assertNotEquals(4, result);
	}
	
	@Test
	public void shouldInputRandomNumberWithoutUser() {
		Player player = new Player();
		int max = 5;					//Lets say the max value to draw is 5 so the player can draw freely between 1 and 3.
		for (int i=0; i<100; i++) {
			systemInMock.provideText(randomNumberString(4, 0));
			int result = player.drawSticks(max);
			assertTrue(result >= 0 && result <= 3);
		}
	}
	
	@Test
	public void shouldInputWrongNumberWithoutUser() {
		Player player = new Player();
		int max = 2, check = -1;		
		checkAssert("5", player, max, check);	//Must be between 0 and 3
		checkAssert("3", player, max, check);	//To high value if max is 2
		checkAssert("2", player, max, check);	//Still to high value if max is 2
	}
	
	
	
	private void checkAssert(String provide, Player player, int max, int check) {
		systemInMock.provideText(provide);	
		int result = player.drawSticks(max);
		assertEquals(result, check);
	}
	
	private String randomNumberString(int value, int add) {
		Random rand = new Random();
		int i = rand.nextInt(value) + add;
		System.out.println(i);
		return Integer.toString(i);
	}
	
	
}
