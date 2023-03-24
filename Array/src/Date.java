import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Date {

    public static void main(String[] args){
//        String input="jelloissocute";
//        Map<String,Long> map= Arrays.stream(input.split(""))
//                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//        System.out.println(map);

        String str = "apurva";
        String str0 = "apurva";
        String str2= new String("apurva");
        String str3= new String("apurva");
        if(str.equals(str0)){
            System.out.println("Matched");
        }else{
            System.out.println("Mismatched");
        }

        String Occur = "Apurva is awesome";
        int count=0;
        for(int i=0;i<Occur.length();i++){
            if(Occur.charAt(i) != ' '){
                count++;
            }
        }
        System.out.println("Number is characters in OCcur is " +count);

        
    }

}
