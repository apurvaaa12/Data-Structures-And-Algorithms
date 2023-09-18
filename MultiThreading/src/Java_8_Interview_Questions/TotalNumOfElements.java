package Java_8_Interview_Questions;

import java.util.Arrays;
import java.util.List;

public class TotalNumOfElements {
    public static void main(String[] args){
        List<Integer> nums = Arrays.asList(3,2,4,1,5,3);
       // int count = ((int) nums.stream().count());
        //Stream.count() is reduced to collections.size()
        int count = nums.size();
        System.out.println("Count of elements: " +count);
    }
}
