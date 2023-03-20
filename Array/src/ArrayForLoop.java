import java.util.Arrays;

public class ArrayForLoop {
    public static void main(String[] args){
        String[] names={"apurva","prasanth","jello","wallo"};
        System.out.println(names.length);

        for(int i=0; i<names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
