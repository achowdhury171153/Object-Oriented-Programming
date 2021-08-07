package Threads;

class Northern implements Runnable{
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println("Northern ");
            try{
                Thread.sleep(1000);
            }catch(Exception e){}
        }
    }
}
class University implements Runnable{   //extends Thread
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println("University Bangladesh");
            try{
                Thread.sleep(1000);
            }catch(Exception e){}
        }
    }
}


public class ThreadRun  {
    public static void main(String []args){
        Runnable obj1= new  Northern();
        Runnable obj2 = new University();
        Thread t1= new Thread(obj1);
        Thread t2= new Thread(obj2);


        t1.start();
        try{
            Thread.sleep(10);}catch(Exception e){}
        t2.start();
    }
}
