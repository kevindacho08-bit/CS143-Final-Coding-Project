
package cs143.looking4carryplsjoin.scholarshipsearchengine;


public class User extends Scholarship {
	//default constructor
	User() {
		super();
	}
	
	//parameterized constructor
	User(String name, double GPA, String race, String gender, double income, String major, boolean isFirstGenImmigrant, boolean isWashingtonResident, double scholarshipAmount) {
		super(name, GPA, race, gender, income, major, isFirstGenImmigrant, isWashingtonResident, scholarshipAmount);
	}
	
}
