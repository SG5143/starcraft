package unit;

public class Unit {
	protected final int MAXHP;

	protected String name;
	protected int hp;

	protected Unit(String name, int hp) {
		this.MAXHP = hp;
		this.hp = hp;
		this.name = name;
	}

	protected void say() {
		System.out.printf("나는 %s 야\n", name);
	}

	@Override
	public String toString() {
		return String.format("나는 %s이다.", name);
	}
}
