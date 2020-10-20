import java.util.*;
public class TestCode {
	
	public static void main(String args[]) {
		Scanner sr = new Scanner(System.in);
		
		String arr[] = new String[2];
		int num[] = new int[2];
		
		
		for(int i = 0 ; i< 2 ; i++) {
//			sr.next();
			arr[i] = sr.nextLine();
//			sr.nextLine();
			num[i] = sr.nextInt();
			sr.nextLine();
			System.out.println(arr[i]+" - "+num[i]);
		}
	}
}
