package Java_8_Interview_Questions;

import java.math.BigInteger;

public class StringMultiplication {
    public static void main(String[] args){
        String str1 = "3";
        String str2 ="4";

        logicMethod(str1, str2);

    }

    private static String logicMethod(String str1, String str2) {
        BigInteger a = new BigInteger(str1);
        BigInteger b = new BigInteger(str2);
        BigInteger multiply = a.multiply(b);
        String c = String.valueOf(multiply);
        return c;
    }
}
