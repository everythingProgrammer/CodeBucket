package leetcode;
import java.util.*;


// T -denoting number of testcases 
// First Line contains M and N denoting size of x and y respectively . 
// elements of X 
// elements of Y
// link - https://practice.geeksforgeeks.org/problems/number-of-pairs/0/
public class geeksforgeeks {
	
	
	static int pairsGreater(long a[] ,long b[])
	{
		
		int counter =0;
		for( int i = 0 ; i< a.length; i++)
		{
			for(int j = 0 ;j <b.length ; j++)
			{
				if(Math.pow(a[i], b[i]) > Math.pow(b[i], a[i]))
					counter++;
			}
		}
		return counter;
	}
	public static void main(String args[])
	{
		int T = 0;
		Scanner sr = new Scanner(System.in);
		//System.out.println("Enter T");
		//int M[] = new int[T]; 
		//int N[] = new int [T]
		T = sr.nextInt();
		int ans[] = new int [T];
		int N , M = 0;
		for(int i = 0 ; i< T ; i++)
		{
			M = sr.nextInt();
			N = sr.nextInt();
			long x[] = new long[M];
			long y[] = new long[N];
			
			for(int j = 0 ; j<M ; j++)
			{
				x[j] = sr.nextLong();
			}
			for(int j = 0 ; j<N ; j++)
			{
				y[j] = sr.nextLong();
			}
			ans[i] = pairsGreater(x, y);
			
		}
		
		for(int i = 0 ;  i< T ; i++)
		{
			System.out.println(ans[i]);
		}
		
		
		
		
		
	}
	
	
	
	
	
}
