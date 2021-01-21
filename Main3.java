// Java program to find the
// minimum number of digits
// to be removed to make a
// large number divisible by 3.
import java.io.*;
 
// function to count the no
// of removal of digits
// to make a very large
// number divisible by 3
class Main3 {
    static int divisible(String num,int x)
    {
            int n = num.length();
            int sum = 0;
            for (int i = 0; i < n; i++)
                sum += (int)(num.charAt(i));
            if (sum % x == 0)
                return 0;
            if (n == 1)
                return -1;
            for (int i = 0; i < n; i++)
                if (sum % x == (num.charAt(i) - '0') % x)
                    return 1;
            
            // if there are two numbers
            // then it is not possible
            // to remove two digits.
            if (n == 2)
                return -1;
     
            // Otherwise we can always
            // make a number multiple
            // of 2 by removing 2 digits.
            return 2;
    }
 
    public static void main(String[] args)
    {
        String num = "491";
        int x=7;
        System.out.println(divisible(num,x));
    }
}