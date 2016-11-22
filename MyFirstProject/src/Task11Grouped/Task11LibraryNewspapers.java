package Task11Grouped;

public class Task11LibraryNewspapers extends Task11LibraryItems{

	//Attributes
	String nameOfNewspaper;
	
	
	//Constructor
	public Task11LibraryNewspapers(String itemID, String shelfID,
			String itemTitle, double itemPrice, String nameOfNewspaper) {
		
		super(itemID, shelfID, itemTitle, itemPrice);
		
		this.nameOfNewspaper = nameOfNewspaper;

	}

	
	//Methods
	public String getNameOfNewspaper(){
		return this.nameOfNewspaper;
	}
	
	public void setNameOfNewspaper(String nameOfNewspaper){
		this.nameOfNewspaper = nameOfNewspaper;
	}
	
	@Override
  	public String toString() {

	    String str = "";
	    str += getGeneralDetails();
	    str += "[Name of Newspaper]: " + getNameOfNewspaper();
	    
	    return str;
  	}
}
