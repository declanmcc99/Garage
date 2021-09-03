package garage;

public class Vehicle {

	public int iD;
	public String brand;
	public String colour;
	public int wheels;
	public int year;
	public boolean isElectric;
	
	
	
	public Vehicle(int year, String brand, String colour, int wheels, int iD, boolean isElectric) {
		super();
		this.year = year;
		this.brand = brand;
		this.colour = colour;
		this.wheels = wheels;
		this.iD = iD;
		this.isElectric = isElectric;
	}


	public float calcBill() {
		
		int totalBill = 0;
		totalBill += (wheels*100);
		
		if(brand == "ferrari") {
			totalBill += 7500;
			
		}
		
		return totalBill;		
		
	}
	

	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public String getBrand() {
		return brand;
	}



	public void setBrand(String brand) {
		this.brand = brand;
	}



	public String getColour() {
		return colour;
	}



	public void setColour(String colour) {
		this.colour = colour;
	}



	public int getWheels() {
		return wheels;
	}



	public void setWheels(int wheels) {
		this.wheels = wheels;
	}



	public int getiD() {
		return iD;
	}



	public void setiD(int iD) {
		this.iD = iD;
	}



	public boolean isElectric() {
		return isElectric;
	}



	public void setElectric(boolean isElectric) {
		this.isElectric = isElectric;
	}
	
	
	
}
