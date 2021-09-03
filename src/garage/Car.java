package garage;

public class Car extends Vehicle{
	
	public int passengers;
	public boolean spareWheel;

	public Car(int year, String brand, String colour, int wheels, int iD, boolean isElectric, int passengers, boolean spareWheel) {
		super(year, brand, colour, wheels, iD, isElectric);
		this.passengers = passengers;
		this.spareWheel = spareWheel;
		// TODO Auto-generated constructor stub
	}
	
	@Override	
	public float calcBill() {
		
		int totalBill = 0;
		totalBill += (wheels*200);
		
		if(brand == "ferrari") {
			totalBill += 7500;
			
		}
		
		return totalBill;		
		
	}
	

	public int getPassengers() {
		return passengers;
	}

	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}

	public boolean isSpareWheel() {
		return spareWheel;
	}

	public void setSpareWheel(boolean spareWheel) {
		this.spareWheel = spareWheel;
	}
	
	

	

	
	
	
	

}
