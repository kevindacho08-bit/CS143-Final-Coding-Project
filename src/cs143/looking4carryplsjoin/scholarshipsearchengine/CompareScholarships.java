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
	
	/**public static ArrayList<Scholarship> returnEligible(User user) {
	    ArrayList<Scholarship> elegibleScholarships = new ArrayList<Scholarships>();
		fillScholarships();
		
		Not sure how to make logic, maybe use nested loops or recurssion
		
		return scholarships;
	}**/
}
