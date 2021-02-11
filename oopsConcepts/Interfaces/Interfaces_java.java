package oopsConcepts.Interfaces;

interface Drawable{
	void draw();
	static int cube(int x) {
		return x*x*x;
	}
	default int cube2(int x) {
		return x*x;
	}
//	public int cube3(int x) ;
}

class Rectangle implements Drawable{
//	static int cube(int x) {
//		return x*x;
//	}
	
//	public int cube2(int x) {
//		return x*x;
//	}
	public void draw() {
		System.out.println("Rectangle deawn");
	}
}

public class Interfaces_java {
	
	public static void main(String args[]) {
		Rectangle r = new Rectangle();
		r.draw();
		System.out.println(r.cube2(30) );
	}
	
	
}
