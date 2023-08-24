package Java_8_Interview_Questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecondHighestNumberInArray {
    public static void main(String[] args){
        int[] numbers ={5,6,7,3,2,1,8,4,33,44,52};
        List<Integer> listSorted = Arrays.stream(numbers).boxed()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(listSorted);

        //If you want it in the reverse order
        List<Integer> listSortedReverse = Arrays.stream(numbers).boxed()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(listSortedReverse);

        //We need the second-highest element so skip the first in the list
        List<Integer> listSortedReverseSkip =Arrays.stream(numbers).boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .collect(Collectors.toList());
        System.out.println(listSortedReverseSkip);

        //Find first element of the skipped array
        Integer listSortedSecondHighestElement = Arrays.stream(numbers).boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst().get();
        System.out.println(listSortedSecondHighestElement);

        //Second smallest
        Integer listSortedSecondSmallestElement = Arrays.stream(numbers).boxed()
                .sorted()
                .skip(1)
                .findFirst().get();
        System.out.println(listSortedSecondSmallestElement);

        //First Largest
        Integer firstLargestNumber = Arrays.stream(numbers).boxed()
                .sorted(Comparator.reverseOrder())
                .findFirst().get();
        System.out.println(firstLargestNumber);

        //first Smallest
        Integer firstSmallestNumber = Arrays.stream(numbers).boxed()
                .sorted()
                .findFirst().get();
        System.out.println(firstSmallestNumber);


        //Using Binary search
        int[] array={55,90,54,34,76};
        for(int i=0;i<array.length;i++){
            array[i]=i;
        }
        int index = binarySearch(array,2);
        if(index == -1) System.out.println("not found");
        else System.out.println("Found: " +index);

    }
    public static int binarySearch(int[] array, int target){
        int low=0;
        int high=array.length-1;

        while(low<=high){
            int middle =low+(high-low)/2;
            int value=array[middle];
            if(value<target) low=middle+1;
            else if(value>target) high=middle-1;
            else return middle;
        }
        return -1;
    }
}
