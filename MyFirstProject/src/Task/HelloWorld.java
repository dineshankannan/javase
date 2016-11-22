package Task;

import javax.swing.JOptionPane;

public class HelloWorld {
	
	public static void main (String[]args){

		String input = JOptionPane.showInputDialog("Enter Message");
		
		JOptionPane.showMessageDialog(null, input);
		
		System.out.println(input);	
	}
}
