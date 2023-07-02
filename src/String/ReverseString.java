package String;

public class ReverseString {
    public static String reverse(String str){
        String reversedStr = "";
        for(int i = str.length() - 1; i >= 0; i--){
            reversedStr += str.charAt(i);
        }
        return reversedStr;
    }
}
