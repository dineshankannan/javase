package Task11Grouped;

public class Task11LibraryMediaResources extends Task11LibraryItems{

	//Attributes
	String itemType;
	
	
	//Constructor
	public Task11LibraryMediaResources(String itemID, String shelfID,
			String itemTitle, double itemPrice, String itemType) {
		
		super(itemID, shelfID, itemTitle, itemPrice);
		
		this.itemType = itemType;
	}
	
	
	//Methods
	public String getItemType(){
		return this.itemType;
	}
	
	public void setItemType(String itemType){
		this.itemType = itemType;
	}
	
	@Override
  	public String toString() {

	    String str = "";
	    str += getGeneralDetails();
	    str += "[Type of Media]: " + getItemType();
	    
	    return str;
  	}
}
