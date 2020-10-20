package unknown;

import java.util.Scanner;

public class RearrangingArray2 {
	
	public static void swap(int arr[] , int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	public static void reaarangeArray(int arr[]) {
		int i = 0 ;
		int j = (arr.length/2) ;
		int k ;
		boolean flag = true;
		if(arr.length %2 != 0) {
			System.out.println("No");
			return;
		}
		for(i = 0 ; i< (arr.length/2) ; i++ ) {
			
			k = i+1;
			while( k<arr.length  ) {
				if(k >= arr.length/2 && k<j)
				{
					k = j;
					continue;
				}
				if( arr[k] == arr[i] ) {
					break;
				}
				k++;
			}
			if(k >= arr.length)
			{
				flag = false;
				break;
				
			}
			if( k<arr.length && arr[k] == arr[i] ) {

				swap(arr, k,j);
				j++;
			}
			
			
		}
		
		
		
		if(flag) {

//			return "Yes";
		}
		else {
//			System.out.println("No");
//			return "No";
		}
//		return "No";
	}
	public static void main(String args[]) {
		
		Scanner sr= new Scanner(System.in);
//		int testcases = sr.nextInt();
		
//		int testarr[][] = new int [testcases][];
		
//		for(int i = 0 ;i<testcases; i++) {
//			int inputs = sr.nextInt();
//			testarr[i] = new int[inputs];
//			for(int j = 0; j< testarr[i].length ; j++) {
//				testarr[i][j] = sr.nextInt();
//			}
//		}
////		
//		for(int i = 0; i< testcases; i++) {
//			reaarangeArray(testarr[i]);
//		
//	}

//		int arr[] = {3,2,1,2,3,1,0,2,0,2};
//		int arr[] = {1,2,5,1,2,3};
//		int arr[] = {1,3,3,1,1,3,3,1};
//		int arr[] = {5,5,7,7};
		int arr[] = {5,7,5,7};
		 reaarangeArray(arr);
		
//		for(int i = 0 ; i< arr.length ; i++) {
//			System.out.print(arr[i] +" ");
//		}
		
	}
	
	
}

/*3,2,1,2,3,1,0,2,0,2
 *  i   k   j  
 *3,2,1,2,3,  */


