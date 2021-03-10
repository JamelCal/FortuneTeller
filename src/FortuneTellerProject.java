import java.util.Scanner;

public class FortuneTellerProject {

	public static void main(String[] args) {
		

Scanner input = new Scanner(System.in);
		//User name
		System.out.println("Enter your first name:");
		String firstName = input.nextLine();
		System.out.println("Enter your last name:");
		String lastName = input.nextLine();
		
		//Years until Retirement
		System.out.println("Enter your age:");
		int age = input.nextInt();
		if (age % 2 == 0)
			 System.out.println("15 years");
		else
			System.out.println("8 years");
		
		//Birth Month
		System.out.println("Enter your birth month:");
		int bMonth = input.nextInt();
		if (bMonth>=1 && bMonth <=4) {System.out.println("2554673");}
		if (bMonth>=5 && bMonth <=8) {System.out.println("50000345");}
		if (bMonth>=9 && bMonth <=12) {System.out.println("2341599");}
		if (bMonth == 0) {System.out.println("0");}
		
		//Transportation
		
		String roy;
	
		System.out.println("what is your favorite ROYGBIV color?");
	  	System.out.println("ROYGBIV stands for red, orange, yellow, green, blue, indigo, violet");

	
	roy = input.next();
	
	while (!roy.equals(roy)) {
  	

	switch(roy){
	   case "red":
	      System.out.println("Ford Mustang");
	      break;
	   case "orange":
	     System.out.println("Audi S5");
	      break;
	      case " yellow":
	      System.out.println("BMW 740");
	      break;
	      case " green":
	      System.out.println("Porsche Panamera");
	      break;
	      case "blue":
	      System.out.println("Chevorlette Corvette Stingray");
	      break;
	      case "indigo":
	      System.out.println("BMW 540");
	      break;
	      case "violet":
	      System.out.println("Genesis G90");
	      break;}
	}	     
	      
		
		//Vacation Home Location
		System.out.println("How many sibling do you have:");
		int sibs = input.nextInt(); 
	if (sibs == 0)
			System.out.println("South Island, New Zealand");
		if (sibs == 1)
			System.out.println("Bora Bora");
		if (sibs == 2)
			System.out.println("Maui");
		if (sibs == 3)
			System.out.println("Ghana, Afica");
		if (sibs > 3)
			System.out.println("Atlantis");
		if (sibs < 0)
			System.out.println("Moon Base");
		
		
		
		
		
		
		
		
		
		
		 
		
			

		System.out.println(firstName + " " + lastName + "will retire in " + age +"with "+ bMonth +"in the bank, a vaction home in " + sibs + "and travel by "+ roy   );
	}

}
