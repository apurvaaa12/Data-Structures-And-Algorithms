import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        MultiThreading multiThreading2 = new MultiThreading();
        MultiThreading multiThreading = new MultiThreading();

//        multiThreading.run();
//        multiThreading2.run();
        multiThreading.isAlive();

        List<String> listName= new ArrayList<>();
        //adding
        listName.add("Apurva");
        listName.add("wallo");
        listName.add("jello");
        System.out.println(listName);
        //retrieving
        String two = listName.get(2);
        System.out.println(two);
        //updating
        listName.set(1,"poopurva");
        System.out.println(listName);
        //sorting
        Collections.sort(listName);
        System.out.println(listName);

    }
}