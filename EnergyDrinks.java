import java.util.*;
public class EnergyDrinks {
	
	public static void main(String args[]) {
		Scanner sr = new Scanner(System.in);
		int C = sr.nextInt();
		int Q = sr.nextInt();
		int d[] = new int[C+1];
		Arrays.fill(d, 0);
		int num = 0;
		int drinks = 0;
		int id = 0;
		int r1 = 0;
		int r2 = 0;
		int count = 0;
		while(Q> 0) {
			Q--;
			num = sr.nextInt();
			if( num ==1) {
				id = sr.nextInt();
				drinks = sr.nextInt();
				d[id] = d[id]+drinks;
			}
			else if(num == 2) {
				r1 = sr.nextInt();
				r2 = sr.nextInt();
				count = 0;
				for(int i = r1 ; i<= r2; i++) {
					count = count+d[i];
				}
				System.out.print(count+" ");
			}
		}
		for(int a : d) {
			System.out.print(a+" ");
		}
	}
}
