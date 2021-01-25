import java.util.Scanner;

public class FindingPairs2 {
	public static void main(String args[]) {
		
		
		Scanner sr = new Scanner(System.in);
		int t = sr.nextInt();
		int a[] = new int[t];
		int b[] = new int[t];
		int n[] = new int[t];
		
		for(int i  = 0 ; i< t; i++) {
			 a[i] = sr.nextInt();
			 b[i] = sr.nextInt();
			 n[i] = sr.nextInt();
		}
		
		for( int i = 0; i< t; i++) {
			for(int j = 1; j< n[i] ; j ++) {
				int temp = a[i]  ;
				a[i] = (b[i]- a[i])%1000000007;
				b[i] = (temp+b[i])%1000000007 ;
				System.out.println(a[i]+" "+b[i]);
			}
		}
		
		
	}
	
	
}
