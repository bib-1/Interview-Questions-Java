package String;

public class VowelsOrNot {
    static String[] vowels = {"a", "e", "i", "o", "u"};
    public static boolean isPresent(String str){
        for (String c: vowels) {
            if(str.toLowerCase().contains(c)){
                return true;
            }
        }
        return false;
    }
}
