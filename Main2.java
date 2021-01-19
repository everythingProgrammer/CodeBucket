import java.util.*;
public class Main2 {
	
	static int minDelete(int arr[], int n)
	{
	     
	    
	    HashMap<Integer, Integer> freq = new HashMap<>();
	    for(int i = 0; i < n; i++)
	        freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);

	    int max_freq = Integer.MIN_VALUE;
	    for(Map.Entry<Integer, 
	                  Integer> entry : freq.entrySet())
	        max_freq = Math.max(max_freq, 
	                            entry.getValue());
	    return n - max_freq ;
	}
	
	public static void main(String args[]) {
		try {
			Scanner sr = new Scanner(System.in);
			int num = sr.nextInt();
			int nums[] = new int[num];
			for(int i =0  ; i<num ;i++) {
				nums[i] = sr.nextInt();
				
			}
			
			 HashMap<Integer, Integer> freq = new HashMap<>();
			    for(int i = 0; i < num; i++)
			        freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
	
			    int max_freq = Integer.MIN_VALUE;
			    for(Map.Entry<Integer, 
			                  Integer> entry : freq.entrySet())
			        max_freq = Math.max(max_freq, 
			                            entry.getValue());
			    System.out.println( num - max_freq) ;
		}
		catch(Exception E) {
	}
}
}
