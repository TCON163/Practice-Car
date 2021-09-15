package car;

public class FuelTank extends CarPart {
	private int tankSize;
	
	public FuelTank(int tankSize) {
		this.tankSize = tankSize;
		
	}
	
	private void checkFuelLevel() {
		if (this.condition > 75) {
			System.out.println("You have a Full Tank");
		} else if (this.condition > 50) {
			System.out.println("You have 3 fourths of a tank!");
		} else if (this.condition > 25) {
			System.out.println("You have a half a tank!");
		} else {
			System.out.println("You have less than a quater of a tank! GET GAS SOON!!!");
		}
	}
	public String toString() {
		return tankSize + " gallon tank";
	}
	public void function() {
		this.status();
		System.out.println("Your vehicle has a " + tankSize + " gallon tank.");
		checkFuelLevel();
	}
}
