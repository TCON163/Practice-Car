package car;

public class Transmission extends CarPart {
		boolean isAnAutomatic;
		int numOfGears;
		boolean isWorking;
		
		public Transmission(boolean isAnAutomatic, int numOfGears) {
			this.isAnAutomatic = isAnAutomatic;
			this.numOfGears = numOfGears;
		}
		
		private void checkTransmission() {
			if(this.condition > 15) {
				this.isWorking = true;
			}
			else {
				this.isWorking = false;
			}
		}
		
		private String typeOfTrans() {
			if (this.isAnAutomatic) {
				return "Automatic";
			}
			else {
				return "Manual";
			}
		}
		
		public String toString() {
			String type = typeOfTrans();
			return type + numOfGears + " speed Tranny";
		}
		
		public void function() {
			this.status();
			String transType = typeOfTrans();
			System.out.println("The transmission is " + transType + ". With " + numOfGears + " gears to shift through.");
			checkTransmission();
			if (this.isWorking) { System.out.println("Tranmission works fine."); } else { System.out.println("Transmission is slipping.");}
			
		}
}
