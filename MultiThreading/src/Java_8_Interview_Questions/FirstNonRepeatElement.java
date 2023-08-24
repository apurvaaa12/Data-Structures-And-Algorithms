package Java_8_Interview_Questions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatElement {
    public static void main(String[] args){
        String str = "Apurvasree";
        String uniqueElements = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().filter(x-> x.getValue() == 1)
                        .findFirst().get().getKey();
        System.out.println(uniqueElements);
    }
}
