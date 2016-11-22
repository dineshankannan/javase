package Task;

import javax.swing.JOptionPane;

public class Task9 {

	public static void main(String[] args) {

		//take user input and convert to character array to get individual characters
		char[] string1 = JOptionPane.showInputDialog("Enter String").toCharArray();
		char[] string2 = JOptionPane.showInputDialog("Enter String").toCharArray();

		int N = string1.length;
		int M = string2.length;

		// store the length of each string X[0..m-1] and Y[0..n-1]
		int[][] lcs_table = new int[N + 1][M + 1];

		for (int i = 0; i <= N; i++) {
			
			for (int j = 0; j <= M; j++) {
				
				if (i == 0 || j == 0){
					
					lcs_table[i][j] = 0;
					
				}else if (string1[i-1] == string2[j-1]){
					
					lcs_table[i][j] = 1 + lcs_table[i - 1][j - 1];
					
				}else{
					
					lcs_table[i][j] = Math.max(lcs_table[i - 1][j], lcs_table[i][j - 1]);
				}
			}
		}
		
		System.out.println("Lenght of LCS: " + lcs_table[N][M]);
		
		int index = lcs_table[N][M];
		
		char[] lcs = new char[index+1];
		
		int i = N;
		int j = M;
		
		while (i>0 && j>0){
			
			if(string1[i-1] == string2[j-1]){
				
				lcs[index-1] = string1[i-1];
				i--; j--; index--;
				
			}else if (lcs_table[i-1][j] > lcs_table[i][j-1]){
				
				i--;
			}else{
				j--;
			}
			
			String newstring = "";
			
			for (char c: lcs){
				
				newstring += c;
			}
			System.out.println("String 1 and String 2: " +newstring);
		}
		


	}
}
