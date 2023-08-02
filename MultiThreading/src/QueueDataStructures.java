import java.util.LinkedList;
import java.util.Queue;

public class QueueDataStructures {
    public static void main(String[] args){

        //FIFO - First In First out
        //A collection designed for holding elements prior to processing
        //Linear data structure
        //Enqueue is to add the elements to the end of the queue(Tail)
        //Dequeue is to remove the elements from the beginning of the queue(Head)
        //add = offer(e) , enqueue
        //remove = poll(), dequeue
        //element = peek()
        //We can't instantiate the type queue to new queue because queue is an Interface and not a class
        //we can not create an instance of an interface; interfaces are like templates and are usually applied to other classes
        //Queue<String> queue = new Queue<String>();

        //Queue supports LinkedList and PriorityQueue
        Queue<String> queue = new LinkedList<>();

        //to add the elements to the queue we use the offer method and the obj is passed inside the offer
        queue.offer("Apurva");
        queue.offer("Jello");
        queue.offer("reena");
        queue.offer("Ammara");
        System.out.println("People in queue are: "+ queue);

        //To learn about the Head of the queue we use the peek method
        System.out.println("Looking at the head: " +queue.peek());

        //to remove the objects from the queue we use poll method and the person on head position gets removed
        System.out.println("De-queuing first member of the queue: " + queue.poll());
        System.out.println("De-queuing second member of the queue: " + queue.poll());
        System.out.println("De-queuing third member of the queue: " + queue.poll());
        System.out.println("De-queuing fourth member of the queue: " + queue.poll());

        //poll method doesn't throw exception even after all the elements in a queue are removed
        System.out.println("De-queuing fifth member of the queue: " + queue.poll());
        System.out.println("De-queuing sixth member of the queue: " + queue.poll());

        //queue inherited from collection class isEmpty(),Size(),Contains() methods
        System.out.println(queue.isEmpty()); //Boolean Value
        System.out.println(queue.size()); //Size of the queue
        System.out.println(queue.contains("Apurva")); //Checks Whether the queue contains the element or no

        System.out.println(queue);


        //Uses of a queue
        //1. Keyboard buffer (Letter should appear in the order that they are pressed on the screen)
        //2. Printer Queues (Print jobs should be completed in order)
        //3. Used in LinkedList, PriorityQueue, Breadth-First Search


    }
}
