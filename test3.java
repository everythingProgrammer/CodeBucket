import java.util.*;
public class test3 {
	  public static int solve(ArrayList<Integer> A) {
	        int n = A.size();
	        int sum = 0;
	        for(int i=0;i<n;i++) {
	            sum += A.get(i);
	        }
	        int range = sum/2;
	        boolean[][] t = new boolean[n+1][range+1];
	        for(int i=0;i<n+1;i++) {
	            for(int j=0;j<range+1;j++) {
	                if(i == 0) {
	                    t[i][j] = false;
	                }
	                if(j == 0) {
	                    t[i][j] = true;
	                }
	            }
	        }
	        
	        for(int i=1;i<n+1;i++) {
	            for(int j=1;j<range+1;j++) {
	                if(A.get(i-1) <= j) {
	                    t[i][j] = t[i-1][j-A.get(i-1)] || t[i-1][j];
	                }
	                
	                else {
	                    t[i][j] = t[i-1][j];
	                }
	            }
	        }
	        
	        int k;
	        
	        for(k=range;k>=0;k--) {
	            if(t[n][k] == true) {
	                break;
	            }
	        }
	        return sum - 2*(k);
	    }
	public static void main(String args[]) {
		ArrayList <Integer> abc = new ArrayList<>();
		abc.add(4);
		abc.add(31);
		abc.add(13);
		abc.add(-45);
		System.out.print(solve(abc));
		
	}
}