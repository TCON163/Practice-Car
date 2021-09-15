package car;


import java.util.ArrayList;
import java.util.Iterator;

public class Car {
	
	Engine eng;
	FuelTank fuel;
	Tire wheels;
	Transmission tranny;
	ArrayList<CarPart> carPartList = new ArrayList<CarPart>();
	
	public Car(Engine eng, FuelTank fuel, Tire wheels, Transmission tranny) {
		this.eng = eng;
		this.fuel = fuel;
		this.wheels = wheels;
		this.tranny = tranny;
		carPartList.add(this.eng);
		carPartList.add(this.fuel);
		carPartList.add(this.wheels);
		carPartList.add(this.tranny);
		
	}
	
	public static void main(String[] args) {
		Engine fordEng = new Engine("4.6 Liter", 8);
		FuelTank fordTank = new FuelTank(28);
		Tire fordTire = new Tire("245/65/17", 44);
		Transmission fordTranny = new Transmission(true, 5);
		Car ford = new Car(fordEng, fordTank, fordTire, fordTranny);
		ford.run();
		
	}
	public  void run() {
		Iterator<CarPart> iterator = carPartList.iterator();
		while (iterator.hasNext()) {
			CarPart obj = iterator.next();
			obj.function();
			obj.condition -=25;

		}
			
		}
}
	

