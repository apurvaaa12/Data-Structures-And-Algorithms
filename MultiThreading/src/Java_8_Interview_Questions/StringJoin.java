package Java_8_Interview_Questions;

import java.util.Arrays;
import java.util.List;

public class StringJoin {
    public static void main(String[] args){
        List<String> numbers= Arrays.asList("1","2","3","4");
        String result= String.join("/" ,numbers);
        System.out.println(result);
    }


}
