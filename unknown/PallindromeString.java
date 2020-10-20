package unknown;
import java.util.*;

public class PallindromeString {
public static boolean checkpalin(String st) {

	boolean b=true;
	for(int i=0; i< st.length();i++)
		{
			if(st.charAt(i) == st.charAt(st.length()-1-i)) {
		}
		else
		{
			b=false;	
			break;
		}
	}
		return b;
}
public static void main(String args[]) {
	System.out.println(checkpalin("abc"));
}
}