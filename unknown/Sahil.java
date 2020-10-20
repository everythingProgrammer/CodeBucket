package unknown;
import java.util.*;
import java.lang.*;
public class Sahil {
	
	
	
	public static void main(String args[]) {
		Scanner sr = new Scanner(System.in);
		int i = sr.nextInt();
		int j = sr.nextInt();
		char fav = sr.next().charAt(0);
		char seats[][] = new char[i][j];

		for(int a = 0 ; a<i; a++) {
			for(int b = 0; b<j ; b++) {
				seats[a][b] = sr.next().charAt(0) ;
			}
		}
		
		// just iterate over
		int mmax = 0;
		for(int a = 0 ; a< i; a++) {
			int lmax = 0;
			for(int b = 1 ;b< j ; b++) {
				
				Character c1 = seats[a][b-1];
				Character c2 = seats[a][b];
				
				if(c1.equals(c2)) {
					lmax++;
				}
				else if( seats[a][b] != seats[a][b-1]) {
					if(mmax < lmax) {
						mmax = lmax;
					}
				}
				if(mmax < lmax) {
					mmax = lmax;
				}
				
			}
		}
		
		System.out.println(mmax);
		
	}
}
