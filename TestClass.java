import java.io.*;
import java.util.*;
 
 
public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        String S = br.readLine();
 
        int out_ = SmallestSubString(S);
        wr.println(out_);
 
        wr.close();
        br.close();
    }
 
    static int SmallestSubString(String str) {
        
          int n = str.length(); 
          
  
        // Count all distinct characters. 
        int dist_count = 0; 
  
        boolean[] visited = new boolean[256]; 
        Arrays.fill(visited, false); 
        for (int i = 0; i < n; i++) { 
            if (visited[str.charAt(i)] == false) { 
                visited[str.charAt(i)] = true; 
                dist_count++; 
            } 
        }
 
         int start = 0, start_index = -1; 
        int min_len = Integer.MAX_VALUE; 
  
        int count = 0; 
        int[] curr_count = new int[256]; 
        for (int j = 0; j < n; j++) { 
            // Count occurrence of characters of string 
            curr_count[str.charAt(j)]++; 
  
            // If any distinct character matched, 
            // then increment count 
            if (curr_count[str.charAt(j)] == 1) 
                count++; 
  
            // if all the characters are matched 
            if (count == dist_count) { 
                // Try to minimize the window i.e., check if 
                // any character is occurring more no. of times 
                // than its occurrence in pattern, if yes 
                // then remove it from starting and also remove 
                // the useless characters. 
                while (curr_count[str.charAt(start)] > 1) { 
                    if (curr_count[str.charAt(start)] > 1) 
                        curr_count[str.charAt(start)]--; 
                    start++; 
                } 
  
                // Update window size 
                int len_window = j - start + 1; 
                if (min_len > len_window) { 
                    min_len = len_window; 
                    start_index = start; 
                } 
            } 
        } 
        // Return substring starting from start_index 
        // and length min_len 
        return str.substring(start_index, start_index + min_len).length(); 
    }
}