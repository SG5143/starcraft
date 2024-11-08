package unit;

import interfaces.Attackable;
import interfaces.Repairable;

public class Scv extends GroundUnit implements Repairable, Attackable {

	public Scv() {
		super("SCV", 10);
	}

	public void repair(Repairable unit) {
		if (unit instanceof Unit) {
			Unit target = (Unit) unit;
			while (target.hp < target.MAXHP) {
				target.hp++;
				System.out.printf("%s 수리중 [%d/%d]\n", target.name, target.hp, target.MAXHP);

				try {
					Thread.sleep(200);
				} catch (Exception e) {
				}
			}
			System.out.println("수리 완료 >>");
		}
	}

	@Override
	public void attack(Unit unit) {
		if (unit instanceof GroundUnit) {
			if (unit.hp > 0)
				unit.hp -= 1;

			System.out.printf("%s 가 %s 를 공격\n", name, unit.name);
		}
	}
}
