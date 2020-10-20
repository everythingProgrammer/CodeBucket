package unknown;
import java.util.*;
public class Badnumbers {
	public static int getLongestSegment(List<Integer> badNumbers, int lower, int upper) {
        int longestSegment = 0;
        int currentSegment = 0;
        int lastGoodNumber = lower;

        // Sort bad numbers
        Collections.sort(badNumbers);

        // Traverse over bad numbers, exploring left segment till all numbers are covered or upper is exceeded
        for (int i = 0; i < badNumbers.size() && badNumbers.get(i) <= upper; i++) {
            currentSegment = badNumbers.get(i) - lastGoodNumber;
            if (currentSegment > longestSegment) {
                longestSegment = currentSegment;
            }

            lastGoodNumber = badNumbers.get(i) + 1;
        }

        // Handle left segment of upper
        currentSegment = upper - lastGoodNumber + 1;
        if (currentSegment > longestSegment) {
            longestSegment = currentSegment;
        }

        return longestSegment;	  
    }
	
	
	public static void main(String args[]) {
		int bad[] = {};
	}
}
