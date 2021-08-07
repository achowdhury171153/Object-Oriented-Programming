package Threads;

public class Ethread1 extends Thread  {
    public void run() {

        if(Thread.currentThread().isDaemon()){
            System.out.println("Daemon thread working for background processes");
        }
        else {
            for (int i = 1; i <= 5; i++) {
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
    }
    public static void main(String[] args){
        Ethread1 obj1= new Ethread1();
        Ethread1 obj2= new Ethread1();

        obj1.setPriority(Thread.MIN_PRIORITY);
        obj2.setPriority(Thread.MAX_PRIORITY);


        obj1.setDaemon(true);
        obj1.start();

        obj2.start();
    }

}
