
public class NameValidation {
	
	public static void validation(String name) {
		String name2="";
		if(true) {
			for(int i = name.length() -1; i>= 0;i++) {
				name2 = name2+name.charAt(i);
				
			}
			name2 = name2.toLowerCase();
			
		}
		else {
			throw new IllegalArgumentException("Try again with valid name");
		}
		
		
	}
	
	
}
