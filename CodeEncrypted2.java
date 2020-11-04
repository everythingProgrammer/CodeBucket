import java.util.Scanner;
import java.math.BigInteger;
public class CodeEncrypted2
{
   public static void main(String[] args)
   {
       BigInteger S, N, M, ans;
       System.out.println("Enter the values of S, N, M: ");
       Scanner sc = new Scanner(System.in);
       S = sc.nextBigInteger();
       N = sc.nextBigInteger();
       M = sc.nextBigInteger();
//       BigInteger b1, b2;
       BigInteger b1 = new BigInteger("10"); 
       BigInteger b2 = new BigInteger("1000000007");
       ans = S.pow(N.intValue());
       ans = ans.mod(b1);
       ans = ans.pow(M.intValue());
       ans = ans.mod(b2);
       System.out.println(ans);
   }
}