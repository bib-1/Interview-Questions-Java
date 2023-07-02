package String;

import java.util.Arrays;
import java.util.Locale;

public class NumberOfVowelsAndConsonant {
    public static void main(String[] args) {
        count("AEIOU");
    }
    
    public static void count(String str){
        String vowels = "aeiou";
        int vowelsCount = 0;
        str = str.toLowerCase();
        for(int i = 0; i < str.length(); i++){
            if(vowels.contains(str.substring(i,i+1))){
                vowelsCount++;
            }
        }
        int consonantCount = str.length() - vowelsCount;

        System.out.printf("Number of vowels: %d. Number of consonants: %d", vowelsCount, consonantCount);
    }
}
