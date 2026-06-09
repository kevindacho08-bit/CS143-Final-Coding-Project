package cs143.looking4carryplsjoin.scholarshipsearchengine;

public class WomenInStemScholarship extends Scholarship {
	WomenInStemScholarship () {
		super("WomenInStemScholarship ", 3.0, "Any", "Female", 89369, "Stem", true, true, 5000);

	            
	} 
	@Override
	public void printDescription() {
		// TODO Auto-generated method stub
		System.out.println("Women In STEM Scholarship");
        System.out.println("Minimum GPA: 3.0");
        System.out.println("Gender Requirement: Female");
        System.out.println("Major: Stem");
        System.out.println("Award Amount: $5000");
}
}
