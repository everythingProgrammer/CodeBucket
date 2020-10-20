package unknown;

public class Swap {
	
	
	static void secondarySwap(int arr[]) {
		arr[0] = arr[0]+arr[1];
		arr[1] = arr[0] - arr[1] ;
		arr[0] = arr[0]-arr[1];
	}
	
	 static void mainswapfunction() {
		int arr[] = {5, 6};
		secondarySwap(arr);
		System.out.println(arr[0]+" "+ arr[1]);
	}
	
	public static void main(String args[]) {
		mainswapfunction();
	}
}
