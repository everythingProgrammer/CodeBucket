 import java.util.ArrayList;
 import java.util.LinkedHashSet;
 import java.util.List;
 import java.util.Set;

 public class FindCommon2 {
    public static final Set<String> commonSubstrings = new      LinkedHashSet<String>();

 public static void main(String[] args) {
    printCommonSubstrings("abcd", "bd");
    System.out.println(commonSubstrings  );
}

 public static void printCommonSubstrings(String s1, String s2) {
    for (int i = 0; i < s1.length();) {
        List<String> list = new ArrayList<String>();
        for (int j = i; j < s1.length(); j++) {
            String subStr = s1.substring(i, j + 1);
            if (isSubstring(subStr, s2)) {
                list.add(subStr);
            }
        }
        if (!list.isEmpty()) {
            String s = list.get(list.size() - 1);
            commonSubstrings.add(s);
            i += s.length();
        }
    }
 }

 public static boolean isSubstring(String s1, String s2) {
    boolean isSubstring = true;
    int strLen = s2.length();
    int strToCheckLen = s1.length();
    if (strToCheckLen > strLen) {
        isSubstring = false;
    } else {
        for (int i = 0; i <= (strLen - strToCheckLen); i++) {
            int index = i;
            int startingIndex = i;
            for (int j = 0; j < strToCheckLen; j++) {
                if (!(s1.charAt(j) == s2.charAt(index))) {
                    break;
                } else {
                    index++;
                }
            }
            if ((index - startingIndex) < strToCheckLen) {
                isSubstring = false;
            } else {
                isSubstring = true;
                break;
            }
        }
    }
    return isSubstring;
 }
}