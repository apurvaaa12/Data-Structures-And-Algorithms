package Java_8_Interview_Questions;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args){
        String str = "SaPLAb";

        Map<String,Long> result = Arrays.stream(str.split(""))
                .map(String::toLowerCase).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(result);
    }


}
