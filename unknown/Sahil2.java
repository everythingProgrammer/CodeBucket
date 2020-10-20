package unknown;
import java.util.*;
public class Sahil2 {
	
	public static void main(String args[]) {
		Scanner sr = new Scanner(System.in);
		int i = sr.nextInt();
		int j = sr.nextInt();
		char f= sr.next().charAt(0);
		
		String seats[] = new String [i];
		
		for(int a = 0 ; a<i ; a++) {
			seats[a] = sr.nextLine();
		}
		
		for(int a = 0 ; a< i; a++) {
			System.out.println(seats[i]);
		}
	}
}
