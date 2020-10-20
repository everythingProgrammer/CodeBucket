package mockVita;
import java.util.*;


public class DigitPairs {
	
	public static int[] calculateBitScore(int arr[]) {
		
		int scores[] = new int [arr.length];
		
		for(int i = 0 ; i < arr.length; i++) {
			int maxd = Integer.MIN_VALUE; 
			int mind = Integer.MAX_VALUE;
			
			int num = arr[i]; 
			
			while( num> 0 ) {
				int d = num%10 ;
				
				
				if(d> maxd) {
					maxd = d;
					//System.out.println("maxd changed to "+ maxd);
				}
				if( d<= mind) {
					
					mind = d;
					//System.out.println("mind changed to "+ mind);
				}
				
				num = num/10;
			}
			
			int ls = maxd*11 + mind*7;
			if( ls > 99) {
				ls = ls%100;
			}
			scores[i] = ls;
		}
		return scores;
	}
	
	
	public static int[] evenPair(int arr[]) {
		int len = 0 ; 
		if(arr.length % 2 == 0 ) {
			len = arr.length /2;
		}
		else if(arr.length%2 != 0) {
			len = arr.length/2 +1;
		}
		int pair[] = new int[len];
		
		for(int i = 0 , k = 0 ; i<arr.length ; i+=2 , k++ ) {
			pair[k] = arr[i];
		}
		
		return pair;
	}
	
	
	public static int[] oddPair(int arr[]) {
		
		int pair[] = new int[arr.length / 2];
		
		for(int i = 1 ,  k = 0 ; i< arr.length; i+=2, k++) {
			pair[k] = arr[i];
			//System.out.println("another added to odd pair "+ pair[k]); // works correct
		}
		return pair;
		
	}
	
	
	
	public static int pairMaking(int arr[] ) {
		int pairs = 0;
		int oddNums[] =  oddPair(arr);
		int evenNums[]  = evenPair(arr);
		
		/*for(int i = 0 ; i< oddNums.length ; i++) {
			System.out.println(evenNums[i]);
		}*/
		HashMap <Integer, Integer > emap = new HashMap<>();
		for(int i = 0 ; i< evenNums.length ; i++) {
			/*Now first see if the HashMap already contains the value or not . */
			/*if it contains that value then update the value associated with it . */
			int num = evenNums[i]/10; 
			if(emap.containsKey(num)) {
				int cval = emap.get(num);
				cval++;
				emap.replace(num, cval);
			}
			/*if hashmap does not contain the value then put it there*/
			else if( emap.containsKey(num) != true) {
				emap.put(num, 1);
			}
		}
		
		
		/*Now iterate over emap and see if any value contains value 2 or greater than 2 */
		for (Map.Entry<Integer, Integer> e : emap.entrySet()) 
		{
			int key = e.getKey();
			int value = e.getValue();
			//System.out.println("key "+ key+" value "+ value);
			if( value == 2 ) {
				pairs++;
			}else if(value >2) {
				pairs+=2;
			}
		}
		
		
		
		
		/*Now iterate over Omap and see where a certain key has value 2 or more than 2*/
		HashMap <Integer, Integer > omap = new HashMap<>();
		for(int i = 0 ; i< oddNums.length ; i++) {
			/*Now first see if the HashMap already contains the value or not . */
			/*if it contains that value then update the value associated with it . */
			int num = oddNums[i]/10; 
			if(omap.containsKey(num)) {
				int cval = omap.get(num);
				cval++;
				omap.replace(num, cval);
			}
			/*if hashmap does not contain the value then put it there*/
			else if( omap.containsKey(num) != true) {
				omap.put(num, 1);
			}
		}
		
		
		/*Iterate over OMap and see the values.*/
		for (Map.Entry<Integer, Integer> e : omap.entrySet()) 
		{
			int key = e.getKey();
			int value = e.getValue();
			//System.out.println("key "+ key+" value "+ value);
			if( value == 2 ) {
				pairs++;
			}else if(value >2) {
				pairs+=2;
			}
		}
		return pairs;
	}
	public static void main(String args[]) {
		
		int arr[] = {234, 567 ,321 ,345 ,123 ,110 ,767 ,111  };
		
		int scores [] = calculateBitScore(arr);
		//pairMaking(scores);
		System.out.println(pairMaking(scores));
		
	}
}
