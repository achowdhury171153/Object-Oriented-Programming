package Threads;

class Q{
    int num; boolean valueSet =false;
    public synchronized void put(int num){
        while(valueSet){
            try{
                wait();
            }catch(Exception e){}
        }
        System.out.println("Put: "+num);
        this.num=num;
        valueSet=true;
    }
    public synchronized void  get() {
        while(!valueSet){
            try{
                wait();
            }catch(Exception e){}
        }
        valueSet=false;
        notify();
     System.out.println("Get: "+num);
    }
}
class Producer implements Runnable {
    Q q;
   public Producer(Q q){
       this.q=q;
       Thread t= new Thread(this,"producer");
       t.start();
   }
    public void run(){
   int i=0;
   while(true){
       q.put(i++);
       try {
           Thread.sleep(500);
       }catch(InterruptedException e){}
   }
   }
}
class Consumer implements Runnable {
    Q q;
    public Consumer(Q q){
        this.q=q;
        Thread t= new Thread(this,"Consumer");
        t.start();
    }
    public void run(){
        int i=0;
        while(true){
            q.get();
            try {
                Thread.sleep(2000);
            }catch(InterruptedException e){}
        }
    }
}


public class InnerThread {
    public static void main(String[] args){
    Q q= new Q();
    new Producer(q);
    new Consumer(q);

    }
}
