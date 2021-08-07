package Threads;

public class Esynchro {
     synchronized  void print(int n){
        for(int i=1; i<=10; i++){
            System.out.println(n*i);
            try{
                Thread.sleep(100);
            }catch(InterruptedException  e){}
        }
    }
}


class Thread01 extends Thread{
    Esynchro t;
    Thread01(Esynchro t){
        this.t= t;
    }
    public void run(){
       t.print(7);
    }
}


class Thread02 extends Thread{
    Esynchro t;
    Thread02(Esynchro t){
        this.t= t;
    }
    public void run(){
        t.print(6);
    }

}

class Test01{

    public static void main(String[] args){
        Esynchro obj =new Esynchro();
        Thread01 t1= new Thread01(obj);
        Thread02 t2= new Thread02(obj);
        Thread01 t3= new Thread01(obj);
        t1.start();
        try{
            t1.join(); //t2 will start when t1 is dead

        }catch(InterruptedException e){

        }
        t2.start();
        t3.start();

    }
}