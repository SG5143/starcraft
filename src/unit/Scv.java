package unit;

public class Scv extends GroundUnit implements Repairable{

	public Scv() {
		super("SCV", 10);
	}
	
	void repair(Repairable unit) {
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
	
}
