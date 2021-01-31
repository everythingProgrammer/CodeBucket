import java.util.*;
public class Buckets {
	
	static void printBucket(int n ) {
		int r =n; 
		int sum = 0;
		while(r > 0) {
			sum += r%10;
			r = r/10;
		}
		System.out.print(sum+" ");
	}
	
	
	
	public static void main(String args[]) {
		Scanner sr = new Scanner(System.in);
		int n = sr.nextInt();
		int nums [] = new int[n];
		for(int i = 0 ; i< n ; i++) {
			nums[i] = sr.nextInt();
		}
		for(int num: nums) {
			printBucket(num);
		}
		
	}
	
	
}
