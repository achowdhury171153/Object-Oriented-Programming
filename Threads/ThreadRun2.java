package Threads;

public class ThreadRun2 {
    public static void main(String[] args){
            //Thread Lambda Expression
        Thread t1= new Thread(() ->
        {
            for(int i=1; i<=5; i++){
                System.out.println("Northern ");
                try{
                    Thread.sleep(1000);
                }catch(Exception e){}
            }
        }
        );
        Thread t2= new Thread(() ->
        {
            for(int i=1; i<=5; i++){
                System.out.println("University Bangladesh ");
                try{
                    Thread.sleep(1000);
                }catch(Exception e){}
            }
        }
        );
        t1.start();
        try{
            Thread.sleep(10);}catch(Exception e){}
        try {
            t1.join();   //when t1 thread will die, then t2 thread will start!
        }catch(Exception e){}
        t2.start();
    }
}
