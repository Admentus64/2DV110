package sticks;

public class Game {
	
	private StickList list;
	private Player player;
	private AI ai;
	
	public Game(StickList list, Player player, AI ai) {
		this.list = list;
		this.player = player;
		this.ai = ai;
	}
	
}
