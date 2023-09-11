package Java_8_Interview_Questions;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.SortedMap;
import java.util.stream.Collectors;

public class CommonElementsInArray {
    public static void main(String[] args){
        int[] arr ={1,4,2,3,5};
        int[] arr2={2,3,6,9};
        List<Integer> result = Arrays.stream(arr)
                .filter(number->Arrays.stream(arr2).anyMatch(arr2Number->arr2Number==number))
                .boxed()
                .collect(Collectors.toList());
        System.out.println(result);

        String str="arRzFfiA";
        String[] splitString= str.split("");
        Arrays.sort(splitString);
        System.out.println(Arrays.toString(splitString));


        boolean[] uppercase = new boolean[26];
        boolean[] lowercase = new boolean[26];
        char[] array = str.toCharArray();




    }
}
