package Task11Grouped;

public class Task11 {

	public static void main(String[] args) {
		
		//people
		Task11LibraryPerson person01 = new Task11LibraryPerson("Person 01", "Lionnel Messi");
		Task11LibraryPerson person02 = new Task11LibraryPerson("Person 02", "Christiano Ronaldo");
		
		//items
		Task11LibraryItems book01 = new Task11LibraryBooks("Book01", "shelf_IT01", "Java All-in-One For Dummies", 22, "1118408039");
		Task11LibraryItems book02 = new Task11LibraryBooks("Book02", "shelf_IT02", "An Introduction To Enterprise Architecture: Third Edition ", 15.69, "1477258000");
		
		Task11LibraryItems dissertation01 = new Task11LibraryDissertation("Dissertation01", "shelf_dissertation01", "Economic growth", 0, "Business");
		Task11LibraryItems dissertation02 = new Task11LibraryDissertation("Dissertation02", "shelf_dissertation02", "IT and globalisation", 0, "Computing");

		Task11LibraryItems GovernmentDocument01 = new Task11LibraryGovernmentDocuments("GovernmentDocument01", "shelf_GovernmentDocument01", "Local Construction", 0, "Construction");
		Task11LibraryItems GovernmentDocument02 = new Task11LibraryGovernmentDocuments("GovernmentDocument02", "shelf_GovernmentDocument02", "Local Schools", 0, "Education");
		
		Task11LibraryItems journals01 = new Task11LibraryJournals("Journals01", "shelf_journal01", "Economic growth", 0, "Journal of Computing");
		Task11LibraryItems journals02 = new Task11LibraryJournals("Journals02", "shelf_journal02", "IT and globalisation", 0, "Journal of Economics");
		
		Task11LibraryItems magazines01 = new Task11LibraryMagazines("Magazine01", "shelf_magazine01", "Elections", 0, "NewYork Times");
		Task11LibraryItems magazines02 = new Task11LibraryMagazines("Magazine02", "shelf_magazine02", "League results", 0, "Sports Magazines");
		
		Task11LibraryItems map01 = new Task11LibraryMaps("Map01", "shelf_Map01", "Collins Map of Britain", 4.99, "Britain");
		Task11LibraryItems map02 = new Task11LibraryMaps("Map02", "shelf_Map02", "Comprehensive Road Atlas Ireland", 7.49, "Ireland");
		
		Task11LibraryItems mediaResources01 = new Task11LibraryMediaResources("MediaResource01", "shelf_MediaResources01", "World war 1", 11.89, "DVD");
		Task11LibraryItems mediaResources02 = new Task11LibraryMediaResources("MediaResource02", "shelf_MediaResources02", "World war 1", 11.89, "Audio");
		
		Task11LibraryItems newspapers01 = new Task11LibraryJournals("Newspapers01", "shelf_newspapers01", "Brexit", 0, "The guardian");
		Task11LibraryItems newspapers02 = new Task11LibraryJournals("Newspapers02", "shelf_newspapers02", "Financial Market", 0, "Financial Times");
		
		Task11LibraryItems theses01 = new Task11LibraryTheses("Theses01", "shelf_theses01", "human body", 0, "biology");
		Task11LibraryItems theses02 = new Task11LibraryTheses("Theses02", "shelf_theses02", "Gravity", 0, "Physics");
		
		//Borrowed Items
		Task11LibraryBorrowed borrowedItem01 = new Task11LibraryBorrowed(book01, person01);
		Task11LibraryBorrowed borrowedItem02 = new Task11LibraryBorrowed(book02, person02);
		
		Task11Library library = new Task11Library();
		
		//Add people
		library.registerPerson(person01);
		library.registerPerson(person02);
		
		//Add items
		library.addItem(book01);
		library.addItem(book02);
		
		library.addItem(dissertation01);
		library.addItem(dissertation02);
		
		library.addItem(map01);
		library.addItem(map02);
		
		library.addItem(GovernmentDocument01);
		library.addItem(GovernmentDocument02);
		
		library.addItem(journals01);
		library.addItem(journals02);
		
		library.addItem(magazines01);
		library.addItem(magazines02);
		
		library.addItem(mediaResources01);
		library.addItem(mediaResources02);
		
		library.addItem(newspapers01);
		library.addItem(newspapers02);
		
		library.addItem(theses01);
		library.addItem(theses02);
		
		//Add Borrowed Items
		library.registerBorrowed(borrowedItem01);
		library.registerBorrowed(borrowedItem02);
		
		//Display all borrowed items 
		library.getAllItemsAndMembers();
	}

}
