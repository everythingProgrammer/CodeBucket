import java.util.*;
public class kthsmallest {
	public static int kthSmallest(Integer[] arr,int k)
	{

		Arrays.sort(arr);

		return arr[arr.length - k ];
	}
	
	public static void main(String args[]) {
		 	Integer arr[] = new Integer[] { 12, 3, 5, 7, 19 };
	        int k = 1;
	        System.out.print("K'th smallest element is " + kthSmallest(arr, k));
		
		
	}
	
	
}
