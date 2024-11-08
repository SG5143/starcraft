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

	public int getMaxHp() {
		return this.MAXHP;
	}
	public int getHp() {
		return this.hp;
	}
	
	public void decreaseHp(int hp) {
		this.hp -= hp;
	}
	
	public void increaseHp(int hp) {
		this.hp += hp;
	}
		
	public String getName() {
		return this.name;
	}
	
	@Override
	public String toString() {
		return String.format("나는 %s이다.", name);
	}
}
