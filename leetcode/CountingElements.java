package leetcode;

import java.util.HashSet;

public class CountingElements {
	
	
	public int countElements(int arr[])
	{
		HashSet<Integer> ar = new HashSet();
		for(int i :arr)
			ar.add(i);
		
		int count = 0;
		
		for(int k:ar)
		{
			if(ar.contains(k+1))
				count++;
		}
		return count;
		
	}
}
