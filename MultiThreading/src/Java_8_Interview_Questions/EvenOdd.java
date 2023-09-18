package Java_8_Interview_Questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOdd {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(3,4,5,6,2,7,4,8,10);
        List<Integer> even = numbers.stream().filter(n->n%2==0)
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Even Numbers: " +even);

        List<Integer> odd =numbers.stream().filter(n->n%2!=0)
                .collect(Collectors.toList());
        System.out.println("Odd Numbers: " +odd);

    }
}
