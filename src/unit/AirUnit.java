package unit;

abstract class AirUnit extends Unit {

	protected AirUnit(String name, int hp) {
		super(name, hp);
	}

	abstract void flying();
}
