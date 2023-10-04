package Java_8_Interview_Questions;

import java.util.Set;
import java.util.stream.Collectors;

public class Panagrams {
    public static void main(String[] args) {
        String str = "the quick brown fox jumps over the lazy dog";
        str = str.toLowerCase();

        Set<Character> uniqueChars = str.chars().filter(Character::isAlphabetic)
                .mapToObj(c->(char)c)
                .collect(Collectors.toSet());
        System.out.println(uniqueChars);

        if(uniqueChars.size()==26) System.out.println("is Panagram");
        else System.out.println("Not a a panagram");


    }
}
