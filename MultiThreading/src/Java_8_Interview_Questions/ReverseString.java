package Java_8_Interview_Questions;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseString {
    public static void main(String[] args){
        String str ="Apurva";
        //Approach 1
        StringBuilder sb= new StringBuilder();
        sb.append(str);
        sb.reverse();
        System.out.println(sb);
        //Approach 2
        char[] chars= str.toCharArray();
        for(int i=chars.length-1;i>=0;i--){
            System.out.println(chars[i]);
        }
        //Approach 3 using java 8
       String result = Stream.of(str)
               .map(word->new StringBuilder(word).reverse())
               .collect(Collectors.joining());
        System.out.println(result);
    }




}
