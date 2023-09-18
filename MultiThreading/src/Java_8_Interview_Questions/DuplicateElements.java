package Java_8_Interview_Questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElements {
    public static void main(String[] args){
        List<Integer> nums = Arrays.asList(2,4,1,5,6,3,6,2,4,6,3,6);
        Set<Integer> set = new HashSet<Integer>();
        nums.stream().filter(n->!set.add(n))
                .forEach(System.out::println);
    }
}
