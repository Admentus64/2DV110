package sticks;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.emptyStandardInputStream;
import static org.mockito.Mockito.*;

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
		systemInMock.provideText("3");
		int result = player.draw();
		assertTrue(result >= 0 && result <= 3);
		assertNotEquals(2, result);
		assertNotEquals(4, result);
	}
	
	@Test
	public void shouldInputRandomNumberWithoutUser() {
		Player player = new Player();
		for (int i=0; i<100; i++) {
			systemInMock.provideText(randomNumberString(4, 0));
			int result = player.draw();
			assertTrue(result >= 0 && result <= 3);
		}
	}
	
	@Test
	public void shouldInputWrongNumberWithoutUser() {
		Player player = new Player();
		int check = -1;		
		
		checkAssert("5", player, check);	//Must be between 0 and 3
		checkAssert("4", player, check);	//To high value if max is 2
		checkAssert("-1", player, check);	//Still to high value if max is 2
		
		
		
	}
	
	@Test
	public void shouldVerifyPlayerDraw() {
		Player player = mock(Player.class);
		for (int i=0; i<100; i++)
			player.draw();
		verify(player, times(100)).draw();
	}
	
	
	
	private void checkAssert(String provide, Player player, int check) {
		systemInMock.provideText(provide);
		int result = player.draw();
		assertEquals(result, check);
	}
	
	private String randomNumberString(int value, int add) {
		Random rand = new Random();
		int i = rand.nextInt(value) + add;
		System.out.println(i);
		return Integer.toString(i);
	}
	
	
}
