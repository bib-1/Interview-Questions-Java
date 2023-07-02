package Optionals;

import java.util.Optional;

public class OptionalsExample {
    public static void main(String[] args) {
        Optional<String> opt = Optional.empty();
        Optional<Integer> optInt = Optional.of(10);


        //Example of how optional prevents null pointer exception
        if(opt.isPresent())
        {
            System.out.println(opt.get());
        }
        else{
            System.out.println("The passed opt is empty");
        }

        //We can use shortcupt me
        System.out.println(optInt.orElse(1));
    }
}
