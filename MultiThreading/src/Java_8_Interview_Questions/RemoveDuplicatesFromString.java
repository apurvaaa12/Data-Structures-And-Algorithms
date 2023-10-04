package Java_8_Interview_Questions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromString {
    public static void main(String[] args){
        String str = "apurvasree";
        List<String> duplicateElements = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().filter(x-> x.getValue()>1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(duplicateElements);

        List<String> uniqueElements = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().filter(x-> x.getValue() == 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(uniqueElements);

        Optional<String> ans = uniqueElements.stream().reduce((a, b)->a+b);

        System.out.println(ans);


        int[] nums = {1,2,3,2};
        List<Integer> list = Arrays.stream(nums).boxed()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().filter(x-> x.getValue() ==1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        int result = list.stream().mapToInt(Integer::intValue) .sum();
        System.out.println(result);

    }
}
