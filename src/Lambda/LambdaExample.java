package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class LambdaExample {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Banana", "Pineapple", "Jackfruit");

        //Lambda Function
        fruits.forEach(fruit-> System.out.println(fruit));


        //Consumer Interface takes one input and have no returns
        Consumer<String> printFruit = fruit -> System.out.println(fruit);
        fruits.forEach(printFruit);

        //Supplier

        //Predicate

        //Function


    }
}
