package Java_8_Interview_Questions;

import java.util.Arrays;
import java.util.List;

public class CubeOfNum {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(2,3,4,5);
        list.stream().map(i->i*i*i)
                .forEach(System.out::println);
    }
}
