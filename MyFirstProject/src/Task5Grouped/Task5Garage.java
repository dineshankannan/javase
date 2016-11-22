package Task5Grouped;
import java.util.ArrayList;


public class Task5Garage {

	//Attributes
	ArrayList<Task5Vehicle> garage;
	
	
	//Constructor
	public Task5Garage(){
		
		this.garage = new ArrayList<Task5Vehicle>();
	}
	
	
	//Methods
	
	public void emty(){
		
		garage.clear();
	}
	
	
	//-----[Method Overloading]-----
	
	public void add (Task5Car car){
		
		garage.add(car);
	}
	
	
	public void add (Task5Bike bike){
		
		garage.add(bike);
	}
	
	public void add (Task5Van van){
		
		garage.add(van);
	}
	
	public void remove (Task5Car car){
		
		garage.remove(car);
	}
	
	
	public void remove (Task5Bike bike){
		
		garage.remove(bike);
	}
	
	public void remove (Task5Van van){
		
		garage.remove(van);
	}
	

	public void fix(Task5Car car){
		
		int carBill = 0;
		
		for(Task5Vehicle vehicle:garage){
			
			if(vehicle.equals(car)){
				
				carBill = 200;
				
				System.out.println("Vehicle Type: " + car.type +"||"+vehicle.brand + "||" + "bill" + " " + "=" + " " + carBill);
			}
		}	
	}
	
	
	public void fix(Task5Bike bike){
		
		int bikeBill = 0;
		
		for(Task5Vehicle bikes:garage){
			
			if(bikes.equals(bike)){
				
				bikeBill = 150;
				
				System.out.println("Vehicle Type: " + bike.type + "||" + bikes.brand + "||" + "bill" + ""+ "=" + " " + bikeBill);
			}
		}	
	}
	
	
	public void fix(Task5Van van){
			
		int vanBill = 0;
		
		for(Task5Vehicle bikes:garage){
			
			if(bikes.equals(van)){
				
				vanBill = 450;
				
				System.out.println("Vehicle Type: " + van.type + "||" + van.brand + "||" + "bill" + ""+ "=" + " " + vanBill);
			}
		}	
	}
}
