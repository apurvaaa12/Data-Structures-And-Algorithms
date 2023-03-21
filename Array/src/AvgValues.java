//calculate the average value of array elements

public class AvgValues {
    public static void main(String[] args){
        int[] arr={20, 30, 25, 35, -16, 60, -100};
        int sum=0;
        for(int i=0; i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println("the sum is: " +sum);
        int avg = sum/arr.length;
        System.out.println("the average of two numbers is : " +avg);

    }
}
