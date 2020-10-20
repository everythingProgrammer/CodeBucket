package unknown;
import java.io.*;
public class SUPW {
	public static void count(int arr[] , int num)
	{
		long dp[] = new long[num];
		dp[0] = arr[0];
		dp[1] = arr[1];
		dp[2] = arr[2];
		
		for(int i = 3 ; i< num ; i++) {
			dp[i]= arr[i]+ Math.min(Math.min(dp[i-3],dp[i-1]), dp[i-2]);
			
		}
		for(long a:dp) {
			//System.out.print(a+" ");
		}
		System.out.println(Math.min(Math.min(dp[num-1], dp[num-2]), dp[num-3]));
	}
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int arr[] = new int[T];
		for(int i = 0 ; i< T; i++)
			arr[i] = Integer.parseInt(br.readLine());
		count(arr, arr.length);
	}
}
