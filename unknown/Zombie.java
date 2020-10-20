package unknown;
import java.util.*;
public class Zombie {
	static HashMap<Integer, Integer> ma = new HashMap<>(); 
	  

    static void primeFactorize(int a) 
    { 
        for (int i = 2; i * i <= a; i += 2) { 
            int cnt = 0; 
            while (a % i == 0) { 
                cnt++; 
                a /= i; 
            } 
            ma.put(i, cnt); 
        } 
        if (a > 1) 
            ma.put(a, 1); 
    } 
  
    public boolean commDiv(int a, int b) 
    { 
        primeFactorize(a); 
        int res = 1; 
  
        for (Map.Entry<Integer, Integer> m : ma.entrySet()) { 
            int cnt = 0; 
  
            int key = m.getKey(); 
            int value = m.getValue(); 
  
            while (b % key == 0) { 
                b /= key; 
                cnt++; 
            } 
            res *= (Math.min(cnt, value) + 1); 
        } 
        
        ma = new HashMap<>();
        return (res>1)?false: true; 
    } 
    
    
    
    public int find(int input1[],int input2) {
    	int index = 0; 
    	for(int i = 0; i< input1.length-1 ; i++) {
    		if(input1[i] > input1[i+1]) {
    			if(commDiv(input1[i], input1[i+1]))
    				index = i;
    			}
    	}
    	return index;
    }
    
    public static void main(String args[]) {
    	Zombie obj = new Zombie();
    	int arr[]= {4,1,3,2};
    	System.out.println(obj.find(arr, 4));
    }
	
}
