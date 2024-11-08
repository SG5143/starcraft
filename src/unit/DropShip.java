package unit;

public class DropShip extends AirUnit implements Repairable {

	public DropShip() {
		super("DropShip", 60);
	}

	@Override
	public void flying() {
		System.out.println(super.name+" 플라이~");
	}
}
