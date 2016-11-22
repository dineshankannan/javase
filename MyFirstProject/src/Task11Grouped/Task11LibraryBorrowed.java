package Task11Grouped;

public class Task11LibraryBorrowed {

	//Attributes
	Task11LibraryItems item;
	Task11LibraryPerson member;
	
	
	//Constructor
	public Task11LibraryBorrowed(Task11LibraryItems item, Task11LibraryPerson member){
		
		this.item = item;
		this.member = member;
	}
	
	
	//Methods
	public Task11LibraryItems getBorrowedItem(){
		return this.item;
	}
	
	public Task11LibraryPerson getBorrowedMember(){
		return this.member;
	}

	
	@Override
  	public String toString() {

	    String str = "";
	    str += getBorrowedItem();
	    str += "\n";
	    str += "[Borrowed By]: ";
	    str += " ";
	    str += getBorrowedMember();
	    
	    return str;
  	}
}
