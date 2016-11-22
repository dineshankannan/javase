package Task11Grouped;

public class Task11LibraryMagazines extends Task11LibraryItems{

	//Attributes
	String nameOfMagazine;
	
	
	//Constructor
	public Task11LibraryMagazines(String itemID, String shelfID,
			String itemTitle, double itemPrice, String nameOfMagazine) {
		
		super(itemID, shelfID, itemTitle, itemPrice);
		
		this.nameOfMagazine = nameOfMagazine;

	}
	
	
	//Methods
	public String getNameOfMagazine(){
		return this.nameOfMagazine;
	}
	
	public void setNameOfMagazine(String nameOfMagazine){
		this.nameOfMagazine = nameOfMagazine;
	}
	
	@Override
  	public String toString() {

	    String str = "";
	    str += getGeneralDetails();
	    str += "[Name of Magazine]: " + getNameOfMagazine();
	    
	    return str;
  	}

}