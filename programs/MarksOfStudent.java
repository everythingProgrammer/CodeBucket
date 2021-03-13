package programs;
import java.util.*;
public class MarksOfStudent {
	
	
	public static void main(String args[]) {
		Scanner sr = new Scanner(System.in);
		
		int number = sr.nextInt();
		if(number>=81) {
			System.out.println("A");
		}else if(number >= 61 && number<=80) {
			System.out.println("B");

		}else if( number >=41 && number <=60) {
			System.out.println("C");
			
		}else if(number <= 40) {
			System.out.println("D");
		}
		
		
	}
}
