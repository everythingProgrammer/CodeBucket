import java.util.*;
public class Power4 {
	public static void main(String args[]) {
		Scanner sr = new Scanner(System.in);
		int n = sr.nextInt(); 
		if(n<=0) {
			System.out.println("Wrong Input");
			return;
		}
		String str = ""+(int) Math.pow(n,4);
		String num = n+"";
		if(str.substring(str.length() - num.length()).equals(num) ) {
			System.out.println("TRUE");
		}
		else {
			System.out.println("FALSE");
		}
	}
}
