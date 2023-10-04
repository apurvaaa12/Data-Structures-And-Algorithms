package Java_8_Interview_Questions;

import java.util.Arrays;
import java.util.List;

public class ReverseWords {
    public static void main(String[] args){
        String s = "hello my name is apurva";
        List<String> result = Arrays.stream(s.split(" ")).toList();
        for(int i=result.size()-1;i>=0;i--){
            System.out.print(result.get(i)+" ");
        }
    }
}
