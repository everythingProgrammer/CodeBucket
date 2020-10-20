package unknown;

public class sortNumber {
	
	
	public static int countSwap(int arr[]) {
		
		int left = 0 ;  
		int right= left+1 ;
		int count = 0;
		for(int i = 0 ; i< arr.length ; i++) {
			left = i; 
			right = arr.length -1;
			while (left < right) {
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
	
	
	
	public static void main(String args[]) {
		
		int arr[] = {5,1,3,6,2};
		System.out.println(countSwap(arr));
		
		
		
		
		
	}
}
