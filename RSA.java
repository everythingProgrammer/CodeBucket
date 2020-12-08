import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
public class RSA {

public static void main(String []args){
 int p,q,n, theta,d=0,e,i;
 int msg=10;
 System.out.println("Plain text is "+ msg);
 
 double c;
 BigInteger msgback; 
 p=7; q=13;
 System.out.println("Value of p is: "+p);
 System.out.println("Value of q is: "+q);

 n=p*q;
 theta=(p-1)*(q-1);
 System.out.println("Value of theta = "+theta); 
 
 for(e=2;e<theta;e++)
 {
 if(gcd(e,theta)==1) // e is for public key exponent
     { 
     break;
     }
 }
 System.out.println("Value of e = "+e); 
 for(i=0;i<=9;i++)
 {
 int x=1+(i*theta);
 if(x%e==0)      //d is for private key exponent
     {
     d=x/e;
     break;
     }
 }
 System.out.println("Value of d = "+d); 
 c=(Math.pow(msg,e))%n;
 System.out.println("Encrypted message is: " + c);
                //converting int value of n to BigInteger
 BigInteger N = BigInteger.valueOf(n);
 //converting float value of c to BigInteger
 BigInteger C = BigDecimal.valueOf(c).toBigInteger();
 msgback = (C.pow(d)).mod(N);
 System.out.println("Derypted message is: " + msgback);
 }
 
 static int gcd(int e, int theta)
 {
 if(e==0)
 return theta; 
 else
 return gcd(theta%e,e);
      
     }
}
