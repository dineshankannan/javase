package Task12Grouped;

public class Stage1 {

	public static void main (String[]args){

		int board[][] = new int[3][3];
		
		initialiseBoard(board);
		showBoard(board);
		System.out.print("Emty board"); 
		System.out.print("\n");  
		
		placePatrolBoat(board);
		showBoard(board);
		System.out.print("board with 1 x boat");
	}
	
	
	public static void initialiseBoard(int board [][]){
		
		for(int row = 0; row<3; row++){
			
			for(int column = 0; column<3; column++){
				
				board[row][column] = 0;
			}
		}
	}
	
	
	public static void showBoard(int board [][]){
	  
	  System.out.println("\t1 \t2 \t3");  
	

      for(int row = 0; row<3; row++){
			
    	  System.out.print((row+1)+"");
			
    	  for(int column = 0; column<3; column++){
				
    		  if(board[row][column] == -0){
					
    			  System.out.print("\t"+"0"); 
					
				  }else if(board[row][column]==2){
					
					  System.out.print("\t"+"x");  
				}
			}
    	  
    	  System.out.println();  
		}
	}
	
	
	public static void placePatrolBoat(int board [][]){
		
		board[1][2] = 2;
		board[2][2] = 2;
	}
}
