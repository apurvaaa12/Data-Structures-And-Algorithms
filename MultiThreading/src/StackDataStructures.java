import java.util.Stack;

public class StackDataStructures {
    public static void main(String[] args){

        //LIFO-LAst In First Out
        //Stores the data in the form of a vertical tower
        //Push(Object) to add to the Top
        //Pop() to remove from the top
        //Peek() to find the first or the top most element of the stack
        //Search(Object) to search the object inside the stack. return=(Object==present)?position that the object is at:-1.

        Stack<String> stack = new Stack<>();
        stack.push("Mumbai");
        stack.push("Delhi");
        stack.push("Pune");
        stack.push("Hyderabad");

        System.out.println("Is the stack empty? " + stack.empty());

        String removedElement = stack.pop();
        System.out.println("The first element removed From the stack: " + removedElement);

        String removedElement2 = stack.pop();
        System.out.println("The second element removed from the stack: "+ removedElement2);

        System.out.println("Top most element of the stack is : "+ stack.peek());

        //Will return the position that the object is at
        System.out.println("Searching inside of the stack  : "+ stack.search("Mumbai"));

        //Will return -1 if the object is not present inside the stack
        System.out.println("Searching inside of the stack  : "+ stack.search("Bangalore"));

        System.out.println(stack);


        //Uses Of a Stack
        //Undo and Redo operations in text editors
        //moving back/forward through browser history
        //backtracking algorithms
        //calling tha functions
    }
}
