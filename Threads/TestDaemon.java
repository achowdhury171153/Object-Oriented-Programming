package Threads;

public class TestDaemon extends Thread {
    /*
    public void run(){
        if(Thread.currentThread().isDaemon()){  //DAEMON thread supports background supporting task!
            System.out.println("hey the daemon thread is working!");
        }
        else{
            System.out.println("Our thread is working!");
        }
    }
    */
    public void run(){
        System.out.println("The thread is running and it's name is: "+Thread.currentThread().getName());
        System.out.println("The thread is running and it's priority is: "+Thread.currentThread().getPriority());
    }

    public static void main(String[] args){
        TestDaemon t1= new TestDaemon();
        TestDaemon t2= new TestDaemon();
        TestDaemon t3= new TestDaemon();

        //t1.setDaemon(true);
        t1.setName("i am t1 thread");
        t2.setName("i am t2 thread");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        //t3.start();
    }
}
