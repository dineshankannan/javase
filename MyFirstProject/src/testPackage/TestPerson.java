package testPackage;

import static org.junit.Assert.*;

import org.junit.Test;

import Task11Grouped.Task11LibraryPerson;

public class TestPerson {

	@Test
	public void testPersonString() {
		Task11LibraryPerson testing = new Task11LibraryPerson("12345","joe");
		assertNotNull(testing.getName());
	}
	
	
	@Test
	public void testMemberID() {
		Task11LibraryPerson testing = new Task11LibraryPerson("12345","joe");
		assertNotNull(testing.getMemberID());
	}
	
	
	@Test
	public void testGetName() {
		Task11LibraryPerson testing = new Task11LibraryPerson("12345","joe");
		assertEquals("joe",testing.getName());
	}
	
	
	@Test
	public void testGetMemberID() {
		Task11LibraryPerson testing = new Task11LibraryPerson("12345","joe");
		assertEquals("12345",testing.getMemberID());
	}
}
