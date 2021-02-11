package oopsConcepts.Interfaces;

class C1{
	
	public void print1() {
		System.out.println("This is something something something");
	}
	
}

class C2 extends C1{
	
	public void print1() {
		System.out.println("This is print 2 form C2");
	}
	public void print2() {
		System.out.println("This is print2");
	}
}



public class Polymorphismm {
	public static void main(String args[]) {
		
		C2 obj =  new C2();
		C1 obj2 = new C1();
//		C2 obj4 = new C1();
		C1 obj3 = new C2();
		obj.print1();
		obj3.print1();
		
	}
}
