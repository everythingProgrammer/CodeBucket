
public class maxConsecutive1 {
	
	public static void main(String args[]) {
		int arr[] = {1,0,0,0,1,1,1,1};
		int maxConsecutive = 0 ; 
		int current = 0;
		for(int i = 0 ; i<arr.length ;i++) {
			System.out.println(i+" "+ current);
			if(arr[i] == 0) {
				if(current > maxConsecutive) {
					maxConsecutive = current ; 
					current = 0;
					
				}
				else {
					current = 0;
				}
			}
			else if(arr[i] ==1) {
				current ++;
			}
		}
		System.out.println(maxConsecutive);
		
	}
	
}
