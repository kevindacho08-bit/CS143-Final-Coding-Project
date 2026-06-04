package cs143.looking4carryplsjoin.scholarshipsearchengine;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {

	
	public static void main(String[] args) {
		ArrayList<Scholarship> elegibleScholarships = new ArrayList<Scholarship>();
		ArrayList<Scholarship> acceptedScholarships = new ArrayList<Scholarship>();
		Scanner sc = new Scanner(System.in);
		User user;
		String name;
		double GPA;
		String race;
		String gender;
		double income;
		String major;
		boolean isFirstGenImmigrant;
		boolean isWashingtonResident;
		double scholarshipAmount = 0; //at beginning user has no scholarships + this is for ACCEPTED scholarshisp only
		
		//use static methods to initialize fields to initialize user constructor
		//user = new User(name, GPA, race, gender, income, major, isFirstGenImmigrant, isWashingtonResident, scholarshipAmount);
		//FOr TT;
		//Have while loop switch menu for 
		//1. check elegibleScholarshisp 
		//2. accept elegible scholarships
		//2. check all scholarshisp
		//3. check accepted Scholarships and amount 
		//4. check user data
		//5. and of course an exit
		//For TT;
		//case 1. call comparescholarshisp and return elegiblescholarships and display + calculate elegiblemoneyamount
		//case 2. go one by one prompting user to fill 2nd arraylist
		//case 3. arraylist with all from compare scholarship class
		//case 4. call print desc from user class
		//case 5. exit
		//default: whatever just loop
	}
	
	public static String promptName(Scanner sc) {
		String name;
		System.out.print("Enter Name: ");
		name = sc.next();
		return name;
	}
	
	public static Double promptGPA(Scanner sc) {
		double GPA;
		System.out.print("Enter GPA: ");
		GPA = sc.nextDouble();
		
		if (GPA < 0.0) {
			System.out.println("Entered GPA was negative and was set to zero.");
			GPA = 0.0;
		}
		if (GPA > 4.0) {
			System.out.println("Entered GPA was greater than 4.0 and was set to 4.0.");
			GPA = 4.0;
		}
		return GPA;
	}
	
	public static String promptRace(Scanner sc) {
		int choice = 0;
		
		switch (choice) {
		case 1:
			return "white";
		case 2:
			return "black";
		default:
			return "white";
		}
	//For Kevin
	//public static String promptGender();
	//public static Double promptIncome();
	//public static String promptMajor();
	//public static boolean promptIsFirstGenImmigrant();
	//public static boolean prompt isWashingtonResident();
		
	}
}
