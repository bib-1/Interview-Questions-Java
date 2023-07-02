package Recursion;

public class FibonacciNumbers {
    public static int fibonacci(int num) {
        if(num <= 1 ){
            return num;
        }
        return fibonacci(num -1) + fibonacci(num -2);
    }


    //0, 1, 1, 2, 3, 5, 8, 13.....

    // a = 0, b = 1, c = a+b
//    public static void fibonacci(int num){
//        int a = 0;
//        int b = 1;
//        int c = 1;
//
//        for(int i =1; i <= num; i++){
//            System.out.println(a);
//            a = b;
//            b = c;
//            c = a+b;
//        }
//    }
}
