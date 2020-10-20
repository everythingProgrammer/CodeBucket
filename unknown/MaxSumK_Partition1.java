/*new approach*/

package unknown;
import java.util.*;
public class MaxSumK_Partition1 {
	public static int maxVal(int N , int k, int arr[]) {
		int prev_max = 0;
		int prev_maxind = -1;
		int prev_secmax = 0;
		
		for(int i = 0 ; i < (k+N-1)/ k ; i++) {
			int curr_max = prev_max;
			int curr_secmax = prev_secmax;
			int curr_maxind = prev_maxind;
			
			for(int j = i*k ; j<(i+1)*k && j<N; j++) {
				int sum = arr[j] + prev_secmax;
				
				if(j - prev_maxind != k)
					sum = arr[j] +prev_max;
				
				if(sum > curr_max) {
					curr_secmax = curr_max;
					curr_max = sum;
					curr_maxind = j;
				}
				else if(sum > curr_secmax)
					curr_secmax= sum;
			}
			prev_max = curr_max;
			prev_maxind = curr_maxind;
			prev_secmax = curr_secmax;

		}
		
		
		return prev_max;
	}
	
	public static void main(String args[]) {
		Scanner sr = new Scanner(System.in);
		int N = sr.nextInt();
		int K = sr.nextInt();
		int arr[] = new int[N];
		for(int i = 0 ; i<N ; i++)
		{
			arr[i] = sr.nextInt();
		}
		System.out.println(maxVal(N, K , arr));
	}
	
}
