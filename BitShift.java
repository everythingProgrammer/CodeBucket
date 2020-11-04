
public class BitShift {
	public static void main(String [] args)
	{
		int x = 0x80000000;
		System.out.print(x + " and ");
		x = x >>> 31;
		System.out.println(x);
	}
	public void test(int x) 
	{ 
	    int odd = 1; 
	    if(odd)       
	    {
	        System.out.println("odd"); 
	    }
	    else 
	    {
	        System.out.println("even"); 

	    }
	}
}
