public class Recursion {
    //Recursion : A recursive method is a one that calls itself
    //Iteration: it's a repetition of an internal process --For loop
    //we divide a problem into a sub-problem of same type as the original
    //Pro: easier to write and read and debug for small methods
    //con: consumes a lot of memory and slower for large datasets
    //Programs have a data structure called: call-stack.
    //Call-stack keeps a track of order of how your program needs to function
    //So every time we add a recursive method it gets added to the call stack and it works on LIFO.
    //for example: Main() and walk gets called 5 times

    public static void main(String[] args){
        walk(5);
        factorial(5);
        System.out.println("The factorial of 7 is: "+ factorial(5));
        power(2,3);
        System.out.println("The Power of a Number: " + power(2,3));
    }

    private static void walk(int steps) {
        //Using recursion
        //Base case
        if(steps<1) return;
        System.out.println("You take a step");
        //Recursive case logic part
        walk(steps-1);

        //using iteration
//        for(int i=0; i<steps; i++){
//            System.out.println("You took a step");
//        }
    }


    //Factorial Number example:
    private static int factorial(int num) {
        //Base Case
        if(num < 1) return 1;

        //recursive case
        return num * factorial(num-1);

    }

    private static int power(int num, int expo) {
        if(expo <1) return 1;

        return num * power(num,expo-1);
    }

}
