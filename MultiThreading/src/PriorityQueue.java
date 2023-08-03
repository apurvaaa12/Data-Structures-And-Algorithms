
import java.util.Queue;

public class PriorityQueue {
    public static void main(String[] args){

        //Sorting the elements based on certain priority
        //FIFO Data Structure
        //Serves elements with the highest priority first

//      Queue<String> queue = new java.util.PriorityQueue<>(Collections.reverseOrder());
        Queue<String> queue = new java.util.PriorityQueue<>();

        queue.offer("A");
        queue.offer("Z");
        queue.offer("P");
        queue.offer("J");
        System.out.println(queue);


    }
}
