package cs143.looking4carryplsjoin.scholarshipsearchengine;
import java.util.ArrayList;
import java.util.List;
public class CompareScholarships {
	//private fields
	ArrayList<Scholarship> scholarships = new ArrayList<Scholarship>(List.of(new MicrosoftScholarship()));
	
	private void fillScholarships() {
		scholarships.add(new MicrosoftScholarship());
	}
	
	public static ArrayList<Scholarship> returnEligible(User user) {
		//fillScholarships();
		return scholarships;
	}
}
