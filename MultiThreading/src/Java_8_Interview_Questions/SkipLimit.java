package Java_8_Interview_Questions;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SkipLimit {
    public static void main(String[] args){
        int[] numbers = {3,2,4,5,2,5,6,23,78,44,35,2,5,25,4645,745};

        List<Integer> sortedList = Arrays.stream(numbers).boxed()
                .sorted().toList();
        System.out.println("Sorted List : " +sortedList);

        List<Integer> skip = Arrays.stream(numbers).boxed()
                .sorted().skip(3).toList();
        System.out.println("List After Skipping first 3 numbers: " +skip);

        List<Integer> limit = Arrays.stream(numbers).boxed().limit(3).toList();
        System.out.println("Limited Values: " + limit);

        List<Integer> removeDuplicates = Arrays.stream(numbers)
                .boxed()
                .sorted()
                .distinct().toList();
        System.out.println("Array After removing duplicates: " + removeDuplicates);

        List<Integer> limit2 = Arrays.stream(numbers).boxed()
                .sorted()
                .distinct()
                .filter(n->n%2==0)
                .limit(2)
                .toList();
        System.out.println("First two even Numbers : " +limit2);

    }
}
