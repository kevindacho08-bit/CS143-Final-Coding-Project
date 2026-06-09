
package cs143.looking4carryplsjoin.scholarshipsearchengine;


public class User extends Scholarship{
	//default constructor
	User() {
		super();
	}
	
	//parameterized constructor
	User(String name, double GPA, String race, String gender, double income, String major, boolean isFirstGen, boolean isWashingtonResident, double scholarshipAmount) {
		super(name, GPA, race, gender, income, major, isFirstGen, isWashingtonResident, scholarshipAmount);
	}

	@Override
	public void printDescription() {
		System.out.println("=============USER=====DATA============");
		System.out.println(this.getName() + " | " + this.getRace() + " | " + this.getGender());
		System.out.printf("Income: $%.2f | " + "Major: %s%n", this.getIncome(), this.getMajor()); 
		if (this.getIsFirstGen()) {
			System.out.println("Is a First Generation College Student");
		}
		else {
			System.out.println("Is not a First Generation College Student");
		}
		if (this.getIsWashingtonResident()) {
			System.out.println("Is a Washington Resident");
		}
		else {
			System.out.println("Is not a Washington Resident");
		}
		System.out.printf("Accepted Scholarship Amonut: $%.2f%n", this.getScholarshipAmount());
		System.out.println("======================================");
	}
}
