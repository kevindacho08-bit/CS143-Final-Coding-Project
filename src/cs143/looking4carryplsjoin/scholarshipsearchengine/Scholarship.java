package cs143.looking4carryplsjoin.scholarshipsearchengine;

public abstract class Scholarship {
	//private fields
	private String name;
	private double GPA;
	private String race;
	private String gender;
	private double income;
	private String major;
	private boolean isFirstGenImmigrant;
	private boolean isWashingtonResident;
	private double scholarshipAmount;
	//default constructor
	Scholarship() {
		this("name", 0.0, "race", "gender", 0.0, "major", false, false, 0.0);
	}
	//parameterized constructor
	Scholarship(String name, double GPA, String race, String gender, double income, String major, boolean isFirstGenImmigrant, boolean isWashingtonResident, double scholarshipAmount) {
		setName(name);
		setGPA(GPA);
		setRace(race);
		setGender(gender);
		setIncome(income);
		setMajor(major);
		setIsFirstGenImmigrant(isFirstGenImmigrant);
		setIsWashingtonResident(isWashingtonResident);
		setScholarshipAmount(scholarshipAmount);
	}
	//setter methods
	public void setName(String name) {
		this.name = name;
	}
	
	public void setGPA(double GPA) {
		this.GPA = GPA;
	}
	
	public void setRace(String race) {
		this.race = race;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void setIncome(double income) {
		this.income = income;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
	
	public void setIsFirstGenImmigrant(boolean isFirstGenImmigrant) {
		this.isFirstGenImmigrant = isFirstGenImmigrant;
	}
	
	public void setIsWashingtonResident(boolean isWashingtonResident) {
		this.isWashingtonResident = isWashingtonResident;
	}
	
	public void setScholarshipAmount(double scholarshipAmount) {
		this.scholarshipAmount = scholarshipAmount;
	}
	
	//getter methods
	public String getName() {
		return name;
	}
	
	public double getGPA() {
		return GPA;
	}
	
	public String getRace() {
		return race;
	}
	
	public String getGender() {
		return gender;
	}
	
	public double getIncome() {
		return income;
	}
	
	public String getMajor() {
		return major;
	}
	
	public boolean getIsFirstGenImmigrant() {
		return isFirstGenImmigrant;
	}
	
	public boolean getIsWashingtonResident() {
		return isWashingtonResident;
	}
	
	public double getScholarshipAmount() {
		return scholarshipAmount;
	}
	//helper methods
	public abstract void printDescription();
}	
