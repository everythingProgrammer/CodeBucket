package unknown;

import java.util.Arrays;
import java.util.Scanner;

public class BobandAlice2 {
	public static int minKits(int arr[]) {
		int kits = 0;
		int halfsum = 0;
		int fullsum = 0;
		for(int i = 0 ; i<arr.length ; i++) {
			fullsum += arr[i];
		}
		for(int i = 0; i<=arr.length-1 && halfsum < fullsum ; i++)
		{
			halfsum += arr[i];
			fullsum -= arr[i];
//			System.out.println(fullsum);
			kits++;
		}
		return kits  ;
	}
	
	public static void main(String args[]) {
		Scanner sr = new Scanner(System.in);
		int arr[] = {5,3,4,1,2};
		System.out.println(minKits(arr));
	}
}
