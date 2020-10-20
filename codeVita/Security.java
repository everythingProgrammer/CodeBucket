package codeVita;
import java.util.*;
public class Security {
	
	public static void main(String arsgs[]) {
		Scanner sr = new Scanner(System.in);
		String s1 = sr.nextLine();
		String s2 = sr.nextLine();
		char latd= s1.charAt(s1.length()-1);
		char lond = s2.charAt(s2.length() -1);
		
		int arr[] = new int[26];
		Arrays.fill(arr,0);
		int min  = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(int i = 0; i<s1.length()-1; i++)
		{
			int a = (int)s1.charAt(i) - 97;
			arr[a] +=1;
			if(arr[a] > max) {
				max = arr[a];
			}
		}
		for(int b: arr)
			if(b!=0 && b<min)
				min = b;
		int ans1 = max-min;
		
		
		Arrays.fill(arr,0);
		min  = Integer.MAX_VALUE;
		max = Integer.MIN_VALUE;
		for(int i = 0; i<s2.length()-1; i++)
		{
			int a = (int)s2.charAt(i) - 97;
			arr[a] +=1;
			if(arr[a] > max) {
				max = arr[a];
			}
			
		}
		
		for(int b: arr)
			if(b!= 0 && b<min) {
				min = b;
						
			}
//		System.out.println("max"+max +" "+min);
		int ans2 = max-min;
		String s = "";
		s+= ans1;
		if(latd =='n') {
			s += " North ";
		}
		else if(latd =='s') {
			s+= " South ";
		}
		s+=ans2;
		if(lond =='e') {
			s+= " East";
		}
		else {
			s+= " West";
		}
		System.out.print(s);
	}
}
