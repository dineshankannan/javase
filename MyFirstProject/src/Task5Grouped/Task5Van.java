package Task5Grouped;

public class Task5Van extends Task5Vehicle {

	//Attributes
	int nbOfWheels;
	String ID;
	
	
	//Constructor
	public Task5Van(String brand, VehicleType type, String ID) {
		
		super(brand, type);
		
		this.nbOfWheels = 2;
		this.ID = ID;
	}

	
	//Methods
	public int getNbOfWheels(){
		
		return this.nbOfWheels;
	}
	
	public String getID(){
		
		return this.ID;
	}
	
	public void start(){
		
		System.out.println("Strat");
	}
	
	public void stop(){
		
		System.out.println("Stop");
	}
	
}
