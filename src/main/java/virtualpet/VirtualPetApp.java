package virtualpet;

import java.util.Scanner;


public class VirtualPetApp {


	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		VirtualPet pet = new VirtualPet ();
		
		System.out.println(pet.equals(pet.displayStatus()));
		System.out.println();
		System.out.println("What do you want to do offer BoomBoom?");
		System.out.println("Press 1 for food.");
		System.out.println("Press 2 for snack.");
		System.out.println("Press 3 for soda.");
		System.out.println("Press 4 for a ball.");
		System.out.println("Press 5 for the restroom");
		String optionEntered = input.nextLine();
	
	
	
}
}
	

