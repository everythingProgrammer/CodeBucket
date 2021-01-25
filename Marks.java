import java.util.*;
public class Marks {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
//		       int N = sc.nextInt();
//		       HashMap<Integer,Boolean> m = new HashMap<>();
//		       ArrayList<Integer> a = new ArrayList<>();
//		       for(int i=0;i<N;i++)
//		       {
//		           int x = sc.nextInt();
//		           while(m.containsKey(x))
//		           {
//		               x = x + 1;
//		           }
//		           m.put(x,true);
//		           a.add(x);
//		       }
//		       int sum = 0;
//		       for(int i=0; i<a.size();i++)
//		       {
//		           sum = sum + a.get(i);
//		       }
//		       System.out.print(sum);

		 int arr[] = {1,4,5,4,5};
		 System.out.println(marks(5, arr));
		 
		}
	
	public static  int marks(int input1, int input2[]) {
		
		int N = input1;
		
		HashMap<Integer,Boolean> m = new HashMap<>();
	    ArrayList<Integer> a = new ArrayList<>();
		for(int x : input2) {
			 while(m.containsKey(x))
	           {
	               x = x + 1;
	           }
	           m.put(x,true);
	           a.add(x);
		}
		int sum = 0;
	       for(int i=0; i<a.size();i++)
	       {
	           sum = sum + a.get(i);
	       }
	       
		return sum;
	}
	
	
}
