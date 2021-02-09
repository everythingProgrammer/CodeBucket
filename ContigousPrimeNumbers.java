import java.util.*;
public class ContigousPrimeNumbers {
	
static void SieveOfEratosthenes(boolean prime[],int p_size)
{
    prime[0] = false;
    prime[1] = false;
    for (int p = 2; p * p <= p_size; p++) 
    {
        if (prime[p]) 
        {
        	for (int i = p * p; i <= p_size; i += p)
                prime[i] = false;
        }
    }
}
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
        else
        {
            current_max++;
            max_so_far = Math.max(current_max, max_so_far);
        }
    }
    return max_so_far;
}

public static void main(String[] args) 
{
    int arr[] = { };
    int n = arr.length;
    System.out.print(maxPrimeSubarray(arr, n));
}
	
	
}
