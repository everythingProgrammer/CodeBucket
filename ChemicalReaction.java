
public class ChemicalReaction {
	
	public static void main(String args[]) {
		
		int chemicals[] = {9,-3,8,-6,-7,8,10};
		int max1=0 , max2 = 0;
		int min1= 0, min2 = 0;
		for(int i = 0 ; i< chemicals.length ; i++) {
			
			if(chemicals[i] > max1) {
				max2 = max1;
				max1 = chemicals[i];
			}
			else if(chemicals[i] > max2) {
				max2= chemicals[i];
			}
			
			else if(chemicals[i] < min1) {
				min1 = chemicals[i];
				min2 = min1;
			}
			else if(chemicals[i] < min2) {
				min2 = chemicals[i];
			}
			
		}
		
		System.out.println( max1*max2>min1*min2? max1+max2: min1+min2);
//		System.out.println(max1 +" "+max2);
		
	}
	
}
