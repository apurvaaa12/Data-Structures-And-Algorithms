package Java_8_Interview_Questions;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharOccurrences {

    public static void main(String[] args){
        String input ="mynameisapurva";
//        String[] result = input.split("");
//        System.out.println(Arrays.toString(result));
        Map<String, Long> map =Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);
    }
}
