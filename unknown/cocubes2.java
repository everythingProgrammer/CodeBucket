package unknown;

public class cocubes2 {
	
	public static int max(int t, int d1 , int d2 , int d3) {
		int max = 0;
		if(d1/t > max) {
			max = d1/t;
		}
		if(d2/t > max) {
			max = d2/t;
		}
		if(d3/t > max) {
			max = d3/t;
		}
		return max;
		
	}
	
	
	public static void main(String args[]) {
		System.out.println(max(25,125,225,625));
	}
}
