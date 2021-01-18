
class Base2{
	public static void print1() {
		System.out.println("Print1 form Base1");
	}
}


public class Inherit extends Base2 {
	
	
	public static void print1() {
		System.out.println("Print1 form Inherit");
	}
	public static void print2() {
		System.out.println("Print2 form Inherit");
	}
	public static void main(String args[]) {
		Inherit obj = new Inherit();
		obj.print1();
		Base2 obj2 = new Inherit();
		obj2.print2();
//		Inherit obj3 = new Base2();
		
	}
	
	
}
