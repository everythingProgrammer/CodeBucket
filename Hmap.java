import java.util.*;
public class Hmap {
	
	
	public static void main(String args[]) {
//		HashMap<String, Integer> map  = new HashMap<>();
//		
//		
//		map.put("Abhinav", 1);
//		map.put("Ankur", 2);
//		map.put("Anirudh", 3);
//		map.put("Aayush", 4);
//		
//		
//		TreeMap<String, Integer> map1 = new TreeMap<>();
//		
//		
//		map1.put("Abhinav", 1);
//		map1.put("Ankur", 2);
//		map1.put("Anirudh", 3);
//		map1.put("Aayush", 4);
//		
//		ArrayList<String> keyss = new ArrayList<>(map1.keySet());
////		System.out.println(map.values());
//		
//		
//		
//		for(String key : keyss) {
//			System.out.print(key+"  ");
//		}
//		
//		System.out.println("\n----------------------------------------------------");
//		
//		HashSet<String> map2 = new HashSet<>();
//		map2.add("Ankur");
//		map2.add("Abhinav");
//		map2.add("Anirudh");
//		map2.add("Aayush");
//		System.out.println(map2);
		
		
//		for(String s: map.keySet()) {
//			int a = map.get(s);
//			System.out.println(map.get(s));
//		}
		
		
		
		
		
		/**/
//		int arr[] = {10,20,30,40};
//		String names[] = {"Abhinav","Ankur","Anirudh","Aayush"};
//		HashMap<String, Integer> map3 = new HashMap<>();
//		int i = 0 ; 
//		while(i<arr.length) {
//			map3.put(names[i], arr[i]);
//			i++;
//		}
//		
//		System.out.println(map3);
//		
		
		
		/**/
		
		/*Frequency of Words*/
		String str = "Ankur is ankur  and Abhinav is %% % % ! ! !! !Abhinav. Abhinav  ,Ankur   Aayush Aayush. ";
		HashMap<String , Integer> map = new HashMap<>();
		
		StringTokenizer st = new StringTokenizer(str,",.%! ");
		while(st.hasMoreTokens()) {
			String ours = st.nextToken().toLowerCase();
			if(map.containsKey(ours)) {
				int freq = map.get(ours);
				map.put(ours, freq+1);
			}
			else {
				map.put(ours, 1);
			}
			
			
		}
//		int i = 0;
//		HashSet<Integer> dval = new HashSet<>();
//		for(String stri : map.keySet()) {
//			if()
//			{
//				System.out.println(stri.toUpperCase()+" " + map.get(stri));
//				
//			}
//		}
		
		TreeMap<Integer, String > map2 = new TreeMap<>();
		for(String stri : map.keySet()) {
			int a = map.get(stri);
			if(map2.containsKey(a)) {
				map2.put(a, map2.get(a)+"&&"+stri);
			}
			else {
				map2.put(a, stri);
			}
			
			
		}
		System.out.println(map2);
		
		
		
		
		
	}
}