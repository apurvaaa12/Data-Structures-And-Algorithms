import java.util.Arrays;

public class Test {


    public static void main(String[] args){

        int[] array = {10,8,9,3,5,4,2};

        //2,3,4,5,8,9,10
        System.out.println(Arrays.toString(array));
        boolean result = test(array);
        System.out.println(result);
    }

    private static boolean test(int[] array) {
        Arrays.sort(array);
        for(int i=0;i<array.length-1;i++){
            if(array[i]+1 != array[i+1]){
                return false;
            }
        }
        return true;
    }

}
