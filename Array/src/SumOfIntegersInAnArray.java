import java.util.Arrays;

public class SumOfIntegersInAnArray {
    public static void main(String[] args){
        int[] arr= new int[] {10000001,100002,1000003,10000005,10000333};
        int sum=0;
        //using imperative approach
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);

        //using streams
        int result= Arrays.stream(arr).sum();
        System.out.println(result);
    }
}
