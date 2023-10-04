package Java_8_Interview_Questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatList {
    public static void main(String[] args){
        List<Integer> list1 = Arrays.asList(2,4,6,8);
        List<Integer> list2 = Arrays.asList(3,5,7,9);
        List<String> string1 = Arrays.asList("Apurva","is","my","name");
        List<String> string2 = Arrays.asList("Anuj","is","my","manager");
        List<String> apurva = Stream.concat(string1.stream(),string2.stream()).toList();
        System.out.println("Apurva's Details: " +apurva);

        List<Integer> merged = Stream.concat(list1.stream(),list2.stream()).sorted().toList();
        System.out.println("Merged List : " + merged);


        int [] nums = {1,2,3,4};
        Stream<Integer> result = Stream.concat(Arrays.stream(nums).boxed(), Arrays.stream(nums).boxed()).sorted();

        System.out.println(result.toList());
    }
}
