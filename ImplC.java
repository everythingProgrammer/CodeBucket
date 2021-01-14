
interface Base1{
	void method();
}

class BaseC{
	public void method() {
		System.out.println("Inside BaseC :: method");
	}
}


public class ImplC extends BaseC implements Base1 {
	
	public static void main(String args[]) {
		(new ImplC()).method();
	}
}
