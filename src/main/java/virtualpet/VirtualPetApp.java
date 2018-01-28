package virtualpet;

import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		VirtualPet pet = new VirtualPet();

		System.out.println("What do you want to name your pet?");
		String enterName = input.nextLine();

		String optionsEntered = "";
		do {
			System.out.println(enterName);
			System.out.println("Hunger: " + pet.getHunger());
			System.out.println("Pain: " + pet.getPain());
			System.out.println("Play: " + pet.getPlay());
			System.out.println("Happiness: " + pet.getHappiness());
			System.out.println("Bathroom: " + pet.getBathroom());
			System.out.println();
			System.out.println();
			System.out.println("What do you want to do with your pet?");

			System.out.println("Press 1 to feed " + enterName + "food");
			System.out.println("Press 2 to beat " + enterName + "with stick");
			System.out.println("Press 3 to play with " + enterName);
			System.out.println("Press 4 to groom " + enterName);
			System.out.println("Press 5 to take " + enterName + " to bathroom");
			optionsEntered = input.nextLine();

			switch (optionsEntered) {
			case "1": {
				pet.feedPet();
				System.out.println("You fed " + pet.getName() + " . ");
				break;
			}
			case "2": {
				pet.painPet();
				System.out.println("You beat" + pet.getName() + "with a stick. ");
				break;
			}
			case "3": {
				pet.playPet();
				System.out.println("You played with " + pet.getName() + " . ");
				break;
			}
			case "4": {
				pet.happinessPet();
				System.out.println("You groomed" + pet.getName() + " . ");
				break;
			}
			case "5": {
				pet.bathroomPet();
				System.out.println("You took" + pet.getName() + "to the bathroom.");

				break;
			}

			}
			pet.tick();
		} while (true);

	}
}
