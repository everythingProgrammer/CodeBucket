/*nhi hua */
//sdfsdfsfsfd;
package unknown;
import java.util.*;
public class SUPWtopdown {
	public static int count(int arr[] , int i , int dp[]) {
		if(i == 0)
			return arr[0];
		else if( i== 1)
			return arr[1];
		else if(i == 2)
			return arr[2];
		else if(i <0 ) {
			return Integer.MAX_VALUE;
		}
		else if( dp[i] != 0 )
			return dp[0];
		
		int sum = arr[i];
		
		sum =sum + Math.min(Math.min(count(arr,i-3,dp), count(arr,i-2,dp)),count(arr,i-1,dp));
		System.out.println();
		for(int a:dp)
			System.out.print(a+" ");
		
		return  dp[i]= sum;
	}
	public static void main(String args[]) {
		int arr[] = {3,2,1,1,2};
		int dp[] = new int[arr.length];
		System.out.println(count(arr, arr.length-1, dp));
	}
}
