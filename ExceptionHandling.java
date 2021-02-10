import java.io.FileNotFoundException;
import java.io.IOException;

class UFO extends IOException{
	public UFO() {}
	public UFO(String st) {
		super(st);
	}
}






public class ExceptionHandling  {
	
	public static void func1() throws UFO {
		
		System.out.println("This is function");
		throw new UFO("From func1");
	}
	
	
	
	public static void main(String args[]){
		
		try{
			System.out.println("First Line");
			func1();
			throw new UFO("Something exception");
		}
		catch( UFO      e) {
			System.out.println("ufo exception"+e.getMessage());
			System.out.println(e);
			System.out.println("Exception was caught");
		}
		System.out.println("Second Line");
		System.out.println("Thrid");
		System.out.println("Fourth");
		
	}
	
	
}
