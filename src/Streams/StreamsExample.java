package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsExample {

    //Stream operations
    public static void main(String[] args) {
        //stream
        Stream<String> shoppingList = Stream.of("apple", "copy", "pen", "mouse");

        //Stream from other collections
        String[] schoolArray = {"Georgian", "George Brown", "Seneca", "Centennial"};
        List<String> nameList = List.of("Bibek", "Nissan", "Tej", "Rabi");

        Stream<String> schoolStream = Arrays.stream(schoolArray);
        Stream<String> nameStream = nameList.stream();

        //Stream Operation
        System.out.println(schoolStream.anyMatch(fruit-> fruit.contains("apple"))); //anyMatch checks if the element is present

        //filter filers the stream and keeps only those which matches the requirements
        List<String> filteredName= nameList.stream().filter(name->name.contains("a")).toList(); //returns the elements with a in it
        System.out.println(filteredName);

        //map manipulates each element of stream
        Stream<Integer> intStream = Stream.of(1,2,3,4,5,6);
        List<Integer> intList = intStream.map(n-> n*n).toList();
        System.out.println(intList);
    }
}
