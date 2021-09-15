package car;

interface CarPartInterface {
	void function();
}

public abstract class CarPart implements CarPartInterface {
	// condition - an integer that starts at 100 and goes down to 0
	int condition;
	
	public CarPart() {
		this.condition = 100;
		
	}
	public void status() {
		System.out.println("The condition of " + this.toString() +" is : " + condition);
	}
	@Override
	public abstract void function();
}

