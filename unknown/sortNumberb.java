package unknown;

public class sortNumberb {
	
public static int countSwap(int arr[]) {
		
		int left = 0 ;  
		int right= left+1 ;
		int count = 0;
		for(int i = 0 ; i< arr.length ; i++) {
			left = i; 
			right = left+1;
			while (right< arr.length) {
				if(arr[left] > arr[right]) {
					arr[left] = arr[left] + arr[right];
					arr[right] = arr[left] - arr[right];
					arr[left] = arr[left] - arr[right];
					count++;
					right --;
				}
				else 
					right --;
			}
		}
		
		for(int i = 0 ; i< arr.length; i++) {
			System.out.print(arr[i]);
		}
		return count;
		
	}
}
