package Java_8_Interview_Questions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LongestStringInAnArray {
    public static void main(String[] args){
        String[] strArray = {"Apurva","Sree","Is","A","JavaDeveloper","In","Pune"};

        String result = Arrays.stream(strArray)
                .reduce((word1,word2)->word1.length()>word2.length()?word1:word2)
                .get();
        System.out.println(result);
    }
}
