import java.util.*;
public class RepeatElements {
	
	
	public static void printDuplicateElements(int arr[]) {
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0  ; i< arr.length ; i++) {
			if(!map.containsKey( arr[i])) {
				map.put(arr[i], 1);
			}
			else {
				int freq = map.get(arr[i]);
				map.put(arr[i],   freq+1     );
			}
		}
		
		for(int keys: map.keySet()) {
			int freq = map.get(keys);
			if(freq>1) {
				System.out.print(keys+" ");
			}
		}
		
		
	}
	public static void main(String args[]) {
		int arr[] = {1,3,1,7,4,3,4,1};
		printDuplicateElements(arr);
	}
	
	
}
