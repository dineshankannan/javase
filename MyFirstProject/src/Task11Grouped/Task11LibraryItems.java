package Task11Grouped;

public abstract class  Task11LibraryItems {
	
	//Attributes
	String itemID;
	String shelfID;
	String itemTitle;
	double itemPrice;
	
	
	//Constructor
	public Task11LibraryItems(String itemID, String shelfID, String itemTitle, double itemPrice){
		
		this.itemID = itemID;
		this.shelfID = shelfID;
		this.itemTitle = itemTitle;
		this.itemPrice = itemPrice;
	}

	
	//Methods
	public String getItemID(){
		return this.itemID;
	}
	
	public String getShelfID(){
		return this.shelfID;
	}
	
	public String getItemTitle(){
		return this.itemTitle;
	}
	
	public double getItemPrice(){
		return this.itemPrice;
	}
	
	public void setItemID(String itemID){
		
		this.itemID = itemID;
	}
	
	public void setShelfID(String shelfID){
		
		this.shelfID = shelfID;
	}
	
	public void setItemTitle(String itemTitle){
		
		this.itemTitle = itemTitle;
	}
	
	public void setItemPrice(double itemPrice){
		
		this.itemPrice = itemPrice;
	}
	
	
	public String getGeneralDetails(){
		
		String str = "";
		
		str += "[Item ID]: " + getItemID();
		str += "\n";
		str += "[Shelf ID]: " + getShelfID();
		str += " ";
		str += "[Item Title]: " + getItemTitle();
		str += " ";
		str += "[Item Price]: " + getItemPrice();
		str += " ";
		
		return str;
	}
}
