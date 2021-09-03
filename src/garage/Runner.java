package garage;

public class Runner {
	
	public static void main(String[] args) {
		
		Car car1 = new Car(2015, "ferrari", "white", 4, 1, false, 4, false);
		Car car2 = new Car(2021, "aston martin", "grey", 4, 2, false, 5, true);
		Car car3 = new Car(2018, "bmw", "blue", 4, 3, true, 4, true);
		
		Motorbike mbike1 = new Motorbike(2018, "Yamaha MT03", "black", 2, 4, false, true, 200);
		Motorbike mbike2 = new Motorbike(2001, "Suzuki tricycle", "red", 3, 5, true, false, 120);
		
		Van van1 = new Van(2005, "Ford Transit" , "white", 6, 6, false, true, 1000);
		Van van2 = new Van(2013, "Volvo Lancer", "Green", 4, 7, true, false, 500);
		
		System.out.println(car1.getColour());
		System.out.println(mbike2.pillion);
		
		Garage garage = new Garage();
		
		garage.addToGarage(car1);
		garage.addToGarage(car2);
		garage.addToGarage(car3);
		garage.addToGarage(mbike1);
		garage.addToGarage(mbike2);
		garage.addToGarage(van1);
		garage.addToGarage(van2);
		
		garage.listVehicles();
		
		
		System.out.println(car1.calcBill());
		
		garage.removeVehicles(1);
		garage.listVehicles();
		
		garage.fixVehicle(car2);
		garage.fixVehicle(mbike1);
		
		
	}

}
