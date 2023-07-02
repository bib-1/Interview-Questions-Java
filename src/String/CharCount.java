package String;

import java.util.HashMap;
import java.util.Map;

public class CharCount {
    public static void main(String[] args) {

        String str = "BibekPoudel";

        char[] charArray = str.toCharArray();

        Map<Character, Integer> charCount = new HashMap<Character, Integer>();

        for (char c : charArray) {
            if (charCount.containsKey(c)) {
                charCount.put(c, charCount.get(c) + 1);
            } else {
                charCount.put(c, 1);
            }
        }

        System.out.println(charCount);
    }

}
