package Task5Grouped;

public class Task5 {

	
	public static void main(String[]args){
		
		Task5Garage testGarage = new Task5Garage();
		
		Task5Car testCar = new Task5Car("Audi", VehicleType.CAR, "1234" );
		Task5Bike testBike = new Task5Bike("yamaha", VehicleType.BIKE, "5678" );
		Task5Van testVan = new Task5Van("renault", VehicleType.VAN, "789");
		
		Task5Car testCar2 = new Task5Car("nissan", VehicleType.CAR, "4564" );
		Task5Bike testBike2 = new Task5Bike("honda", VehicleType.BIKE, "7897" );
		Task5Van testVan2 = new Task5Van("benz", VehicleType.VAN, "852");
		
		
		testGarage.add(testCar);
		testGarage.add(testBike);
		testGarage.add(testVan);
		
		testGarage.add(testCar2);
		testGarage.add(testBike2);
		testGarage.add(testVan2);
		
		testGarage.fix(testCar);
		testGarage.fix(testBike);
		testGarage.fix(testVan);
		
		testGarage.fix(testCar2);
		testGarage.fix(testBike2);
		testGarage.fix(testVan2);
	}
	
}
