package Java_8_Interview_Questions;

public class ShortestDistance {
    public static void main(String[] args){
        String[] str = {"the","quick","brown","fox","quick"};
        String str1 = "the";
        String str2 = "foxzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz ";

        //find the distance between str1 and str 2

        int distance = Integer.MAX_VALUE;
        String temp = null;
        int index = 0;
        for(int i=0; i<str.length; ++i) {
            if (str1.equals(str[i]) || str2.equals(str[i])) {
                if (temp != null && !str[i].equals(temp)) {
                    distance = Math.min(distance, i - index);
                }
                temp = str[i];
                index = i;
            }
        }
        System.out.println(distance);
    }
}
