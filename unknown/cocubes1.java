package unknown;
import java.util.*;
public class cocubes1 {
	
	
	
	/*will do something */
	public static String maxFreq(String s) {
		StringTokenizer st1 = new StringTokenizer(s," ");
		HashMap<String , Integer> map = new HashMap<>();
		
		
		while(st1.hasMoreTokens()) {
			/*The individual words are being stored in String t1 */
			String t1 = st1.nextToken();
			
			if( map.containsKey(t1)) {
				Integer a = map.get(t1) + 1;
				map.put(t1, a);
				
			}
			else {
				map.put(t1, 1);
			}
			
			
		}
		int max = 0;
		String maxx = "";
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
		    if( max< (int) entry.getValue()) {
		    	max = (int ) entry.getValue();
		    	maxx= entry.getKey();
		    			
		    }
		}
		
		
		return  maxx;
	}
	
	public static void main(String args[]) {
		System.out.println(maxFreq("Hi There Hi Hi Hi 5 5 5 5 5 5"));
	}
}
