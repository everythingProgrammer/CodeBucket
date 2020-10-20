package unknown;
import java.util.*;
public class Listss {
	
	public static void main(String args[]) {
		LinkedList<String> stack = new LinkedList<>();
		stack.push("A");
		stack.push("B");
		stack.addFirst("1");
//		stack.addLast("2");
		System.out.println(stack);
		System.out.println(stack.removeFirst());
		
	}
}
