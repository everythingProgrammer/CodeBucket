package unknown;
import java.util.*;
public class MazePath2 {
	
	
	
	
	public static int findProbability(List<List<Character>> matrix, List<List<Integer>> tunnels) {
		
		/*First scan and find A*/
		List<Character> l1 = matrix.get(0);
		int rows = matrix.size();
		int colomns = l1.size();
		int cr =0,cc = 0;
		int er =0, ec = 0;
		for(int i = 0 ; i< rows ; i++) {
			for(int j = 0 ; j < colomns ; j++) {
				if( matrix.get(i).get(i) == 'A')
				{
					cr = i;
					cc= j;
				}
			}
		}
		for(int i = 0 ; i< rows ; i++) {
			for(int j = 0 ; j < colomns ; j++) {
				if( matrix.get(i).get(i) == '%')
				{
					er = i;
					ec= j;
				}
			}
		}
		countPath(cc, cr,ec,er, matrix, tunnels );
		
		return  0;
		
	}
	
	public static int countPath(int cc , int cr, int ec, int er , List<List<Character>> matrix, List<List<Integer>> tunnels) {
		if( cc == ec && cr == er) {
			return 1;
		}
		else if(cc>ec || cr> er) {
			return 0;
		}
		else if(matrix.get(cr).get(cc) =='*' || matrix.get(cr).get(cc) =='#' ) {
			return 0;
		}
		
		int sum = 0 ; 
		for(int i = 0 ; i < tunnels.size() ; i++) {	
				if(tunnels.get(i).get(0)== cr && tunnels.get(i).get(1) == cc)
				{
					cr = tunnels.get(i).get(2);
					cc = tunnels.get(i).get(3);
				}
		}
		
		if(cc == ec && cr == er)
		{
			sum = sum+1;
		}
		sum = sum + countPath(cc+1 , cr, ec, er , matrix , tunnels) + countPath(cc+1,cr+1, ec,er , matrix , tunnels) + countPath(cc, cr+1 , ec, er , matrix, tunnels);
		
		return sum;	
	}
	
	
	public static void main(String args[]) {
		
		List<List<Character>> matrix = new ArrayList<>();
		List<Character> ch1 = new ArrayList<>();
		
		
	}
	
}
