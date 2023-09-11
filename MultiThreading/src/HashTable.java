import java.sql.SQLOutput;
import java.util.Hashtable;

public class HashTable {
    //Entry<K,V> Every value will use a Key and value as an entry set
    //First we must find the hash value to put the entry in the has table
    //To calculate the hash what we can do is put the key value inside key.hashCode() % capacity of hashTable to obtain the index at which we can put the key. Reminder is the index
    //In the case of key being a string we use the ASCII value of the string.Occurrence of a collision
    //Common solution for a collision is use the bucket as a linked List.
    //We'll look for an entry and then search linearly if there are more than one value in a bucket
    //Initial capacity: 11 elements

    //HashTable: It's a data Structure that stores unique keys to values; Entry<Integer,String>
    //           Each K,V pair is known as an Entry
    //           Fast Iteration, Look up ,deletion of values
    //           Not Ideal for small data sets, Great for large data sets

    //Hashing = Takes the key as input and computes an integer. Usually the integer is the index in which it's located
              // We use Key.hashCode() % 10 to calculate the index number
              //It depends on the Data type for example <String,String> we use ASCII value
    //Bucket: Stores the entry. If more than one entry exists bucket turns into Linked-list and we search linearly
    //Collision: hash Index generates the exact same index for more than one key
                //Less collision = more efficiency

    public static void main(String[] args){
        Hashtable<Integer,String> table = new Hashtable<>(10);
        table.put(100,"Apurva");
        table.put(200,"Jello");
        table.put(300,"Java");
        table.put(400,"Spring Boot");

        System.out.println("Value before replace:"+table.get(200));
        table.replace(200,"Wallo");
        System.out.println("Value after replace: " + table.get(200));

        for(Integer key : table.keySet())
        System.out.println("Index at which the element is placed in the bucket: " + key.hashCode() % 10);
    }

}
