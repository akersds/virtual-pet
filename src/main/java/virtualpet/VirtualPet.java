package virtualpet;

public class VirtualPet {

	private String name = "BoomBoom";
	private int hunger = 20;

	private int snack = 20;
	private int thirst = 20;
	private int play = 20;

	private int bathroom = 20;

	public VirtualPet() {

	}

	public VirtualPet(int hunger, int snack, int thirst, int play, int bathroom) {

		// constructors
		this.hunger = hunger;
		this.snack = snack;
		this.thirst = thirst;
		this.play = play;
		this.bathroom = bathroom;
	}

	public int getHunger() {
		return hunger;
	}

	public int getThirst() {
		return thirst;

	}

	public int getSnack() {
		return snack;

	}

	public int getPlay() {
		return play;
	}

	public int getBathroom() {
		return bathroom;

	}

	public String getName() {
		return name;
	}

	// class behavior methods
	public void tick() {
		this.hunger++;
		this.snack++;
		this.thirst++;
		this.play++;
		this.bathroom++;

	}

	public void feedPet() {

	}

	public void snackPet() {

	}

	public void waterPet() {

	}

	public void bathroomPet() {

	}

	public void playPet() {

	}

	public String displayStatus() {

		String petName = null;
		return petName + "\nHunger: " + hunger + "\nSnack: " + snack + "\nThirst:" + thirst + "\nPlay" + play
				+ "\nBathroom: " + bathroom;

	}

	{

	}

}
