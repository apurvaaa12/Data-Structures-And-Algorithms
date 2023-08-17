import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args){
        //Binary Search: It's a search algorithm that finds the position of a target value within the sorted array
        //Half of the array is eliminated during each step
        //we begin in the middle and check whether the target value is equal to the middle element if yes, we return it
        //If the target value is not equal to the middle element we check at left and right side of the middle value
        //If it's greater than the middle value we disregard the first half of the array as it's sorted vice versa
        //again we perform the same operation by picking the middle value from second half until we find the desired element.

        //Disadavantages: Not suitable for small data sets
        //Advantages: Suitable for large data sets
        //Runtime complexity: O(log n)

        int array[] =new int[100000000];
        int target =7077040;

        for(int i=0;i < array.length;i++){
            array[i]=i;
        }

        //arrays have an inbuilt method for binary search
       // int index= Arrays.binarySearch(array,target);
        int index= binarySearch(array,target);
        if(index == -1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at Index: "+index);
        }


    }

    private static int binarySearch(int[] array, int target) {

        int low=0;
        int high=array.length-1;

        while(low<=high){

            int middle =low+(high-low)/2;
            int value = array[middle];
            System.out.println("Middle Value is : " +value);

            if(value < target) low = middle+1;
            else if(value > target) high= middle -1;
            else return middle; //target found
        }
        return -1; //target not found
    }
}
