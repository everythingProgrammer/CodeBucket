import java.util.*;
public class Attendu {
	public static void main(String args[]) {
		try {
		Scanner sr = new Scanner(System.in);
		int T = 0;
		T = sr.nextInt();
		ArrayList<String> output = new ArrayList<>();
			while(T>0) {
				T--;
			
			int N = sr.nextInt();
			sr.nextLine();
			int remainingDays = 120-N;
			int count = 0;
			String aB = sr.nextLine();
//			System.out.println(aB.length());
//			attendanceBits= sr.nextLine();
//			sr.nextLine();
			for(int i = 0 ; i<aB.length() ; i++) {
				
//				count = count+ Integer.parseInt(attendanceBits.charAt(i)+"");
				if( aB.charAt(i) == '1') {
					count++;
				}
				
			}
//			System.out.println(count);
			if((((remainingDays+count)*100.00)/120.00 )>=75.00 ) {
//				System.out.println("attended "+count+"  remaining "+remainingDays);
				output.add("YES");
				
			}else {
				output.add("NO");
//				System.out.println("attended "+count+"  remaining "+remainingDays);
			}
		}
		
		
		for(String print: output) {
			System.out.println(print);
		}
		}
		catch(Exception e) {
			
		}
	
	
	}
}
