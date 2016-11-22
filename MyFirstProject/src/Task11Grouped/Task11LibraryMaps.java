package Task11Grouped;

public class Task11LibraryMaps extends Task11LibraryItems{

	//Attributes
	String country;
	
	
	//Constructor
	public Task11LibraryMaps(String itemID, String shelfID, String itemTitle,
			double itemPrice, String country) {
		
		super(itemID, shelfID, itemTitle, itemPrice);
		
		this.country = country;

	}

	
	//Methods
	public String getCountry(){
		return this.country;
	}
	
	public void setCountry(String country){
		this.country = country;
	}
	
	@Override
  	public String toString() {

	    String str = "";
	    str += getGeneralDetails();
	    str += "[Country]: " + getCountry();
	    
	    return str;
  	}
}
