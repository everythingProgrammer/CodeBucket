import java.util.*;
public class BusTravelling {
	
	
	
	public static void main(String args[]) {
		Scanner sr = new Scanner(System.in);
		int q = sr.nextInt();
		int dis[][] = new int[q][2];
		
		for(int i = 0 ;i<q; i++) {
			for(int j = 0 ;j<2 ; j++) {
				dis[i][j] = sr.nextInt();
			}
		}
		
		int dist = dis[0][1] - dis[0][0];
		for(int i =1 ; i<q; i++) {
			for(int j = 0 ; j< 2 ; j++) {
				int substract = 0 ;
				if(dis[i][0] < dis[i-1][1]) {
					substract = dis[i][1] - dis[i][0];
				}
				dist = dist - substract ; 
				dist = dist +(dis[i][1] - dis[i][0]);
			}
		}
		System.out.println(dist);
	}
	
	
	
}
