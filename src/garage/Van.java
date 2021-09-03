package garage;

public class Van extends Vehicle {

	public boolean hasTowBar;
	public int load;
	
	public Van(int year, String brand, String colour, int wheels, int iD, boolean isElectric, boolean hasTowBar,int load) {
		super(year, brand, colour, wheels, iD, isElectric);
		// TODO Auto-generated constructor stub
		this.hasTowBar = hasTowBar;
		this.load = load;
	}

	public boolean isHasTowBar() {
		return hasTowBar;
	}

	public void setHasTowBar(boolean hasTowBar) {
		this.hasTowBar = hasTowBar;
	}

	public int getLoad() {
		return load;
	}

	public void setLoad(int load) {
		this.load = load;
	}
	
	
	@Override	
	public float calcBill() {
		
		int totalBill = 0;
		totalBill += (wheels*1000);
		
		if(brand == "Ford") {
			totalBill += 1000;
			
		}
		
		return totalBill;		
		
	}
	

}
