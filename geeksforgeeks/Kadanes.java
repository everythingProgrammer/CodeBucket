package geeksforgeeks;

// Kadane's algorithm is one of the most asked questions in interviews
// https://practice.geeksforgeeks.org/problems/kadanes-algorithm/0/
// Time Complexity is O(n) here



import java.io.*;
import java.util.*;
public class Kadanes {
	
	
	public static int countMaxSubArraySum(int arr[])
	{
		
		int currmax = arr[0];
		int glmax = arr[0];
		
		for(int i = 1 ; i< arr.length ; i++)
		{
			currmax = Math.max(arr[i] , currmax+arr[i]);
			
			if(currmax > glmax)
				glmax= currmax;
		}
		return glmax;
	}
	
	
	public static void main(String args[]) throws IOException
	{
		Scanner sr = new Scanner(System.in);
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//		int T = Integer.parseInt(reader.readLine());
		int T = sr.nextInt();
		int length[] = new int [T];
		int arr[][] = new int[T][];
		for(int i = 0  ; i< T ; i++)
		{
//			length[i] = Integer.parseInt(reader.readLine());
			length[i] = sr.nextInt();
			arr[i] = new int[length[i]];			// Important Thing to note. 
			for(int j = 0; j<length[i] ; j++)
			{
//				arr[i][j] = Integer.parseInt(reader.readLine());
				arr[i][j] = sr.nextInt();
			}
		}
		long t1 = System.currentTimeMillis();
		for(int i = 0 ; i<T ; i++)
		{
			System.out.println(countMaxSubArraySum(arr[i]));
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