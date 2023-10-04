package Java_8_Interview_Questions;

import java.util.Arrays;
import java.util.List;

public class ObjToUppercase {
    public static void main(String[] args){
        List<String> name = Arrays.asList("Apurva");
        //to Uppercase
        name.stream().map(String::toUpperCase)
                .forEach(System.out::println);
        //to Lowercase
        name.stream().map(String::toLowerCase)
                .forEach(System.out::println);
        //Length Of the String
        name.stream().map(String::length)
                .forEach(System.out::println);

    }
}
