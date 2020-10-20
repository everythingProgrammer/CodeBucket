package leetcode;
// url https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/528/week-1/3286/
import java.util.*;
public class moveZeros {
	
	static void move(int arr[])
	{
		int nxt =0;
		int l = arr.length;
		
		for(int num:arr)
		{
			if(num != 0)
			{
				arr[nxt] = num;
				nxt++;
			}
		}
		for(int i = nxt ; i<l ; i++)
		{
			arr[i] = 0;
		}
		
		for(int i = 0 ; i<l ; i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}
	
	
	public static void main(String args[])
	{
		int arr[] = {5,0,4,6,0,5,0,1,2,3};
		move(arr);
	}
	

}
