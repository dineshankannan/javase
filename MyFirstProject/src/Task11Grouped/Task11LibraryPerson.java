package Task11Grouped;

public class Task11LibraryPerson {

	//Attributes
	String memberID;
	String name;
	
	
	//Constructor
	public Task11LibraryPerson (String memberID, String name) {
		
		this.memberID = memberID;
		this.name = name;
	}
	
	
	//Methods
	public String getMemberID(){
		return this.memberID;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setMemberID(String memberID){
		this.memberID = memberID;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	@Override
  	public String toString() {

	    String str = "";
	    str += "[Member ID]: " + getMemberID();
	    str += " ";
	    str += "[Member Name]: " + getName();
	    str += "\n";
	    
	    return str;
  	}
}
