import java.util.Arrays;
import java.util.Locale;

public class SubString {
    public static void main(String[] args){
        String str="Apurva";
        String str2="Hello! Apurva How are you";
        System.out.println("Sub String of str is "+ str.substring(0,6));
        String[] split= str2.split("\\!");
        System.out.println("String after splitting "+ Arrays.toString(split));
        String result= String.valueOf(str.charAt(0));
        result.toLowerCase();
        System.out.println(result);
    }
}
