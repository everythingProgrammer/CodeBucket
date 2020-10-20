/*Maximum Sum K - Partition*/


package unknown;

import java.util.Scanner;

public class MaxSumK_Partition {
	
	public static int maxVal(int arr[], int k , int n){
		
		int dp[]= arr.clone();
		int max1 = 0;
		int max2 = Integer.MIN_VALUE;
		int ans = 0;
		
		for(int i = k ; i< n ; i+= k ) {
			
			
			for(int j = i-k+1 ; j<i ; j++) {
				if(dp[j] > dp[max1]) {
					max2 = max1;
					max1 = j;
					
//					System.out.println("Substituting value of max1=" + max1+" value of j= ")
					
				}
				else if( max2 == Integer.MIN_VALUE || dp[j] > dp[max2]) {
					max2 = j;
				}
				
			}
			System.out.println("max1= "+dp[max1]+" max2= "+dp[max2]);
			for(int j = i ; j<i+k && j<n ; j++) {
				if(dp[j]<0) {
					dp[j] = dp[max1];
				}
				else if(j-max1!= k ) {
					dp[j] = dp[j]+ dp[max1];
				}
				else {
					dp[j] = dp[j]+dp[max2];
				}
				ans = Math.max(ans,  dp[j]);
			}
		}
		for(int i = 0 ; i< dp.length; i++)
		{
			System.out.print(dp[i]+" ,");
		}
		System.out.println();
		return ans;
	}
	
	public static void main(String args[])
	{
//		int arr[] = {1,2,5,2,3,4,5,1,2};
//		System.out.println(maxVal(arr, 3,9));
		Scanner sr =  new Scanner(System.in);
		int N = sr.nextInt();
		int arr[] = new int[N];
		int k = sr.nextInt();
		for(int i = 0 ; i< N ; i++)
		{
			arr[i] = sr.nextInt();
		}
		System.out.println(maxVal(arr, k, N));
		
	}
	

}
