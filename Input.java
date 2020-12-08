import java.io.*;
public class Input {
	
	public static void main(String args[]) throws IOException {
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		int n = Integer.parseInt( br.readLine());
		for(int i = 1; i<= n ; i++) {
			int n2 = Integer.parseInt( br.readLine());
			int a[] = new int[n2];
			for(int j = 0; j<n2; j++) {
				a[j] = Integer.parseInt(br.readLine());
			}
			int n1 =a.length;
		}
		
	}
	
}
