package virtualpet;

import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		VirtualPet pet = new VirtualPet();

		// String decision = "";
		// while (decision.equalsIgnoreCase("Yes")) {

		System.out.println("What do you want to name your pet?");
		String enterName = input.nextLine();

		String optionsEntered = "";
		do {
			System.out.println("Hunger: " + pet.getHunger());
			System.out.println("Snack: " + pet.getSnack());
			System.out.println("Thirst: " + pet.getThirst());
			System.out.println("Play: " + pet.getPlay());
			System.out.println("Bathroom: " + pet.getBathroom());
			System.out.println();
			System.out.println("Press 1 to feed " + enterName);
			System.out.println("Press 2 to give a snack to " + enterName);
			System.out.println("Press 3 to give " + enterName + " water");
			System.out.println("Press 4 to play with " + enterName);
			System.out.println("Press 5 to take " + enterName + " to bathroom");
			optionsEntered = input.nextLine();

			// if(optionsEntered.equals("1")) {
			// System.out.println("Enter an amount to feed your pet");
			// int foodAmount = input.nextInt();
			// System.out.println("");
			// System.out.println("You have fed your ");
			//
			switch (optionsEntered) {
			case "1": {
				pet.feedPet();
				System.out.println("PLease feed " + pet.getName() + " . ");
				break;
			}
			case "2": {
				pet.snackPet();
				System.out.println("PLease feed " + pet.getName() + " . ");
				break;
			}
			case "3": {
				pet.waterPet();
				System.out.println("Please give " + pet.getName() + " . ");
				break;
			}
			case "4": {
				pet.playPet();
				System.out.println("Please play " + pet.getName() + " . ");
				break;
			}
			case "5": {
				pet.bathroomPet();
				System.out.println("Please take " + pet.getName() + " . ");
				break;
			}

			}
		} while (true);

	}
}
