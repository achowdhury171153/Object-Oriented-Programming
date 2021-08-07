package Threads;

public class Ethread2  implements Runnable {

    synchronized void print(int n){
        for (int i = 1; i <= n; i++) {
            try {
                Thread.sleep(2000); //means 2 seconds or 2000 milliseconds
            } catch (InterruptedException e) {
            }
            //System.out.println("I am a new Thread!");
            // System.out.println("Running thread information: "+Thread.currentThread().getName());
            //System.out.println("Running thread information: "+Thread.currentThread().getPriority());
            System.out.println("Printing a number: " + i);
        }

    }
    public void run() {
            print(5);
    }

    public static void main(String[] args){
        Ethread2 m1= new Ethread2();
        Ethread2 m2= new Ethread2();
        Thread t1 = new Thread(m1);
        Thread t2 = new Thread(m2);

        t1.start();
        t2.start();


    }
}
