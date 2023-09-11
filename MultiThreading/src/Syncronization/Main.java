package Syncronization;

public class Main {
    public static void main(String[] args){
        Counter c = new Counter();
//        c.increment();
//        System.out.println("Count " + c.count);
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<=100;i++){
                    c.increment();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<=100;i++){
                    c.increment();
                }
            }
        });

        t1.start();
        t2.start();
        System.out.println(t1.isAlive());
        System.out.println("count: " +c.count);

    }
}
