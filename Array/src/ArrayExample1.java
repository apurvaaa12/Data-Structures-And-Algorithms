import java.util.Arrays;

public class ArrayExample1 {
    public static void main(String[] args){
        int[] numbers = new int[3];

        //to the set the value of numbers inside an array we set based on the index.
        numbers[0] =10;
        numbers[1] =20;
        numbers[2] =30;

        //to avoid the above method if you already know the elements inside the array simply initialize using the below method

        int[] number ={10,20,30};
        //to change an array element
        number[0]=20;

        //when you run this snippet you'll get something like [I@65ab7765 || to actually read the Input array
        //covert it to .toString using array class
        //System.out.println(numbers);

        //will print the numbers inside of an array
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(number));

        //to print the size of the array
        System.out.println(numbers.length);

    }
}
