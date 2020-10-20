package geeksforgeeks;
//https://practice.geeksforgeeks.org/problems/subarray-with-given-sum/0
// use two pointers starting from positions 0 and 1 
// if sum is less the move r to right 
// if sum is more then move l to right 
// this will be useful to find sum in continuous subarray 
public class subarraysum {
	public static void findSubArray(int arr[], int num)
	{
		int l = 0 ;
		int r = 0; 
		int sum = 0;
		boolean flag = true;
		sum = arr[l];
		while(l<arr.length && r < arr.length)
		{
			
			if(l==r )
			{
				sum = arr[l];

			}
			if( sum == num)
			{
				flag = false;
				System.out.println(l+","+r);
				//System.out.println(arr[l]+" "+arr[r]);
				break;
			}
			
			if(sum < num && r < arr.length-1)
			{
				r++;
				sum = sum + arr[r];
			}
			else if(sum > num && l < arr.length-1)
			{
				l++;
				sum = sum-arr[l-1]; 
			}
			
				
		}

		if(flag)
		{
			System.out.println("-1");
		}
		
	}
	
	
	public static void main(String args[])
	{
		long t1 = System.currentTimeMillis();
		int a[] = {1,4,5,2,1,2,3,7,3,12,323,2,3,7,2000};
		findSubArray(a,2000);
		long t2 = System.currentTimeMillis();
		System.out.println("Time taken "+ (t2-t1));
	}
	
}
