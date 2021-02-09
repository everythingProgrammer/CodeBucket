import java.util.*;
public class Test2
{
    static void SieveOfEratosthenes(boolean prime[], int p_size)
		{
			// false here indicates
			// that it is not prime
			prime[0] = false;
			prime[1] = false;
			
			for (int p = 2; p * p <= p_size; p++) 
			{
			
			// If prime[p] is not changed,
			// then it is a prime
			if (prime[p]) 
			{
			
			// Update all multiples of p,
			// set them to non-prime
			for (int i = p * p; i <= p_size; i += p)
					prime[i] = false;
				}
			}
		}
		
		//Function that finds
		//maximum contiguous subarray of prime numbers
		static int maxPrimeSubarray(int arr[], int n)
		{
			int max_ele = Arrays.stream(arr).max().getAsInt();
			boolean prime[] = new boolean[max_ele + 1];
			Arrays.fill(prime, true);
		
			SieveOfEratosthenes(prime, max_ele);
		
			int current_max = 0, max_so_far = 0;
		
		for (int i = 0; i < n; i++)
		{
			// check if element is non-prime
			if (prime[arr[i]] == false)
			current_max = 0;
			
			// If element is prime, than update
			// current_max and max_so_far accordingly.
			else
			{
				current_max++;
				max_so_far = Math.max(current_max, max_so_far);
			}
		}
		return max_so_far;
	}
			
	
	public static void main(String args[]) {
		
		
		Scanner sr = new Scanner(System.in);
		int T = sr.nextInt();
		ArrayList<Integer> nums = new ArrayList<>();
		while(T>0) {
			T--;
			int N = sr.nextInt();
			int arr[] = new int[N];
			for(int i = 0 ; i<N ; i++) {
				arr[i] = sr.nextInt();
			}
			nums.add(maxPrimeSubarray(arr, arr.length));
			
		}
		
		for(int n : nums) {
			System.out.println(n);
		}
		
	}
}