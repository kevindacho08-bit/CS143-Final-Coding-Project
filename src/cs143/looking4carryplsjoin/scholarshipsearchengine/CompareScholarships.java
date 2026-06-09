package cs143.looking4carryplsjoin.scholarshipsearchengine;
import java.util.ArrayList;
import java.util.List;
public class CompareScholarships {
	//private fields
	ArrayList<Scholarship> scholarships = new ArrayList<Scholarship>(List.of(new MicrosoftScholarship())); //option 1: initialize immediately
	
	private void fillScholarships() {
		scholarships.add(new MicrosoftScholarship()); //option 2: use private method to fill arraylist
	}
	
    //Remove scholarship from list if:
    //Race, Gender, Major are not "Any" and do not match user inputs
    //if user gpa less than scholarship minimum gpa
    //if user income greater than maximum income for scholarship
    //if user is not WA resident and scholarship requires WA residence
    //if user is first gen and scholarship requires not first gen
    public ArrayList<Scholarship> returnEligible(User user) {
        for (Scholarship ss : scholarships) {
            if (user.getGPA() <= ss.getGPA()) {
                scholarships.remove(ss);
            }
            if (user.getIncome() >= ss.getIncome()) {
                scholarships.remove(ss);
            }
            if ((!ss.getRace().toLowerCase().equals("any")) && (!ss.getRace().toLowerCase().equals(user.getRace()))) {
                scholarships.remove(ss);
            }
            if ((!ss.getGender().toLowerCase().equals("any")) && (!ss.getGender().toLowerCase().equals(user.getGender()))) {
                scholarships.remove(ss);
            }
            if ((!ss.getMajor().toLowerCase().equals("any")) && (!ss.getMajor().toLowerCase().equals(user.getMajor()))) {
                scholarships.remove(ss);
            }
            if ((user.getIsWashingtonResident() == false) && (ss.getIsWashingtonResident() == true)) {
                scholarships.remove(ss);
            }
            if ((user.getIsFirstGenImmigrant() == true) && (ss.getIsFirstGenImmigrant() == false)) {
                scholarships.remove(ss);
            }
        }
        
        return scholarships;
    }
}
