package cs143.looking4carryplsjoin.scholarshipsearchengine;

public class BusinessScholarship extends Scholarship {
	BusinessScholarship(){
		super("BusinessScholarship", 3.0, "Any", "Any", 85000, "Business", false, true, 4000);
	}
	@Override
	public void printDescription() {
		System.out.println("Business Scholarship");
		System.out.println("Minimum GPA: 3.2");
		System.out.println("Major: Business");
		System.out.println("Award Amount: $4000");
	}
}
