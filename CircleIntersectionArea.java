import java.util.*;
public class CircleIntersectionArea {
	
	
	public static void main(String args[]) {
		
		
		double d = 0.00; // this is the distance between center of two circles
		int x1 =0,  y1 =0 ; 
		int x2 =3,  y2 = 0;
		int r1 = 2;
		int r2 = 2;
		int r = r1;
		int R = r2;
		
		d = (int) Math.sqrt( (Math.pow((x2 - x1), 2) +Math.pow((y2-y1), 2)) );
		
		if(R<r1) {
			R = r1;
			r = r2 ;
		}
		//R must have bigger radius and r must have smaller radius.
		
		
		Double part1 = r*r*Math.acos((d*d + r*r - R*R)/(2*d*r));
		Double part2 = R*R*Math.acos((d*d + R*R - r*r)/(2*d*R));
		Double part3 = 0.5*Math.sqrt((-d+r+R)*(d+r-R)*(d-r+R)*(d+r+R));	
		
		Double intersectionArea = part1 + part2 - part3;
		
		System.out.println(intersectionArea);
	}
	
	
	
}
