import java.util.*;
public class Maximum {
	static int countMax(int nums[]) {
		
		HashSet<Integer> nineList = new HashSet<>();
		
		Arrays.sort(nums);
		
		for(int i = nums.length -1; i>=0; i--){
			/*Check here if there's a nine in nums[i]*/
			
			int num = nums[i];
			while(num>0) {
				int n = num%10;
				if(n == 9) {
					nineList.add(nums[i]);
					nums[i] = -100;
					break;
				}
				num=num/10;
			}
		}
		TreeSet<Integer> treeSet = new TreeSet<Integer>(nineList);
		/*getting sum of largest three in treeset*/
		int num1 =0 , num2 =0, num3 =0;
		int sum = 0;
		int count = 0 ;
		for(int a: treeSet ) {
			
			if(a>num1 && count<= 3) {
				count++;
				sum = sum - num1;
				sum = sum + a; 
				num1 = num2;
				num2 = num3; 
				num3 = a;
			}
				
		}
		Arrays.sort(nums);
		int numremain = 3-count; 
		System.out.println("Current sum "+sum);
//		System.out.println("Nums remain"+ numremain);
		for(int i = 0 ; i<numremain; i++) {
			System.out.println(nums[nums.length -1-i]);
			sum+= nums[nums.length -1-i];
		}
		
//		System.out.println(sum);
		
		
		return sum;
	}
	
	
	public static void main(String args[]) {
		
		Scanner sr = new Scanner(System.in);
		int T = sr.nextInt();
		ArrayList<Integer> ans = new ArrayList<>();
		while(T>0) {
			T--;
			int N = sr.nextInt();
			int arr[] = new int[N];
			
			for(int i = 0 ; i<N ; i++) {
				arr[i] = sr.nextInt();
			}
			ans.add(countMax(arr));
		}
		
		for(int a: ans) {
			System.out.println(a);
		}
	}
}
