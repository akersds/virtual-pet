package virtualpet;

public class VirtualPet {
	// instance variable

	private String name = "BoomBoom";

	private int hunger = 20;

	private int pain = 20;

	private int play = 20;

	private int happiness = 20;

	private int bathroom = 20;
	boolean petIsAlive = true;

	public VirtualPet() {

	}

	public VirtualPet(int hunger, int pain, int play, int happiness, int bathroom) {

		// constructors
		this.hunger = hunger;
		this.pain = pain;
		this.play = play;
		this.happiness = happiness;
		this.bathroom = bathroom;
	}

	// declare method arguments
	public int getHunger() {
		return hunger;
	}

	public int getPain() {
		return pain;
	}

	public int getPlay() {
		return play;

	}

	public int getHappiness() {
		return happiness;
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
		this.pain++;
		this.play++;
		this.happiness++;
		this.bathroom++;

		if (this.hunger > 100 || this.pain > 100)
			;
		this.petIsAlive = false;

		if (this.play > 100 || this.happiness > 100)
			;
		this.petIsAlive = false;

		if (this.bathroom > 100)
			;
		this.petIsAlive = false;

	}

	public void feedPet() {
		this.hunger -= 20;

	}

	public void beatPet() {
		this.pain -= 20;

	}
	public void playPet() {
		this.play -= 20;
	}

	public void groomPet() {
		this.happiness -= 20;

	}

	public void takePetToUseBathroom() {
		this.bathroom -= 20;

	}

	public String displayStatus() {

		String petName = null;
		return petName + "\nHunger: " + hunger + "\nPain: " + pain + "\nHappiness:" + happiness + "\nBathroom"
				+ bathroom + "\nBathroom: " + bathroom;

	}

	{

	}

}
