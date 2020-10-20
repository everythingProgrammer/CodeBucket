package unknown;
import java.util.*;
public class Friends {
	
	public static void main(String args[]) {
		   int T = 0;
		    Scanner sr = new Scanner(System.in);
		    T = sr.nextInt(); 
		    int n[] = new int[T];
		    int k[] = new int[T];
		    int popularity[][] = new int [T][];
		    
		    for(int i = 0 ; i<T; i++) {
		    	n[i] = sr.nextInt();
		    	k[i] = sr.nextInt();
		    	popularity[i] = new int [n[i]];
		    	for(int j = 0 ; j<n[i] ; j++) {
		    		popularity[i][j] = sr.nextInt();
		    	}
		    }
		    /*This marks completeion of input */
		     
		    boolean track[] = new boolean[T];
		    
		    int count[] = new int[T];
		    for(int i = 0 ; i< T; i++) {
		    	count[i] = 0; 
		    	int rcount = k[i];
		    	for(int j= 0 ; j<n[i]-1 ; j++) {
		    		if(popularity[i][j] < popularity[i][j+1])
		    		{
		    			popularity[i][j] = -999; 
		    			count[i]++;
		    		}
		    		if(count[i] == rcount ) {
		    			track[i] = true;
		    			break; 
		    		}
		    	}
		    }
		
		    /*Now cover if all friends can't be deleted
		     * bs seedhe seedhe -999 jo nhi hai unhe -999 krde... */
		    
		    for(int i = 0 ; i< T; i++) {
		    	for(int j = 0 ; j<n[i] ; j++) {
		    		
		    		if(count[i] == k[i]) {
		    			continue; 
		    		}
		    		else {
		    			for(int l = 0 ; l < popularity[i].length && count[i] < k[i]; l++) {
		    				if(popularity)
		    			}
		    		}
		    		
		    	}
		    }
		    
		    
		    /*Now we just have to display */
		
	}
}
