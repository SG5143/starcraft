package starcraft;

import unit.DropShip;
import unit.Marine;
import unit.Scv;
import unit.Tank;

public class StarcraftGame {

	private StarcraftGame() {
	}

	private static StarcraftGame instance = new StarcraftGame();

	public static StarcraftGame getInstance() {
		return instance;
	}

	public void run() {
		Tank tank = new Tank();
		Scv scv = new Scv();
		DropShip dropship = new DropShip();
		Marine marine = new Marine();
		
		System.out.println(tank);
		System.out.println(scv);
		System.out.println(dropship);
		System.out.println(marine);
		
		dropship.flying();
	}

}
