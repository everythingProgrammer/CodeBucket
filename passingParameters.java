
public class passingParameters {
	
	public static void demoFunction(String abc[]) {
		if(abc!= null) {
			System.out.println(abc[0]);
		}
	}
	
	public static void main(String args[]) {
		String str[] = {"abhinav", "singh ", "rana"};
		demoFunction(str);
		
		
	}
	
}
