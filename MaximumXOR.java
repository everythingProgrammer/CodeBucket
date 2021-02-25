
public class MaximumXOR {
	
	
	public static String maximumBits(String inc) {
		String out = "";
		for(int i = 0; i<inc.length() ; i++) {
			if(inc.charAt(i)=='0') {
				out+="1";
			}
			else if(inc.charAt(i) == '1') {
				out+="0";
			}
		}
		return out;
	}
	public static void main(String args[]) {
		String []bin = new String[10];
		int a = 9;
		bin[0] = Integer.toBinaryString(a);
		bin[1] = maximumBits(bin[0]);
		System.out.println(bin[1]);
		/*if binary representation has 4 digits then maximum will be 2^4...*/
		
		System.out.println(Long.parseLong(bin[0] , 2));
	}
	
	
	
}
