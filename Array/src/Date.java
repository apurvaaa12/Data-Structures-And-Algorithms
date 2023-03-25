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
