package cs143.looking4carryplsjoin.scholarshipsearchengine;

public abstract class Scholarship {
	//private fields
	private double GPA;
	private String race;
	private String gender;
	private double income;
	private String major;
	private boolean isFirstGenImmigrant;
	private boolean isWashingtonResident;
	//default constructor
	Scholarship() {
		this(0.0, "White", "Male", 0.0, "Business", false, false);
	}
	//parameterized constructor
	Scholarship(double GPA, String race, String gender, double income, String major, boolean isFirstGenImmigrant, boolean isWashingtonResident) {
		setGPA(GPA);
		setRace(race);
		setGender(gender);
		setIncome(income);
		setMajor(major);
		setIsFirstGenImmigrant(isFirstGenImmigrant);
		setIsWashingtonResident(isWashingtonResident);
	}
	//setter methods
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
	
	//getter methods
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
}
