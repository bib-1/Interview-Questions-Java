import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Optional;

public class MostRepeatedWord {
    public static void main(String[] args) {
        String str1 = " Find the most repeated word from this sentences. The word must be repeated more than once in the sentence.";
        mostRepeated(str1);

    }

    public static void mostRepeated(String str){
        /**
         * split each word
         * make each word a key and keep track of it's occurance;
         * the key with max value is the most repeated key
         *
         * */

        String [] strArray = str.split("[ \\n\\t\\r.,;:!?(){]");


        HashMap<String, Integer> charCount = new HashMap<>();

        //stores strings and their repetition in hashmap
        for(String s: strArray){
            s = s.toLowerCase().trim();
            if(!charCount.containsKey(s)){
                charCount.put(s, 1);
            }
            else {
                charCount.put(s, charCount.get(s) + 1);
            }
        }

        int max = 0;
        String maxKey = "";
        for(String s: charCount.keySet()) {
            if (charCount.get(s) > max) {
                max = charCount.get(s);
                maxKey = s;
            }
        }

        System.out.println("The max num of repeated word is '" + maxKey + "' It is repeated " + max + "times.");;
    }
}
