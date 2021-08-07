package Threads;

public class First extends Thread implements Runnable{
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("NUB");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
        First obj1 = new First();
        Second obj2 = new Second();
        obj1.start();
        obj1.join();
        try{
            Thread.sleep(1000);}catch(Exception e){}
        obj2.start();

        obj2.join();


    }
}
class Second extends Thread implements Runnable{
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("University");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
        }
    }
}

