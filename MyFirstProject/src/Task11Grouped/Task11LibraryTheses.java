package Task11Grouped;

public class Task11LibraryTheses extends Task11LibraryItems{

	//Attributes
	String subject;
	
	
	//Constructor
	public Task11LibraryTheses(String itemID, String shelfID,
			String itemTitle, double itemPrice, String subject) {
		
		super(itemID, shelfID, itemTitle, itemPrice);
		
		this.subject = subject;
	}
	
	
	//Methods
	public String getSubject(){
		return this.subject;
	}
	
	public void setSubject(String subject){
		this.subject = subject;
	}
	
	@Override
  	public String toString() {

	    String str = "";
	    str += getGeneralDetails();
	    str += "[Subject]: " + getSubject();
	    
	    return str;
  	}
}
