package Stack;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {

        //create
        Stack<String> stack = new Stack();

        //update
        stack.push("One");
        stack.push("Two");
        stack.push("Three");

        //print
        System.out.println(stack);

        //delete
        String itemsDeleted = stack.pop();
        System.out.println(stack + " After deleting: " + itemsDeleted);

        //Delete All
        while(!stack.empty()){
            stack.pop();
        }

        System.out.println(stack);


    }
}
