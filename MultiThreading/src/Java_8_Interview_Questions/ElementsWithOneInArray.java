package Java_8_Interview_Questions;

import java.lang.reflect.Array;
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


        int[] array = {2,1,3,2,4,2,4,2,1,5,6,7};
        //sorting an array
        List<Integer> result= Arrays.stream(array).boxed()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(result);
        //finding the unique elements in an array
        List<Integer> uniqueElements= Arrays.stream(array).boxed()
                .sorted()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(uniqueElements);
    }
}
