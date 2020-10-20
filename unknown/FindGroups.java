package unknown;

//Java Program to count all possible 
//groups of size 2 or 3 that have 
//sum as multiple of 3 
public class FindGroups 
{ 
	int MaxSum(int arr[] , int length) {
		    int size = arr.length; 
	        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0; 
	  
	        for (int i = 0; i < size; i++) 
	        { 
	            max_ending_here = max_ending_here + a[i]; 
	            if (max_so_far < max_ending_here) 
	                max_so_far = max_ending_here; 
	            if (max_ending_here < 0) 
	                max_ending_here = 0; 
	        } 
	        return max_so_far; 
	  
	}
	
	
	/* Function to sort an array using insertion sort*/
	static void insertionSort(int A[], int size) 
	{ 
	int i, key, j; 
	for (i = 1; i < size; i++) 
	{ 
		key = A[i]; 
		j = i-1; 

		/* Move elements of A[0..i-1], that are greater than key, to one 
			position ahead of their current position. 
			This loop will run at most k times */
		while (j >= 0 && A[j] > key) 
		{ 
			A[j+1] = A[j]; 
			j = j-1; 
		} 
		A[j+1] = key; 
	} 
	
	
	for(int z = 0 ; z< A.length ; z++) {
		System.out.print(A[z]+"  ");
	}
} 


	int findgroups(int arr[], int n) 
	{ 
		
		int c[] = new int[]{0, 0, 0}; 
		int i; 

		int res = 0; // To store the result 
		for (i = 0; i < n; i++) 
			c[arr[i] % 3]++; 

		res += ((c[0] * (c[0] - 1)) >> 1); 

		res += c[1] * c[2]; 

		res += (c[0] * (c[0] - 1) * (c[0] - 2)) / 6; 

		res += (c[1] * (c[1] - 1) * (c[1] - 2)) / 6; 

		res += ((c[2] * (c[2] - 1) * (c[2] - 2)) / 6); 
		
		res += c[0] * c[1] * c[2]; 

		return res; 
	} 

	public static void main(String[] args) 
	{ 
		FindGroups groups = new FindGroups(); 
		int arr[] = { 1,32,5,4,1,2}; 
		int n = 2; 
		System.out.println("  "
				+ groups.findgroups(arr, n)); 
	} 
} 
