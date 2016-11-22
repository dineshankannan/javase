package testPackage;

import static org.junit.Assert.*;

import org.junit.Test;

import Task5Grouped.Task5Car;
import Task5Grouped.VehicleType;

public class TestCar {

	@Test
	public void testBookString() {
		Task5Car testing = new Task5Car("Audi", VehicleType.CAR, "1234");
		assertNotNull(testing.getNbOfWheels());
	}
	
	public void testBookISBN() {
		Task5Car testing = new Task5Car("Audi", VehicleType.CAR, "1234");
		assertEquals("1234", testing.getID());
	}
}
