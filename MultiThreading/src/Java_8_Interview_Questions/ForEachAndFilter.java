package Java_8_Interview_Questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ForEachAndFilter {
    public static void main(String[] args){
        //Traverseing through a list using forEach
        List<String> list = new ArrayList<>();
        list.add("Apurva");
        list.add("Poopurva");
        list.add("Amdocs");
        list.add("CGI");

        list.forEach(t-> System.out.println(t));

        //Filter
        List<String> unique= list.stream().filter(t->t.startsWith("A")).collect(Collectors.toList());
        System.out.println(unique);


        //Traversing through a Map using foreach
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Apurva");
        map.put(2,"Poopurva");
        map.put(3,"Jello");
        map.put(4,"Wallo");
        map.forEach((key,value)-> System.out.println("Key: "+ key + " value: " +value));
        map.entrySet().stream().forEach(obj -> System.out.println(obj));

        //Filter map
        map.entrySet().stream().filter(t->t.getKey()>2).forEach(System.out::println);

        //Foreach Working
        //It accepts the argument as a consumer functional interface

//        Consumer<String> consumer = (t-> System.out.println(t));
//        for(String s1:list){
//            consumer.accept("Apurva");
//        } //Internal Structure of a forEach Method







    }
}
