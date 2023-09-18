package Java_8_Interview_Questions;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SortNumbers {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(22,24,13,23,55,6,7,23,89,1,2,4,5);
        Optional<Integer> min = numbers.stream().sorted().findFirst();
        System.out.println("min Number: " +min);

        Optional<Integer> max = numbers.stream().sorted(Comparator.reverseOrder()).findFirst();
        System.out.println("Max Number: " + max);

        List<Integer> ascOrder = numbers.stream().sorted().collect(Collectors.toList());
        System.out.println("Asc Order: " + ascOrder);

        List<Integer> descOrder = numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("Desc Order List: " +descOrder);


//        Starts with two
        List<String> startsWithTwo = numbers.stream().map(e->e + " ")
                .filter(n->n.startsWith("2"))
                .collect(Collectors.toList());
        System.out.println("Starts with two: " +startsWithTwo);
    }
}
