package geeksforgeeks;
// url - https://practice.geeksforgeeks.org/problems/alternate-vowel-and-consonant-string/0

// Broken

// First Thing - count if there are enough vovels

import java.util.*;
public class AlternateVovel {
	public static String count(String str, int len)
	{
		int vovels= 0;
		List<Character> v = new ArrayList<Character>();
		List<Character> c = new ArrayList<Character>();
		int lt = 0;
		int ct = 0;
		for(int i = 0 ; i<len; i++)
		{
			if( str.charAt(i) == 'a' || str.charAt(i) == 'e'|| str.charAt(i) == 'i'  || str.charAt(i) == 'o' ||str.charAt(i) == 'u' )
			{
				v.add(lt, str.charAt(i));
				lt++;
			}
			else {
				
				c.add(str.charAt(i));
				ct++;
			}
		}
		//System.out.println("lt"+lt);
		
		if((ct+1 != lt) && (lt+1 != ct))
		{
			return " ";
		}
		
		int i = 0 ;//to track v
		int j = 0 ;// to track c 
		String  st2 ="";
		
		if(ct> lt)
		{
			while(i<lt)
			{
				st2 =st2+ c.get(j)+""+v.get(i);
				i++;
				j++;
			}
			st2 = st2+c.get(j);
		}
		else if(lt>= ct)
		{

			while(i<ct)
			{
				st2 =st2+ c.get(i)+""+v.get(j);
				i++;
				j++;
			}
			st2 = st2+v.get(i);
		}
		// Counted the number of vovels and consonents
		return st2;
		
	}
	
	
	public static void main(String args[])
	{
		System.out.println(count("aklm", 9));
	}
}
