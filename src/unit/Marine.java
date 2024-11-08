package unit;

public class Marine extends GroundUnit implements Attackable {
	public Marine() {
		super("Marine", 20);
	}

	@Override
	public void attack(Unit unit) {
		if (unit instanceof Unit) {
			if (unit.hp > 0)
				unit.hp -= 2;

			System.out.printf("%s 가 %s 를 공격\n", name, unit.name);
		}
	}
}