package Java_8_Interview_Questions;

public class StringPermutation {
    public static void main(String[] args){
        String s = "abc";
        printPermutation(s," ");
        System.out.println();
    }

    private static void printPermutation(String s, String s1) {
        if(s.length() == 0) return;

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            String str3 = s.substring(0,i)+s.substring(i+1);
            printPermutation(str3,s1+ch);
        }
    }

}
