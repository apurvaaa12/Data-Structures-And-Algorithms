//Java program to test if an array contains a specific value

public class ContainsValue {
    public static void main(String[] args){
        int[] arr=new int[]{20,3,4,5,6,7,-2};
        System.out.println(contains(arr,10));

    }

    public static boolean contains(int[] num, int item){
        for(int i : num){
            if(item==i){
                return true;
            }
        }
        return false;
    }



}
