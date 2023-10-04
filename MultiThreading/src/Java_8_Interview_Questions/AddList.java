package Java_8_Interview_Questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class AddList {
    public static void main(String[] args){
        List<String> coolestManager = Arrays.asList("@Anujjain"," ");
        coolestManager.stream()
                .map(e->e.replace(" ","Thank you for teaching me cool stuff"))
                .forEach(System.out::println);


    }
}
