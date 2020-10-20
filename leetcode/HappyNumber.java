package leetcode;

public class HappyNumber {
	static int newNumber(int num)
	{
		String s = ""+num;
		int sum = 0;
		for(int i = 1; i<s.length(); i++)
		{
			sum  = (int) (sum + Math.pow((num%Math.pow(10,i)), 2));
		}
		
		
		
		return sum;
	}
	
	static boolean isHappy(int n)
	{
		boolean f = false;
		if( n == 1 )
		{
			f = true;
		}
		else 
			f = isHappy(newNumber( n));
		return f;
	}
	
	public static void main(String argsp[])
	{
		System.out.println(isHappy(19));
	}
}
