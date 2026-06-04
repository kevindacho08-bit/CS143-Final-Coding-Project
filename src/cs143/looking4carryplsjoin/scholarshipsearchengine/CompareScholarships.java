package cs143.looking4carryplsjoin.scholarshipsearchengine;
import java.util.ArrayList;
import java.util.List;
public class CompareScholarships {
	//private fields
	ArrayList<Scholarship> scholarships = new ArrayList<Scholarship>(List.of(new MicrosoftScholarship())); //option 1: initialize immediately
	
	private void fillScholarships() {
		scholarships.add(new MicrosoftScholarship()); //option 2: use private method to fill arraylist
	}
	
	//have method that displays filled arraylist
	
	//For Casey
	/**public static ArrayList<Scholarship> returnEligible(User user) {
	    ArrayList<Scholarship> elegibleScholarships = scholarships;
		fillScholarships();

		
		Not sure how to make logic, maybe use nested loops or recurssion
		
		//we can have "Any" fields that ignore and just automatically accetp the comparison
		
		return scholarships;
	}**/
}
