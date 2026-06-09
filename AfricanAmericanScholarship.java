package cs143.looking4carryplsjoin.scholarshipsearchengine;

public class AfricanAmericanScholarship extends Scholarship {
	AfricanAmericanScholarship(){
		super("AfricanAmericanScholarship", 3.0, "Black", "Any", 87000, "Any", false, false, 4500);
		
	}
	@Override
	public void printDescription() {
		System.out.println("African American Scholarship" );
		System.out.println("Minimum GPA: 3.0");
		System.out.println("Major: Any");
		System.out.println("Award Amount $4500");
	}
}
