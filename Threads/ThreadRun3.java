package Threads;


class Q1{
    int num;
    boolean valueSet=false;

    public synchronized void put(int num){
     while(valueSet){
         try{
             wait();
         }catch(InterruptedException  e){
         }
         System.out.println("Put : "+num);
         this.num=num;
         valueSet=true;
     }
    }

    public synchronized void get(){
        while(!valueSet){
            try{
                wait();
            }catch(InterruptedException  e){
            }
            valueSet=false;
            notify();
            System.out.println("Get : "+num);
        }
    }
}
class Producer1 implements Runnable {
Q1 q;
public Producer1(Q1 q){
    this.q=q;
    Thread t = new Thread(this, "producer!");
    t.start();
}
public void run(){
  int i=0;
  while(true){
      q.put(i++);
      try{
          Thread.sleep(1000);
      }catch (Exception e){
      }
  }
}
}
class Consumer1 implements Runnable {
    Q1 q;
    public Consumer1(Q1 q){
        this.q=q;
        Thread t = new Thread(this, "producer!");
        t.start();
    }
    public void run(){
        int i=0;
        while(true){
            q.get();
            try{
                Thread.sleep(1000);
            }catch (Exception e){
            }
        }
    }
}



public class ThreadRun3 {
public static void main(String[] args){
    Q1 q= new Q1();
    new Producer1(q);
    new Consumer1(q);
}

}
