package Threads;

class Hello implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello BD");
            try {
                Thread.sleep(1000);

            } catch (InterruptedException e) {
            }
        }
    }
}
class Hi implements Runnable{
    public void run() {
        for (int i =1; i<=5;i++){
            System.out.println("Hi BD");
            try{
                Thread.sleep(1000);

            }catch(InterruptedException e){}


    }
}
}

public class InterFace {
    public static void main(String[] args){

    Runnable obj1= new Hello();
    Runnable obj2= new Hi();
    Thread t1= new Thread(obj1);
    Thread t2= new Thread(obj2);
    t1.start();
    try{
        Thread.sleep(10);
    }catch(InterruptedException e){}
    t2.start();

    }
}
