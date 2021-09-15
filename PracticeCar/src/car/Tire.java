package car;

public class Tire extends CarPart {
	int milesTireLast;
	String tireSize;
	int tirePressure;
	
	public Tire(String tireSize, int tirePressure) {
		this.tireSize = tireSize;
		this.tirePressure = tirePressure;
		
		
		
	}
	
	private int getMilesTireLast() {
		this.milesTireLast = 600 * this.condition;
		return this.milesTireLast;
	}
	
	private void checkTireWear() {
		getMilesTireLast();
		if (milesTireLast > 8000) {
			System.out.println("There is still tread on the tires!");
		} else {
			System.out.println("Tires are almost bald. Look into replacing them soon");
		}
	}
	
	public String toString() {
		return tireSize + " Tires";
	}
	
	public void function() {
		this.status();
		System.out.println("You have " + this.tireSize + " size tires. They require " + this.tirePressure + " psi.");
		checkTireWear();
	}

}
