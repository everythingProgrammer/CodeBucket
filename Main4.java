import java.util.*;
public class Main4 {
    public static void main(String args[]) {
        Scanner scn =new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int flag=0;
        int item = scn.nextInt();
        int lo = 0;
        int hi = arr.length - 1;
        int mid = (lo + hi) / 2;
        while (lo <= hi) {
            if (item > arr[mid])
                lo = mid + 1;
            else if (item < arr[mid])
                hi = mid - 1;
            else
                flag=1;
                break;
            }
            if (flag==1)
                System.out.print(mid+"Hellllloooooo???");
            else
                System.out.print(-1);
    }
}