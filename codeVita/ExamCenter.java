package codeVita;

import java.util.*;
public class ExamCenter {
	public static void main(String args[]) {
		Scanner sr = new Scanner(System.in);
		int m = 10;
		int n =5;
		
		String str= "";
		int i = 0;
		String stuT[] = new String[5];
		String stuS[] = new String[5];
		Arrays.fill(stuT, "ABSENT");
		Arrays.fill( stuS, "ABSENT");
		do {
			str = sr.nextLine();
			if(str.length() == 0) {
				break;
			}
			if(i>9) {
				System.out.println("INVALID INPUT");
				break;
			}
			if(str.substring(0,2).equals("TY") ) {
				int index =Integer.parseInt( str.substring(2));
				stuT[index-1] = str;
				i++;
			}
			else if(  str.substring(0, 2).equals("SY") ) {
				int index =Integer.parseInt( str.substring(2));
				stuS[index-1] = str;
				i++;
			}
			else {
				System.out.println("INVALID INPUT");
			}
				
		}while(true);
		
		for(int j = 0 ; j< 5; j++) {
			System.out.println( "["+stuT[j]+"][ "+stuS[j]+"]");
		}	
	}
}
