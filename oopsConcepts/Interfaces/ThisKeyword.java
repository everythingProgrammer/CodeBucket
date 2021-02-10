package oopsConcepts.Interfaces;

public class ThisKeyword {
	
	int a = 0;
	int b = 0;
	
	public void alter() {
		a =3;
		b =4;
	}
	
	
	public static void main(String args[]) {
		
		ThisKeyword obj = new ThisKeyword();
		obj.alter();
		System.out.println(obj.a);
		System.out.println(obj.b);
	}
	
	
	
	
	
	
}
