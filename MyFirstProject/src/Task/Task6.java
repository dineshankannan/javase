package Task;
import javax.swing.JOptionPane;


public class Task6 {


	public void calculate(){

		
		double roomSize = Integer.parseInt(JOptionPane.showInputDialog("Enter Size of Room"));

		double cheapoMaxCost = Math.ceil(roomSize/200) * 19.99;
		double averageJoesCost =  Math.ceil(roomSize/165) * 17.99;
		double duluxourousPaintsxCost =  Math.ceil(roomSize/200) * 25;
		
		System.out.println("CheapoMax"+" "+"="+" "+cheapoMaxCost);
		System.out.println("");
		System.out.println("AverageJoes"+" "+"="+" "+averageJoesCost);
		System.out.println("");
		System.out.println("DuluxourousPaints"+" "+"="+" "+duluxourousPaintsxCost);
	}

	public static void main (String[]args){
		
		Task6 t = new Task6();
		t.calculate();
	}
}