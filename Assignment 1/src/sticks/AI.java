package sticks;
import java.util.Random;

/*
 * Include with Code Coverage.
 */
public class AI extends Player {
	
	private Random random = new Random();
	private int max = 1;
	
	public void setMax(int i) {
		if (i>0)
			max = i;
	}
	
	@Override
	public int draw() {
		if (max <= 2) {
			System.out.println("PC draws: 1");
			return 1;
		}
		else if (max == 3) {
			System.out.println("PC draws: 2");
			return 2;
		}
		else if (max == 4) {
			System.out.println("PC draws: 3");
			return 3;
		}
		else {
			int rand = random.nextInt(3) + 1;
			System.out.println("PC draws: " + rand);
			return rand;
		}
	}
}
