
import java.util.*;
public	class Solution {
//	      private int row;
//	    private int col;
//	    private int count = 0;
	    public static int countSquares(int[][] matrix) {
	        int row = matrix.length;
	        int col = matrix[0].length;
	        int count = 0;
	        for (int i = 0; i < row; i++){
	            for (int j = 0; j < col; j++){
	               if(matrix[i][j] == matrix[row -1-i][col-1-j] && i >0 && j > 0){
	                   matrix[i][j] = Math.min(matrix[i][j-1], Math.min(matrix[i-1][j], matrix[i-1][j-1]))+1;
	               }
	               count+= 1;
	            }
	        }
	        return count;
	    }
	    
	    public static void main(String args[]) {
	    	Scanner sr = new Scanner(System.in);
	    	int N = sr.nextInt();
	    	int matrix[][] = new int[N][N];
	    	for(int i = 0 ;i< N ;i++) {
	    		for(int j =  0; j<N; j++) {
	    			matrix[i][j] = sr.nextInt();
	    		}
	    	}
	    	System.out.println(countSquares(matrix));
	    }

	}
