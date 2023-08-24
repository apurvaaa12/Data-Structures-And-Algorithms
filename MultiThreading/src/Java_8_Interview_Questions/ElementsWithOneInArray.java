package Java_8_Interview_Questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ElementsWithOneInArray {
    public static void main(String[] args){
        int[] numbers ={12,23,2,3,2,1,4,33,11,17};
        //convert int to string
       List<String> stringList= Arrays.stream(numbers).boxed()
                .map(s->s+"")//we'll get a string array
                .collect(Collectors.toList());
        System.out.println(stringList);

       List<String> numsWithOne = Arrays.stream(numbers).boxed()
               .map(s->s+"")
               .filter(s->s.startsWith("2"))
               .collect(Collectors.toList());
        System.out.println(numsWithOne);
    }
}
