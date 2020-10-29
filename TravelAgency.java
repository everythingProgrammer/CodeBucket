import java.util.*;
public class TravelAgency {
	
	
	public static void main(String args[]) {
		String d[] = {"Malaysia","Australia","GErmany","Dubai","France"};
		int fav[] = new int[5];
		Scanner sr = new Scanner(System.in);
		int value = 0;
		for(int i = 0 ; i<25; i++) {
			int index = (i%5);
			int addition = sr.nextInt();
			if(addition >5 ) {
				System.out.println("INVALID")
			}
			fav[index] = fav[index] + addition;
		}
		
//		TreeMap<Integer,String> rank = new TreeMap<>();
		
		int max_val = 0;
		for(int a : fav) {
			if(a>max_val) {
				max_val = a;
			}
		}
		for(int i = 0 ; i < 5 ; i++) {
//			if(fav[i] == max_val) {
//				System.out.println(d[i]);
//			}
			System.out.println(fav[i]);
		}
		
	}
	
	
	
	
	
}
