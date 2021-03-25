import java.util.*;
public class PokemonBattle {
	
	public int battle(int input1, int input2 , String [] input3, String input4) {
		int count = 0;
		int cmaxc = 0;
		int maxc = 0;
		int maxpc = 0;
		int maxpointer = 0;
		HashSet<String> hs = new HashSet<>();
		for(String st: input3) {
			hs.add(st);
		}
		for(int i = 0 ; i<input4.length(); i++) {
			
			if(hs.contains(input4.substring(i, i+input2))) {
				boolean flag = true;
				int j = i;
				count = 1;
				while(flag) {
					j = j+4;
					if(hs.contains(input4.substring(j, j+input2))) {
						count++;
					}else {
						maxc = count;
						maxpc = i;
						flag = false;
						break;
						
					}
				}
					if(count>maxc) {
						maxc = count;
						maxpointer = i;
					}
				}

			}
			
		}
		return maxpointer;
	}
	
	
	public static void main() {
		
	}
	
}
