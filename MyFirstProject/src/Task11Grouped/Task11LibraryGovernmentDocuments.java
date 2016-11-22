package Task11Grouped;

public class Task11LibraryGovernmentDocuments extends Task11LibraryItems{

	//Attributes
	String department;
	
	
	//constructor
	public Task11LibraryGovernmentDocuments(String itemID, String shelfID,
			String itemTitle, double itemPrice, String department) {
		
		super(itemID, shelfID, itemTitle, itemPrice);
		
		this.department = department;
	}
	
	
	//Methods
	public String getDepartment(){
		
		return this.department;
	}
	
	public void setDepartment(String department){
		
		this.department = department;
	}
	
  @Override
  	public String toString() {

	    String str = "";
	    str += getGeneralDetails();
	    str += "[Department]: " + getDepartment();
	    
	    return str;
  	}
}
