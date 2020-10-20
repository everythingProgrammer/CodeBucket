package unknown;
import java.util.*;
public class RearrangingArray {
	
	public static void swap(int arr[] , int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	public static void convertPallindrome(int arr[] ) {
		int i = 0 ;
		int j = arr.length -1;
		int k ;
		boolean flag = true;
		if(arr.length %2 != 0) {
			System.out.println("No");
			return;
		}
		
		
		for(i = 0 ; i< (arr.length/2) ; i++ ) {
			
			k = i+1;
			while( arr[k] != arr[i] && k<=j) {
				k++;
			}
			
			if(arr[k] == arr[i]) {
				swap(arr, k,j);
				j--;
			}
			else if( arr[k] != arr[i] && k >=j) {
				flag = false;
				break;
			}
			
		}
		if(flag) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
	
	
	public static void main(String args[]) {
		int arr[] = {3,2,1,2,3,1,0,2,0,2};
		convertPallindrome(arr);
		for(int i = 0 ; i< arr.length ; i++) {
			System.out.print(arr[i] +" ");
		}
		
	}
	
	/*1 2 2 1 3 3*/
	/*1 2 3 1 2 3*/

	/*a1 = a[mid+1]
	 *a2 = a[mid+2]
	 *a3 = a[mid+3] */
	
	
	/*5 5 7 7 
	 *5 7 5 7*/
	
	
	/*
	 * 
	 * 
	 * 3,2,1,2,3,1,0,2,0,2
	 * 3 2 1     3 2 1
	 * 
	 * 1 2 3 1 2 3
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */
	
}
