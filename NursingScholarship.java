package cs143.looking4carryplsjoin.scholarshipsearchengine;

public class NursingScholarship  extends Scholarship  {
	   NursingScholarship() {
	        super("Nursing Scholarship", 3.2, "Any", "Any", 75000, "Nursing", false, false, 4500);
	    }

	    @Override
	    public void printDescription() {
	        System.out.println("Nursing Scholarship");
	        System.out.println("Minimum GPA: 3.0");
	        System.out.println("Major: Nursing");
	        System.out.println("Award Amount: 4500");
	       
	}
}
