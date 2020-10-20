package unknown;
import java.util.*;
class equality 
{
    int x;
    int y;
    boolean isequal()
    {
        return(x == y);  
    } 
}    
class Output 
{
    public static void main(String args[]) 
    {
        equality obj = new equality();
        obj.x = 5;
        obj.y = 5;
        System.out.println(obj.isequal());
    } 
}


public class random {
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<>();
		 list.add("P");
		 list.add("Q");
		 list.add("R");
		 list.set(2, "s");
		 list.add(2, "T");
		 list.add("u");
		 System.out.println(list);
	}
}
