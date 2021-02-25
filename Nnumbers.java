import java.util.*;
public class Nnumbers {
	public static  int overridenNumber(int arr[], int N) {
		int requiredsum = (N*(N+1))/2;
		int sum = 0;
		for(int a: arr) {
			sum+=a;
		}
		sum = sum -100;
		return requiredsum - sum ;
	}
	
	public static void main(String args[]) {
		
		int arr[] = {2,1,100,5,3};
		System.out.println(overridenNumber(arr, 5));
	}
	
}
