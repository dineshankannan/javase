package Task;
import javax.swing.JOptionPane;


public class Task2 {

	public static void main(String[] args) {
		
		String star = "";
		
		int userInput = Integer.parseInt(JOptionPane.showInputDialog("Enter Number"));
		
		for(int i = 0; i<userInput; i++){
			
			System.out.println(star += "*");	
			
		}
	}

}
