package programs;
import java.util.*;
public class SumOfDigits {
	
	
	/*We'll use Scanner to input the number
	 *so import statement will be "import java.util.*;" 
	 *
	 **/
	
	public static void main(String args[]) {
		Scanner sr = new Scanner(System.in);
		/*this is how we initialize our scanner */
		
		
		/*Taking input number*/
		int num = sr.nextInt();
		/*as we wanted to input a integer we wrote sr.nextInt() 
		 * if we wanted to input a String we would have written sr.nextLine() */
		
		/* eg 12345 
		 * 
		 * what we'll do is we will start form last digit 5 and
		 * keep summing it up so 
		 * first 5 then 4 then 3 then 2 then 1 and keep adding them 
		 * 
		 * 
		 * */
		

		int sum = 0; // sum will be used to store sum of digits
		
		while(num>0) {
			int digit = num % 10; // using modulous operator we'll get the last digit of number in num
			sum = sum + digit;
			num = num/10; // now we will divide the number by 10 so the last digit will be removed everytime...
		}
		System.out.println(sum);
		
	}
}
