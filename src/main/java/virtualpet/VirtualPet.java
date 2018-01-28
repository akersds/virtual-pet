package virtualpet;

public class VirtualPet {
	// instance variable

	private int hunger = 20;

	private int pain = 20;

	private int play = 20;

	private int happiness = 20;

	private int bathroom = 20;

	public VirtualPet() {

	}

	// Getters
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

	// class behavior methods
	public void tick() {
		this.hunger++;
		this.pain--;
		this.play--;
		this.happiness--;
		this.bathroom++;

	}

	public void feedPet() {
		this.hunger -= 20;

	}

	public void beatPet() {
		this.pain += 20;

	}

	public void playPet() {
		this.play += 20;
	}

	public void groomPet() {
		this.happiness += 20;

	}

	public void takePetToUseBathroom() {
		this.bathroom -= 20;

	}

}
