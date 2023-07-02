import java.util.Stack;

public class BinaryNumbers {
    public static void main(String[] args) {
/**
 * 4/2 = quo = 2 , rem = 0
 * 2/2 = quo= 1, rem = 0
 * 1/2 = quo = 0, rem = 1
 *
 * */
        int decimalNum = 5;
        Stack<Integer> i = new Stack<>();
        int quo = decimalNum;
        while (quo > 0) {
            int rem = quo % 2;
            i.push(rem);
            quo = quo/ 2;
        }

        int binary = 0;
        while(!i.isEmpty()){
            binary = binary*10 + i.pop();
        }
        System.out.println(binary);
    }
}
