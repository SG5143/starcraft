package unit;

public class Tank extends GroundUnit implements Repairable, Attackable {
	public Tank() {
		super("Tank", 30);
	}

	@Override
	public void attack(Unit unit) {
		if (unit instanceof Unit) {
			if (unit.hp > 0)
				unit.hp -= 3;

			System.out.printf("%s 가 %s 를 공격\n", name, unit.name);
		}
	}
}
