package cs143.looking4carryplsjoin.scholarshipsearchengine;

public class EverettScholarShip extends Scholarship {
	EverettScholarShip(){
		super("EverettScholarShip", 2.6, "Any", "Any", 95000, "Any", false, true, 2500);

	}
	@Override
	public void printDescription() {
		System.out.println("EverettScholarShip");
		System.out.println("Minimum GPA: 2.6");
		System.out.println("Major: Any");
		System.out.println("Award Amount: $2500 ");
	}
}
