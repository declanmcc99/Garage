package garage;
import java.util.ArrayList;

public class Garage {

	ArrayList<Vehicle> garage = new ArrayList<>();
	
	public void addToGarage(Vehicle vehicle) {
		garage.add(vehicle);
		System.out.println(vehicle.getBrand() + " has been added to the garage");
	}
		
	public void listVehicles() {
		for(Vehicle vehicle : garage) {
			System.out.println(vehicle.getBrand());
		}
	}
		
		
	public void removeVehicles(int iD) {

		for(Vehicle vehicle : garage) {
			if(iD == vehicle.getiD()) {
				garage.remove(iD-1); break;
			};
		}
	}
	
	public void clearGarage() {
		garage.clear();
		System.out.println("Garage has been cleared out");
	}
	
	public void fixVehicle(Vehicle vehicle) {
		
		System.out.println("Total bill is......" + vehicle.calcBill());
	}
	
	
}
