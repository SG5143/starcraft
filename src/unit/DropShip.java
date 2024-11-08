package unit;

import interfaces.Attackable;
import interfaces.Repairable;

public class DropShip extends AirUnit implements Repairable, Attackable {

	public DropShip() {
		super("DropShip", 60);
	}

	@Override
	public void flying() {
		System.out.println(super.name + " 플라이~");
	}

	@Override
	public void attack(Unit unit) {
		if (unit instanceof Unit) {
			if (unit.hp > 0)
				unit.hp -= 4;

			System.out.printf("%s 가 %s 를 공격\n", name, unit.name);
		}
	}
}