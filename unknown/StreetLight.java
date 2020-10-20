package unknown;

public class StreetLight {
	
	public   int areaCovered(int arr[][] , int a) {
		
		int sum = 0 ; 
		sum = sum +(arr[0][1] - arr[0][0]);
		for(int i = 1 ; i< arr.length ; i++) {
			int vat = 0;
			/*To substract common area*/
			if(arr[i][0] < arr[i-1][1]) {
				if(arr[i][0] < arr[i-1][0]) {
					
				}
				
				
				vat = arr[i-1][1]- arr[i][0];
			}
			sum = sum + (arr[i][1] - arr[i][0]) - vat;
		}
		
		return sum ;
	}
	
	
	public static void main(String args[]) {
		int arr[][] = {{5,10}, {8,12}};
		System.out.println(areaCovered(arr));
	}
	
}
