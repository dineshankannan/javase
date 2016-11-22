package testPackage;

import static org.junit.Assert.*;

import org.junit.Test;

import Task11Grouped.Task11LibraryDissertation;

public class TestDissertation {

	@Test
	public void testDissertationString() {
		Task11LibraryDissertation testing = new Task11LibraryDissertation("Dissertation01", "shelf_dissertation01", "Economic growth", 0, "Business");
		assertNotNull(testing.getGeneralDetails());
	}
	
	public void testDissertationSubject() {
		Task11LibraryDissertation testing = new Task11LibraryDissertation("Dissertation01", "shelf_dissertation01", "Economic growth", 0, "Business");
		assertEquals("business", testing.getSubject());
	}

}
