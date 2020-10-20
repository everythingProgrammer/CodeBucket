package geeksforgeeks;
import java.util.*;
public class countTriplets {
	
	public static int count(int arr[])
	{
		Arrays.sort(arr);
	
		/*for(int num: arr)
		{
			System.out.print(" "+num);
		}*/
		
		int count = -1; // To keep track of number of triplets
		int l = 0; 
		int r = 0;
		
		for(int i = arr.length -1 ; i>0; i--)
		{
			l =0;
			r = i -1;
			while(l<r)
			{
				//System.out.println("l = "+l+" r = "+r);
				int s = arr[l] + arr[r] ;
				if(s == arr[i])
				{
					count++;
					l++;
				}
				else if( s > arr[i] )
				{
					r--;
				}
				else if(s < arr[i])
				{
					l++;
				}
			}
			
		}
		
		
		
		return count ;
	}
	
	public static void main(String args[])
	{
		
		Scanner sr = new Scanner(System.in);
		int T = sr.nextInt();
		int length[] = new int [T];
		int arr[][] = new int[T][];
		
		for(int i = 0  ; i< T ; i++)
		{
			length[i] = sr.nextInt();
			arr[i] = new int[length[i]];			// Important Thing to note. 
			for(int j = 0; j<length[i] ; j++)
			{
				arr[i][j] = sr.nextInt();
			}
		}
		
		
		long t1 = System.currentTimeMillis();
		for(int i = 0 ; i<T ; i++)
		{
			System.out.println(count(arr[i]));
		}
		
		
		
		long t2 =  System.currentTimeMillis();
		System.out.println("Time Taken "+(t2-t1)+"ms");
		
		
		
	}
	
	
}





/*for(int i = 0 ; i< T ; i++)
		{
			for(int j = 0 ; j< length[i] ; j++)
			{
				System.out.print(" "+ arr[i][j]  );
			}
			System.out.println();
		}*/