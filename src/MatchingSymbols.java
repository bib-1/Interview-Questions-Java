import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class MatchingSymbols {

    public static void main(String[] args) {
        //Matching cases
        String str1= "(<[]>)";
        String str2= "(<incre>ment)";
        String str3= "()ment<>";

        //Not matching cases
        String str4 = "<inrement(";
        String str5 = "<increment())";
        String str6 = "<[increment()[])";

        //Using the simpleSoln to check
        System.out.println(simpleSoln(str1));
        System.out.println(simpleSoln(str2));
        System.out.println(simpleSoln(str3));
        System.out.println(simpleSoln(str4));
        System.out.println(simpleSoln(str5));
        System.out.println(simpleSoln(str6));

        //using the advanced soln
        System.out.println(advancedSoln(str1));
        System.out.println(advancedSoln(str2));
        System.out.println(advancedSoln(str3));
        System.out.println(advancedSoln(str4));
        System.out.println(advancedSoln(str5));
        System.out.println(advancedSoln(str6));
    }

    /**
     *
     * */
    public static boolean advancedSoln(String str){
        Stack<Character> firstPair = new Stack<>();
        Map<Character, Character> symbols = Map.of('<', '>', '(', ')', '[', ']');

        for (char c:str.toCharArray()) {

            //if the braces is open
            //pushing the required closing braces in the stack
            if(symbols.containsKey(c)){
                firstPair.push(symbols.get(c));
                continue;
            }

            if(!firstPair.isEmpty() && symbols.containsValue(c)){
                //checking if the closing braces matches with the braces in the stack
                if(c != firstPair.pop()){
                    return false;
                }
            }

        }
        return firstPair.isEmpty();
    }

    /**
     * <>, (), [],
     *Simple Solution - keep the trac of each opening braces and closing braces, if they are equal then matching symbols else not
     * this takes long iteration and comparition
     * numOf<
     * numOf(
     * numOf[
     *
     * Next Solution - using map
     *
     * */
    public static boolean simpleSoln(String str){

        int firstSymbol = 0, secSymbol = 0, thirdSymbol = 0;
        for (char c: str.toCharArray()) {
            if(c == '<'){
                firstSymbol++;
                continue;
            }
            if(c == '('){
                secSymbol++;
                continue;
            }
            if(c == '['){
                thirdSymbol++;
                continue;
            }if(c == '>'){
                firstSymbol--;
                continue;
            }
            if(c == ')'){
                secSymbol--;
                continue;
            }
            if(c == ']'){
                thirdSymbol--;

            }
        }
        if(firstSymbol !=0 || secSymbol!=0 || thirdSymbol!=0){
            return false;
        }

        return true;
    }
}
