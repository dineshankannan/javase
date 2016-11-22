package Task11Grouped;

public class Task11LibraryBooks extends Task11LibraryItems{

	//Attributes
	String isbn;
	
	
	//Constructor
	public Task11LibraryBooks(String itemID, String shelfID, String itemTitle,
			double itemPrice, String isbn) {
		
		super(itemID, shelfID, itemTitle, itemPrice);
		
		this.isbn = isbn;
	}
	
	
	//Methods
	public String getISBN(){
		return this.isbn;
	}
	
	public void setISBN(String isbn){
		
		this.isbn = isbn;
	}
	
	  @Override
	  public String toString() {

	    String str = "";
	    str += getGeneralDetails();
	    str += "[ISBN]: " + getISBN();
	    
	    return str;
	  }
}
