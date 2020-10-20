package unknown;
import java.util.*;
public class naukri {
	@SuppressWarnings("unchecked")
	public static void main(String argsp[])
	{
		Scanner sr = new Scanner(System.in);
		int elements = sr.nextInt();
		int div = sr.nextInt();
		HashSet<Integer> h = new HashSet<Integer>();
		
		for(int i = 0  ; i< elements ; i++)
		{
			h.add(sr.nextInt());
		}
		Integer[] arr = h.toArray( new Integer[h.size()] );
		
		Arrays.parallelSort(arr);
		
		int count= 0; // length of current sub sequence 
		HashSet<Integer> curr = new HashSet<Integer>();
		
		HashSet<Integer> content = new HashSet<Integer>();// will carry longest sequnce
		int lst = 0; //length of longest sequence 
		
		
		for(int i = 0 ; i<arr.length; i++)
		{
			if( arr[i] == -1)
			{
				continue;
			}
			curr.clear();
			curr.add(arr[i]);
			count = 0;
			for(int j = i ; j<arr.length; j++)
			{
				if( (arr[j] - arr[i])%div ==0)
				{
					count++;
					curr.add(arr[j]);
					arr[j] = -1;
				}
			}
			if(count > lst)
			{
				lst = count;
				content =(HashSet) curr.clone();
			}
		}
		
		System.out.println(lst);
		Iterator<Integer> i = content.iterator(); 
        while (i.hasNext()) 
            System.out.println(i.next()); 
		
		
	}
}
