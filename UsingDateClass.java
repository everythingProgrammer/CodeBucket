import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.*;
public class UsingDateClass {
	
	public static void main(String args[]) throws ParseException {
		@SuppressWarnings("deprecation")
		
		 SimpleDateFormat formatter1=new SimpleDateFormat("dd/MM/yyyy"); 
		Date date1=formatter1.parse("21-Jan-1999");  
//		Month month  = date1.getMonth();
		System.out.println( date1.getMonth());
	}
	
}
