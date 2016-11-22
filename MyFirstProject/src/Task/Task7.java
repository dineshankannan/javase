package Task;
import javax.swing.JOptionPane;

 public class Task7 {

	public static void main(String[] args) {

		final long startTime = System.nanoTime();
		
		int enterNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter Number"));
        System.out.println("List of prime numbers upto "+ enterNumber);
        
        for (int i = 2; i <= enterNumber; i++) {
        	
            if (isPrime(i)) {
            	
                System.out.println(i);
            }
        }
        
        final long duration = (System.nanoTime() - startTime) / 1000000000;
        
        System.out.println("Time elapsed: "+ duration + " seconds");
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
 }