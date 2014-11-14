package sticks;
import java.util.Random;

/*
 * Include with Code Coverage.
 */
public class AI extends Player {
	
	private Random random;
	
	public AI() {
		random = new Random();
	}
	
	public int runAI(int max) {
		if (max == 1 || max == 2) {
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
