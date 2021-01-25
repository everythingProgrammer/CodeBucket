import java.util.*;
public class KmaxSum {
	
	
	public static int maxSum(int input1 ,int input2,int [] input3 ) {
		int arr[] = input3;
		int k = input2;
		if(k == input1) {
			int sum = 0;
			for(int i =  0 ; i < input1; i++) {
				sum += input3[i];
			}
			return sum;
		}
		
		
		if(k > input1 || k == 0)
		{
			return 0;
		}
		PriorityQueue<Integer> minHeap = new  PriorityQueue<>(input2);
		
		for(int i = 0 ; i< k ; i++) {
			minHeap.add(arr[i]);
		}
		
		
		for(int i = k ; i< input1 ; i++) {
			if( arr[i] > minHeap.peek())
			{
				minHeap.poll();
				minHeap.add(arr[i]);
			}
			
		}
		int sum = 0;
		while(!minHeap.isEmpty())
		{
			sum += minHeap.poll();
		}
		
		return sum ;
	}
	
	public static void main(String args[]) {
		int arr[] = {4,3,6,1};
		System.out.println(maxSum(4, 0 , arr));
	}
	
}
