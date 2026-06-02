package cs143.looking4carryplsjoin.scholarshipsearchengine;
import java.util.Scanner;
public class Main {

	
	public static void main(String[] args) {
		String name;
		Scanner sc = new Scanner(System.in);
		
		
		
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
		
		
		
		
	}
}
