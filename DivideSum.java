import java.util.*;
public class DivideSum {
	
	
	public static void main(String arg[]) {
		
		int arr[] = {1,2,3,4,5};
		
		
		int sum = 0;
		int sum2= 0;
		for(int number: arr) {
			sum += number;
		}
		
		for( int j= 1;j<=arr.length ; j++) {
			arr[j-1]= (int)Math.floor(sum/j);
			sum2 += arr[j-1];
			System.out.println(arr[j-1]);
		}
		
		System.out.println(sum2);
		
	}
}
