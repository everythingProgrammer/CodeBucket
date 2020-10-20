package codeVita;
import java.util.*;
public class Main {
	
	
	public static void main(String args[]) {
		int r1 = 0;
		int r2 = 0;
		int r3 = 0;
		int N =0;
		Scanner sr = new Scanner(System.in);
		r1=sr.nextInt();
		r2=sr.nextInt();
		r3=sr.nextInt();
		N=sr.nextInt();
		/*Now simply find the total circumference of r1 rotated*/
		int dist = r1*N;
		/*to find the number of rotations*/
		int rotation = (dist/r3);
		System.out.println(rotation);
	}
}
