package unknown;

public class pallindrome {
	

	
	
	public static boolean pallindromefunction(String str) {
		
	      boolean flag = true;

	      for(int i = 0; i!=str.length()/2 ; i++) {
	    	  if(str.charAt(i) != str.charAt(str.length() - 1-i)) {
	    		  flag = false;
	    		  break;
	    	  }

	      }
	      return flag;
	}
	
	public static void main(String args[]) {
		System.out.println(pallindromefunction("abba"));
	}
	
}
