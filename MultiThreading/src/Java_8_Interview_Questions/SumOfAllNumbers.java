package Java_8_Interview_Questions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfAllNumbers {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(5,6,3,6);
        Optional<Integer> sum = list.stream().reduce((a, b)->a+b);
        System.out.println("Sum: " +sum.get());

    }
}
