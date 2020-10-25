package codeVita;

public class MaximumQuadrupletProduct {
	
	/*Using Two Pointer approach*/
	public static int maxProduct(int arr[]) {
		
		int product1 = arr[0]*arr[1]*arr[3]*arr[2] ;
		int product[] = new int[arr.length +1];
//		product[0] = arr[0];
//		product[1] = arr[1];
//		product[2] = arr[2];
//		product[3] = arr[3]*product[1]*product[2]*product[3]; 
		int j = 0;
		int maximum_product = product1;
		for(int i=4 ; i<arr.length ; i++) {	
//			product[i]= (arr[i]* product[i-1] * product[i-2]* product[i-3])/arr[j];
			System.out.println(product1);
			product1 = (product1*arr[i])/arr[j];
			j++;
			if(maximum_product < product[i]) {
				maximum_product = product[i];
			}
		}
		return maximum_product;
	}
	
	public static void main(String args[]) {
		int arr[]= {-3,1,2,-2,5,6,1};
		System.out.println(maxProduct(arr));
	}
	
}
