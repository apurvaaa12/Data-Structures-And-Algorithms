package Java_8_Interview_Questions;

import java.util.Arrays;
import java.util.List;

public class AverageOfAllNum {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(2,3,4,5,1,6,7);
        double average = list.stream().mapToInt(e->e)
                .average().getAsDouble();
        System.out.println("Average: " + average);
    }
}
