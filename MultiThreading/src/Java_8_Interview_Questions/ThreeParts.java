package Java_8_Interview_Questions;

import java.util.Arrays;

public class ThreeParts {
    public static void main(String[] args){
        //given an array with N integers find if the array can be divided into 3 parts with equal sum
        int[] array = {1,2,3,4,5,3,5};
        boolean ans = threeParts(array);
        System.out.println(ans);

    }

    private static boolean threeParts(int[] array) {
        int totalSum = Arrays.stream(array).sum();
        System.out.println(totalSum);

        if(totalSum % 3 != 0 ) return false;

        int targetSum = totalSum/3;
        int count =0;
        int currentSum = 0;

        for(int num : array){
            currentSum = currentSum+num;
            if(currentSum == targetSum) {
                count++;
                currentSum=0;
            }
            if(count==3){
                return true;
            }
        }
        return false;
    }
}
