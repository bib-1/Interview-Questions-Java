package ControlFlow;

public class Switch {

    public static void main(String[] args) {
        char c = 'c';

        switch(c){
            case 'a':
                System.out.println("true");
                break;
            case 'b':
                System.out.println("false");
                break;
            default:
                System.out.println("End of switch");
        }
    }
}
