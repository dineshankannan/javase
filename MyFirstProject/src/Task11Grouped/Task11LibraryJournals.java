package Task11Grouped;

public class Task11LibraryJournals extends Task11LibraryItems{

	//Attributes
	String DOI;
	
	
	//Constructor
	public Task11LibraryJournals(String itemID, String shelfID,
			String itemTitle, double itemPrice, String DOI) {
		
		super(itemID, shelfID, itemTitle, itemPrice);
		
		this.DOI = DOI;

	}
	
	
	//Methods
	public String getDOI(){
		return this.DOI;
	}
	
	public void setDOI(String DOI){
		this.DOI = DOI;
	}
	
	@Override
  	public String toString() {

	    String str = "";
	    str += getGeneralDetails();
	    str += "[DOI]: " + getDOI();
	    
	    return str;
  	}

}
