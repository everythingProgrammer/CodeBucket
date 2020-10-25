import java.util.*;
public class Trains {
	
	
	public static void main(String args[]) {
		
		double arr[] = {0.00,0.04,0.09,0.15,0.19,0.22};
		
		Scanner sr = new Scanner(System.in);
		double timming = sr.nextDouble();
		if(timming>= 0 && timming <=23) {
			for(double a : arr) {
				float time = (float) ((float) (a+timming)%23.00);
				float last2 = time%100;
				last2 = (float)  (last2)
				
				System.out.print(time+" ");
			}
		}
		else {
			System.out.println("INVALID INPUT");
		}
		
		
	}
	
	
}
