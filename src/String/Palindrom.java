package String;

public class Palindrom {
    public static void main(String[] args) {
        System.out.println(isPalindrom("caa"));
    }

    static boolean isPalindrom(String str){
        for(int i = 0; i < str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-i -1)){
                return false;
            }
        }
        return true;
    }
}
