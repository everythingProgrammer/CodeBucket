import java.util.*;
public class LongestPallindromic {
	
	public static void main(String args[]) {
		String str="abbaca";
		int max=0;
		int start=0;
		int end=0;
		for(int i=0;i<str.length();i++) {
			int curmax=0;
			for(int j=i;j<str.length();j++) {
				int low=i;
				boolean flag=false;
				int high=j;
				while(low<=high) {
					if(str.charAt(i)==str.charAt(j)) {
						flag=true;
					}
					else {
						flag=false;
						break;
					}
					low++;
					high--;
					}
				if(flag==true) {
					curmax=j-i+1;
					if(max<curmax) {
						System.out.println("i is:"+i);
						System.out.println("j is :"+j);
							start=i;
							end=j;
					}
					max=Math.max(curmax, max);
				}
			}
		}
		System.out.println(max);
		for(int i=start;i<=end;i++) {
		System.out.print(str.charAt(i));
		}
	}
	
	
}
