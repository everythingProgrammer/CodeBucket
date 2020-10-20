package unknown;

import java.util.Scanner;

public class CountOccurences {
	
	
	public static void countChar(String s) {
		
		int count[] = new int[26];
		char alpha[] = new char[26];
		
		for(int i = 0; i< s.length(); i++) {
			int indx = (int)s.charAt(i)   - 97;
			count[indx] = count[indx] + 1;
		}
		
		for(int i = 0 ; i<s.length(); i++) {
			
			int indx = (int)s.charAt(i) - 97;
			
			if(count[indx] != 0) {
				System.out.print(s.charAt(i)+""+  count[indx]);
				count[indx] = 0;
			}
		
			
		}
		System.out.println();
		
	}
	
	public static void main(String args[]) {
		
		
		
		
		Scanner s = new Scanner(System.in);
		int testcases = s.nextInt();
		s.nextLine();
		String tests[] = new String[testcases];
		
		for(int i = 0  ; i< testcases; i++) {
			tests[i] = s.nextLine();
			
			
		}
		
		
		
		
		for(int i = 0 ; i< testcases ;i++) {
			countChar(tests[i]);
		}
	}

}
