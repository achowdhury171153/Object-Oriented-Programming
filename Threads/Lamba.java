package Threads;

public class Lamba {
    public static void main(String[] args){
        Thread t1= new Thread(() ->
        {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Hello BD");
                try {
                    Thread.sleep(1000);

                } catch (InterruptedException e) {
                }
            }
        });
        Thread t2= new Thread(() ->
        {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Hi BD");
                try {
                    Thread.sleep(1000);

                } catch (InterruptedException e) {
                }
            }
        });
        t1.start();
        try {
            Thread.sleep(10);}catch(InterruptedException e){}
        t2.start();
    }
}
