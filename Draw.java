
public class Draw {

	
	
	public static void draw() {

		int print = 1;
		for(int i = 1 ;i<=3; i++) {
			for(int j = 1 ; j<= i*2; j++ ) {
				System.out.print(print+" ");
			}
			System.out.println();
		}
	}
	public static void main(String args[]) {
		draw();
	}
}
