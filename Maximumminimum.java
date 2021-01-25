import java.util.*; 

public class Maximumminimum {
	public static int maxSum(int arr[], int k) 
	{ 
		// k must be greater 
		int n = arr.length;
		if (n < k) 
		{ 
		System.out.println("Invalid"); 
		return -1; 
		} 
		int res = 0; 
		for (int i=0; i<k; i++) 
		res += arr[i]; 
		int curr_sum = res; 
		for (int i=k; i<n; i++) 
		{ 
		curr_sum += arr[i] - arr[i-k]; 
		res = Math.max(res, curr_sum); 
		} 
	
		return res; 
	} 

	public static void main(String[] args) 
	{ 
		int arr[] = {4,1,2,5}; 
		int k = 2; 
		int n = arr.length; 
		System.out.println(maxSum(arr,  k)); 
	} 
}
	
	/* Driver program to test above function */

//This code is contributed by Arnav Kr. Mandal. 
