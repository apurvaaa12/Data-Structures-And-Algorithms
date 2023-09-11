package Java_8_Interview_Questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringJoin {
    public static void main(String[] args){
        List<String> numbers= Arrays.asList("1","2","3","4");
        String result= String.join("/" ,numbers);
        System.out.println(result);


        interface SumCalculator {
            int sum(int a, int b);
        }

        SumCalculator sumCalculator = (x, y) -> x+y;
        int result1 = sumCalculator.sum(7, 6);
        System.out.println("Sum 7,6 : " + result1);
    }


}
