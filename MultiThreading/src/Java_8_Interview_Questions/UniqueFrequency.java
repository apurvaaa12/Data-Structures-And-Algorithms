package Java_8_Interview_Questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UniqueFrequency {
    public static void main(String[] args){
        int[] array = {2,3,4,5,1,3,3,3,5,4,2,3,3,2,3};
        //Count Frequency
        Map<Integer,Long> frequency = Arrays.stream(array)
                .boxed()
                .collect(Collectors.groupingBy(e->e,Collectors.counting()));

        System.out.println(frequency);

        //extract Frequency
        Set<Long> frequencies = new HashSet<>(frequency.values());
        System.out.println(frequencies);

        // Check if the size of the set of frequencies is equal to the number of unique elements
        boolean isUniqueFrequency = frequencies.size() == frequency.size();
        System.out.println(isUniqueFrequency);
//        if(isUniqueFrequency) return yes;
//        else return no;


        //STRING
        String s = "Apurva";
        Map<String,Long> sCount = Arrays.stream(s.split(""))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(sCount);

        Set<Long> sSet = new HashSet<>(sCount.values());
        System.out.println(sSet);

        boolean isUnique = sSet.size() == sCount.size();
        System.out.println(isUnique);

    }
}
