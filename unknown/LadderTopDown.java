
/*Nhi hua*/

package unknown;
import java.util.*;
public class LadderTopDown {
	
	public int countWays(int N , int k , int curr , int dp[]) {
		
		if(curr == 0)
			return 1;
		if(curr<0)
			return 0;
		if(dp[curr] != 0)
			return dp[curr];
		int maxways = 0;
		for(int i = 1; i<K ; i++)
			maxways = maxways+countWays(N, k , curr-i , dp);
		return maxways;
		
	}
	
	public int bottomsUp(int N , int K)
	{
		int dp[] = new int[N+1];
		
//		for(int i = 0 ; i<)
		
		return 0;
	}
}
