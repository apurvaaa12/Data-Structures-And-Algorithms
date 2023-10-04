package Java_8_Interview_Questions;

import java.util.Arrays;
import java.util.List;

public class VowelsConsonents {
    public static void main(String[] args){
        String name ="helloword";
        int vowels = 0;
        int consonants = 0;
        for(int i=0;i<name.length();i++){
            char ch = name.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
            ch == 'A' || ch == 'E' ||ch == 'O' || ch == 'U') vowels++;
            else if((ch >= 'a' && ch <= 'z') ||
                    (ch >= 'A' && ch <= 'Z')) consonants++;
            else{

            }
        }
        System.out.println(vowels);
        System.out.println(consonants);
    }
}
