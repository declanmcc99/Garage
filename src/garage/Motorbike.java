package garage;

public class Motorbike extends Vehicle {
	
	public boolean pillion;
	public int maxSpeed;

	public Motorbike(int year, String brand, String colour, int wheels, int iD, boolean isElectric, boolean pillion, int maxSpeed) {
		super(year, brand, colour, wheels, iD, isElectric);
		// TODO Auto-generated constructor stub
		this.pillion = pillion;
		this.maxSpeed = maxSpeed;
	}

	public boolean isPillion() {
		return pillion;
	}

	public void setPillion(boolean pillion) {
		this.pillion = pillion;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	@Override	
	public float calcBill() {
		
		int totalBill = 0;
		totalBill += (wheels*400);
		
		if(brand == "Yamaha MT03") {
			totalBill += 2000;
			
		}
		
		return totalBill;		
		
	}

}
