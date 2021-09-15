package car;

public class Simulator {

	public static void main(String[] args) {
		Engine fordEng = new Engine("4.6 Liter", 8);
		FuelTank fordTank = new FuelTank(28);
		Tire fordTire = new Tire("245/65/17", 44);
		Transmission fordTranny = new Transmission(true, 5);
		Car ford = new Car(fordEng, fordTank, fordTire, fordTranny);
		ford.run();
		System.out.println();
		System.out.println();
		ford.run();
		System.out.println();
		System.out.println();
		ford.run();
		System.out.println();
		System.out.println();
		ford.run();
		System.out.println();
		System.out.println();
		ford.run();
	}
	
	
	
}


