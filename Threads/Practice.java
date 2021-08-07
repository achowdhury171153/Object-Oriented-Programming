package Threads;

public class Practice extends Thread {
    public void run() {
        for(int i = 0;i<5; i++){
            try {
                Thread.sleep(2000);
            }catch(Exception e){

            }
            System.out.println("Thread 1: " +i);
        }
    }

}
class Practice2 extends Thread {
    public void run() {
        for(int i = 0;i<5; i++){
            try {
                Thread.sleep(2000);
            }catch(Exception e){

            }
            System.out.println("Thread 2: " +i);
        }
    }
    public static void main(String[] args){
        Practice t1= new Practice();
        Practice2 t2= new Practice2();

        t1.start();
        try {
            t1.join();
        }catch(Exception e){

        }
        t2.start();
    }
}

