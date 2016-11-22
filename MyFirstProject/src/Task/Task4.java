package Task;

public class Task4 {

	public static void main(String[] args) {

		String string = "String";
		
	    String result="";
	    
	    for (int i=string.length()-1; i>=0; i--) {
	        result = result + string.charAt(i);
	    }
	    System.out.println(result);
	}

}
