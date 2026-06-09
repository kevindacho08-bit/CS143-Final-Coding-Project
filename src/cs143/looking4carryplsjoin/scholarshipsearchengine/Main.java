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
		boolean isFirstGen;
		boolean isWashingtonResident;
		double scholarshipAmount = 0; //at beginning user has no scholarships + this is for ACCEPTED scholarshisp only
		
		//use static methods to initialize fields to initialize user constructor
		//For TT
		user = new User();		// create new user object
		char repeat = 'n';		// while-loop repeating variable 
		do
		{
			// Display menu prompting user for input
			System.out.println("    ...::: User Profile :::...");
			System.out.println("Fill out the forms below");
			name = promptName(sc);
			user.setName(name);
			GPA = promptGPA(sc);
			user.setGPA(GPA);
			race = promptRace(sc);
			user.setRace(race);
			gender = promptGender(sc);
			user.setGender(gender);
			income = promptIncome(sc);
			user.setIncome(income);
			major = promptMajor(sc);
			user.setMajor(major);
			isFirstGen = promptIsFirstGen(sc);
			user.setIsFirstGen(isFirstGen);
			scholarshipAmount = isWashingtonResident(sc);
			user.setIsWashingtonResident(isWashingtonResident);
			

			user.printDescription();			// print user profile
			System.out.println("Continue to edit? Press 'y' otherwise press 'n'");
			repeat = sc.next().charAt(0);
			
			//TODO include exception handling for scanner in user profile
			
		} while(repeat == 'y' || repeat == 'Y');		// End of do-while menu loop
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
		System.out.println("1. white");
		System.out.println("2. black");
		System.out.println("3. asian");
		System.out.println("Press unlisted numbers to set race as 'other'");
		System.out.print("Choose race: ");
		choice = sc.nextInt();
		switch (choice) {
		case 1:
			return "white";
		case 2:
			return "black";
		case 3:
			return "asian";
		default:
			return "other";
		}
	//For Kevin
	//public static String promptGender();
	//public static Double promptIncome();
	//public static String promptMajor();
	//public static boolean promptIsFirstGen();
	//public static boolean prompt isWashingtonResident();
		
	}
}