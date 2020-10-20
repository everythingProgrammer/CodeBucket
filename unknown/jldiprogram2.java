package unknown;

public class jldiprogram2 {
	public static int countLeft(int arr[] , int i) {
		int count = 0;
		for(int a = 0; a < i ; a++) {
			if(arr[i] < arr[a] ) {
				count++;
			}
		}
		return count;
	}
	public static int countRight(int arr[] , int i) {
		int count = 0;
		for(int a = i+1; a < arr.length ; a++) {
			if(arr[i] > arr[a] ) {
				count++;
			}
		}
		return count;
	}
	
	public static int find_maximum_difference(int N ,int A[] ) {
		int max_difference =0;

		int local_diff = 0;
		int count1 = 0;
		int count2 = 0;
		for(int i = 1 ; i< A.length -1 ; i++) {
			count1 = 0 ;
			count2 = 0;
			
//			left = countLeft(A, i);
			for(int a = 0; a < i ; a++) {
				if(A[i] < A[a] ) {
					count1++;
				}
			}
			
			
			
//			right = countRight(A, i);
			for(int a = i+1; a < A.length ; a++) {
				if(A[i] > A[a] ) {
					count2++;
				}
			}
			
			
			local_diff = Math.abs(count1 - count2 );
			if(local_diff > max_difference) {
				max_difference = local_diff;
			}
			
		}
		
		return max_difference;
	}
	
	 private static final long MEGABYTE = 1024L * 1024L;
	
	public static long bytesToMegabytes(long bytes) {
        return bytes / MEGABYTE;
    }
	public static void main(String args[]) {
		
		/*Using Java Runtime */
		Runtime runtime = Runtime.getRuntime();
		runtime.gc();
		
		long before=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
		
		
		 int arr[] = {1,4,2,7,6,4,5,8,5,2,4,6,1,4,7,5,6,9,2,4,2,4,7,7,5,2,1,4,85,8,4};;
		System.out.println(find_maximum_difference( arr.length -1, arr));
		long after=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
		System.out.println("Used memory is megabytes: "+ (after-before));
	}
}
