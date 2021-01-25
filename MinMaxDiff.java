import java.util.*;
import java.io.*;
public class MinMaxDiff {
    static int[] cumSum;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while((line = br.readLine())!=null){
            int n = Integer.parseInt(line);
            line = br.readLine();
            int[] nums = new int[n];
            String[] arr = line.split("\\s");
            for(int i=0; i<n; i++)
                nums[i] = Integer.parseInt(arr[i]);
            int k= Integer.parseInt(br.readLine());
            System.out.println(binaryMinMax(nums, k));
        }
    }
    //Binary search O(N log(arr[-1]-arr[0])) solution
    public static int binaryMinMax(int[] arr, int k){
        int left = 0;
        int right = arr[arr.length-1]-arr[0];
        int[] diff = new int[arr.length-1];
        for(int i=1; i<arr.length; i++){
            diff[i-1] = arr[i]-arr[i-1];
        }
        while(left<right){
            int mid = left+(right-left)/2;
            if(canDivide(diff, k, mid))
                right = mid;
            else
                left = mid+1;
        }
        return left;
    }
    public static boolean canDivide(int[] arr, int k, int max){
        int i =0;
        k++;
        while(k>0 && i<arr.length ){
            int sum = 0;
            while(i<arr.length && sum+arr[i]<max){
                sum+=arr[i++];
            }
            k--;
        }
        return i==arr.length;
    }
    //DP O(N^2K) solution
    public static int minMax(int[] arr, int[][] dp, int i, int k){
        if(k==0){
            int sum =0;
           for(int j=i; j<arr.length; j++)
               sum += arr[j];
           dp[i][k]= sum;
           return sum;
        }
        if(dp[i][k]!=-1)
            return dp[i][k];
        int minDiff = Integer.MAX_VALUE;
        int sum= 0;
        for(int j=i+1; j<arr.length; j++){
            sum+=arr[j-1];
            minDiff = Math.min(minDiff, Math.max(sum, minMax(arr, dp, j, k-1)));
        }

        dp[i][k] = minDiff;
        return minDiff;
    }
}