package Task5Grouped;

public class Task5Car extends Task5Vehicle{

	//Attributes
	int nbOfWheels;
	String ID;
	
	//Constructor
	public Task5Car(String brand, VehicleType type, String ID) {
		
		super(brand, type);
		
		this.nbOfWheels = 4;
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
		
		System.out.println("Start");
	}
	
	public void stop(){
		
		System.out.println("Stop");
	}
	
}
