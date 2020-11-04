
public class RightRotation {
	public static void main(String args[]) {
		
		
		String str = "sample";
		String str2 = str.substring(1)+ str.substring(0,1);
		int count = 1;
//		System.out.println(str2);
		while( !str.equals(str2) || count<str.length()) {
			count ++;
			str2 = str2.substring(1)+ str2.substring(0,1);
		}
		
		System.out.println(count);
		
	}
	
	

}
