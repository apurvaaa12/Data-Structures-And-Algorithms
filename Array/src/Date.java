import java.sql.SQLOutput;
import java.util.stream.Stream;

public class Date {

    public static void main(String[] args){
//        String input="jelloissocute";
//        Map<String,Long> map= Arrays.stream(input.split(""))
//                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//        System.out.println(map);

        Stream<String> stream= Stream.of("Jello,making me a monster");
        stream.forEach(System.out::println);

        Stream<String> stream2= Stream.of("Jello,gets me food");
        stream2.forEach(System.out::println);

        Stream<String> stream1= Stream.of("Jello,making me a monster");
        stream1.forEach(System.out::println);

        Stream<String> stream0= Stream.of("My papa is the best");
        stream0.forEach(System.out::println);

        String str = "apurva";
        String str0 = "apurva";
        String str2= new String("apurva");
        String str3= new String("apurva");
        StringBuilder s=new StringBuilder("apurva");
        StringBuilder s1=new StringBuilder("apurva");
        StringBuffer s2=new StringBuffer("apurva");
        StringBuffer s3=new StringBuffer("apurva");
        if(str2==str3){
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
