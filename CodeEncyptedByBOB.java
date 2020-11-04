
public class CodeEncyptedByBOB {
	
	
	public static void main(String arsg[]) {
		int S = 2;
		int N = 3;
		int M = 4;
		
		int enc =   (int) ((Math.pow((Math.pow(S, N)%10), M))%1000000007);
		
		System.out.println(enc);
		
	}
	
	
}
