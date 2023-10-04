package Java_8_Interview_Questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateElements {
    public static void main(String[] args){
        List<Integer> nums = Arrays.asList(2,4,1,5,6,3,6,2,4,6,3,6);

        nums.stream().sorted().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().filter(x->x.getValue() > 1)
                .forEach(System.out::println);
    }
}
