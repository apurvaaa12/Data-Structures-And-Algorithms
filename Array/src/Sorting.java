//Java program to sort a numeric array and a string array

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args){

      int[] number = {3,2,5,6,7,9};
      String[] names ={"wallo","jello","ammara","bunny"};

            System.out.println("The array is: "+Arrays.toString(number));
            Arrays.sort(number);
            System.out.println("sorted array is: " +Arrays.toString(number));

            System.out.println(Arrays.toString(names));
            Arrays.sort(names);
            System.out.println("sorted array is: " +Arrays.toString(names));

    }
}
