package testPackage;

import static org.junit.Assert.*;

import org.junit.Test;

import Task11Grouped.Task11LibraryBooks;

public class TestBook {

	@Test
	public void testBookString() {
		Task11LibraryBooks testing = new Task11LibraryBooks("Book01", "shelf_IT01", "Java All-in-One For Dummies", 22, "1118408039");
		assertNotNull(testing.getGeneralDetails());
	}
	
	public void testBookISBN() {
		Task11LibraryBooks testing = new Task11LibraryBooks("Book01", "shelf_IT01", "Java All-in-One For Dummies", 22, "1118408039");
		assertEquals("1118408039", testing.getISBN());
	}
}
