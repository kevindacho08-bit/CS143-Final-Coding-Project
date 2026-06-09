package cs143.looking4carryplsjoin.scholarshipsearchengine;

public class MicrosoftScholarship extends Scholarship{
		MicrosoftScholarship() {
			super("MicrosoftScholarship", 3.0, "Any", "Any", 89369, "Stem", true, true, 5000);
		            
		}

		@Override
		public void printDescription() {
			// TODO Auto-generated method stub
			System.out.println("Microsoft Scholarship");
	        System.out.println("Minimum GPA: 3.0");
	        System.out.println("Major: Stem");
	        System.out.println("Award Amount: $5000");
		}
}
