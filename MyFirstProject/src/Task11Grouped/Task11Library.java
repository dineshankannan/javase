package Task11Grouped;
import java.util.ArrayList;


public class Task11Library {

	//Attributes
	ArrayList<Task11LibraryItems> stock;
	ArrayList<Task11LibraryPerson> members;
	ArrayList<Task11LibraryBorrowed> borrowed;
	
	
	//Constructor
	public Task11Library() {
		
		this.stock = new ArrayList<Task11LibraryItems>();
		this.members = new ArrayList<Task11LibraryPerson>();
		this.borrowed = new ArrayList<Task11LibraryBorrowed>();
	}
	
	
	//Methods
	public void addItem(Task11LibraryItems item){
		
		stock.add(item);
	}
	
	public void removeItem(Task11LibraryItems item){
		
		stock.remove(item);
	}
	
	public void registerPerson(Task11LibraryPerson person){
		
		members.add(person);
	}
	
	public void deletePerson(Task11LibraryPerson person){
		
		members.remove(person);
	}
	
	public void registerBorrowed(Task11LibraryBorrowed borrowedItem){
		
		borrowed.add(borrowedItem);
	}
	
	public void deleteBorrowed(Task11LibraryBorrowed borrowedItem){
		
		borrowed.remove(borrowedItem);
	}
	
	
	//-----[Method Overloading]-----
	
	//Update person
	public void updatePerson(Task11LibraryPerson person, String newMemberID, String newName){
		
		for(Task11LibraryPerson member: members){
			
			if (member.memberID == person.memberID){
				
				member.setMemberID(newMemberID);
				member.setName(newName);
			}
		}
	}
	
	//Update book
	public void updateItem(Task11LibraryBooks book, String itemID, String shelfID, String itemTitle, double itemPrice, String isbn){
		
		for(Task11LibraryItems item: stock){
			
			if (item.itemID == book.itemID){
				
				book.setItemID(itemID);
				book.setShelfID(shelfID);
				book.setItemTitle(itemTitle);
				book.setItemPrice(itemPrice);
				book.setISBN(isbn);
			}
		}
	}
	
	//Update dissertation
	public void updateItem(Task11LibraryDissertation dissertation, String itemID, String shelfID, String itemTitle, double itemPrice, String subject){
		
		for(Task11LibraryItems item: stock){
			
			if (item.itemID == dissertation.itemID){
				
				dissertation.setItemID(itemID);
				dissertation.setShelfID(shelfID);
				dissertation.setItemTitle(itemTitle);
				dissertation.setItemPrice(itemPrice);
				dissertation.setSubject(subject);
			}
		}
	}
	
	
	//Update Government Documents
	public void updateItem(Task11LibraryGovernmentDocuments  governmentDocuments, String itemID, String shelfID, String itemTitle, double itemPrice, String department){
		
		for(Task11LibraryItems item: stock){
			
			if (item.itemID == governmentDocuments.itemID){
				
				governmentDocuments.setItemID(itemID);
				governmentDocuments.setShelfID(shelfID);
				governmentDocuments.setItemTitle(itemTitle);
				governmentDocuments.setItemPrice(itemPrice);
				governmentDocuments.setDepartment(department);
			}
		}
	}
	
	
	//Update Journals
	public void updateItem(Task11LibraryJournals  journals, String itemID, String shelfID, String itemTitle, double itemPrice, String DOI){
		
		for(Task11LibraryItems item: stock){
			
			if (item.itemID == journals.itemID){
				
				journals.setItemID(itemID);
				journals.setShelfID(shelfID);
				journals.setItemTitle(itemTitle);
				journals.setItemPrice(itemPrice);
				journals.setDOI(DOI);
			}
		}
	}
	
	
	//Update Magazine
	public void updateItem(Task11LibraryMagazines magazine, String itemID, String shelfID, String itemTitle, double itemPrice, String nameOfMagazine){
		
		for(Task11LibraryItems item: stock){
			
			if (item.itemID == magazine.itemID){
				
				magazine.setItemID(itemID);
				magazine.setShelfID(shelfID);
				magazine.setItemTitle(itemTitle);
				magazine.setItemPrice(itemPrice);
				magazine.setNameOfMagazine(nameOfMagazine);
			}
		}
	}
	
	
	//Update Maps
	public void updateItem(Task11LibraryMaps map, String itemID, String shelfID, String itemTitle, double itemPrice, String country){
		
		for(Task11LibraryItems item: stock){
			
			if (item.itemID == map.itemID){
				
				map.setItemID(itemID);
				map.setShelfID(shelfID);
				map.setItemTitle(itemTitle);
				map.setItemPrice(itemPrice);
				map.setCountry(country);
			}
		}
	}
	
	
	//Update MediaResources
	public void updateItem(Task11LibraryMediaResources MediaResource, String itemID, String shelfID, String itemTitle, double itemPrice, String itemType){
		
		for(Task11LibraryItems item: stock){
			
			if (item.itemID == MediaResource.itemID){
				
				MediaResource.setItemID(itemID);
				MediaResource.setShelfID(shelfID);
				MediaResource.setItemTitle(itemTitle);
				MediaResource.setItemPrice(itemPrice);
				MediaResource.setItemType(itemType);
			}
		}
	}
	
	
	//Update Newspapers
	public void updateItem(Task11LibraryNewspapers Newspaper, String itemID, String shelfID, String itemTitle, double itemPrice, String nameOfNewspaper){
		
		for(Task11LibraryItems item: stock){
			
			if (item.itemID == Newspaper.itemID){
				
				Newspaper.setItemID(itemID);
				Newspaper.setShelfID(shelfID);
				Newspaper.setItemTitle(itemTitle);
				Newspaper.setItemPrice(itemPrice);
				Newspaper.setNameOfNewspaper(nameOfNewspaper);
			}
		}
	}
	
	
	//Update Theses
	public void updateItem(Task11LibraryTheses Theses, String itemID, String shelfID, String itemTitle, double itemPrice, String subject){
		
		for(Task11LibraryItems item: stock){
			
			if (item.itemID == Theses.itemID){
				
				Theses.setItemID(itemID);
				Theses.setShelfID(shelfID);
				Theses.setItemTitle(itemTitle);
				Theses.setItemPrice(itemPrice);
				Theses.setSubject(subject);
			}
		}
	}
	
	
	public void getAllItemsAndMembers(){
		
		System.out.println("========[Library Items]=========" + "\n");
		
		for (Task11LibraryItems item : stock){
			
			System.out.println(item.toString() + "\n");
		}
		
		System.out.println("=======[Library Members]=========" + "\n");
		
		for (Task11LibraryPerson person : members){
					
					System.out.println(person.toString() + "\n");
				}
		
		System.out.println("=======[Library Borrowed Items]=========" + "\n");
		
		for (Task11LibraryBorrowed borrowItem : borrowed){
					
					System.out.println(borrowItem.toString() + "\n");
				}
	}
}
