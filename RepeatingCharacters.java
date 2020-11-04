import java.util.*;
public class RepeatingCharacters {
	
	
	public static void main(String args[]) {
		
		int arr[] = new int[26];
		Arrays.fill(arr, 0);
		String str = "abbabcbcbababa";
		str= str.toLowerCase();
		
		int repeat = 0;
		
		
		for(int i = 0 ; i<str.length();i++) {
			int in = str.charAt(i)-97;
			arr[in] = arr[in] +1;
		}
		
		for(int i = 0 ; i< 26 ;i++) {
			if(arr[i] )
		}
		
		
	}
	
	
}
