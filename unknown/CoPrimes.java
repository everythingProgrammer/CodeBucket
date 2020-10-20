package unknown;
import java.util.*;
public class CoPrimes {
	
	public static int gcd( int n1 , int n2 , int n3) {
		int gcd = 1; 
		for(int i = 1; i <= n1 && i <= n2 && i<= n3; ++i)
        {
            // Checks if i is factor of both integers
            if(n1 % i==0 && n2 % i==0 && n2% i == 0)
                gcd = i;
        }
	}
	
	public static int checkCoprime(int arr[]) {
		
		int num = 0; 
		
		for(int i = 0 ; i<arr.length ; i++) {
			for(int j = i+1 ; j< arr.length ; j++) {
				for(int k = j+1 ; k< arr.length ; k++) {
					if(gcd(arr[i], arr[j], arr[k]) == 1) {
						num++;
					}
				}
			}
		}
		return num;
	}
	
	
	public static void main(String args[]) {
		
		Scanner sr = new Scanner(System.in);
		int n = sr.nextInt();
		int arr[] = new int [n];
		for(int i = 0 ; i< arr.length ; i++) {
			arr[i] = sr.nextInt();
		}
		
		
		System.out.println(checkCoprime(arr));
		sr.close();
	}
}
