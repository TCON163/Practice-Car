package car;

public class Engine extends CarPart {
	@SuppressWarnings("unused")
	private boolean isEngineOn;
	private boolean needsOilChange;
	private String engineSize;
	private int numOfCylinders;
	
	public Engine(String engineSize, int numOfCylinders) {
		this.engineSize = engineSize;
		this.numOfCylinders = numOfCylinders;
		this.needsOilChange = false;
		
	}
	
	private void checkOil() {
		if(this.condition < 30) {
			this.needsOilChange = true;
			
		}
	}
	private void turnEngineOn() {
		if (this.condition != 0) {
		this.isEngineOn = true;
		System.out.println("Vroom! Vroom! The Engine is on.");
	} else {
		this.isEngineOn = false;
		System.out.println("BOOM! Your engine Blew :(");
	}
	}
		
	public String toString() {
		return this.engineSize;
	}
	public void function() {
		this.status();
		checkOil();
		turnEngineOn();
		
		System.out.println("The " + this.engineSize + " engine has " + this.numOfCylinders + " cylinders.");
		
		if (this.needsOilChange) {
			System.out.println("Change your Oil Soon!");
		}else {
		System.out.println("Your oil level is okay.");
	}
		
	}
	
}
