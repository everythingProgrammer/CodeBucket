package oopsConcepts.Interfaces;

interface testface1{
	default void method1() {
		System.out.println(" This is testface1 interface");
	}
	static void method2() {
		System.out.println("This is testface1 interface static method");
	}
	void method3() ;
}


class SuperClass1{
	
	 static void method2() {
		System.out.println("This is SuperClass1 static method");
	}
	
	 public void method1() {
		System.out.println("This is SuperClass Method");
	}
	 public void method3() {
		System.out.println("This SuperClass Method3");
	}
}



public class DefaultMethodConflict extends SuperClass1  implements testface1 {

	public static void main(String args[]) {
		DefaultMethodConflict obj = new DefaultMethodConflict();
		obj.method1();
		obj.method2();
	}
	
	
}
