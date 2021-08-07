package Threads;
//name:
//ID:


public class Exam extends Thread  {
    int n;
    Exam(int n){
        this.n=n;
    }

    void multi(int n){
        for(int i=1; i<=10;i++){
            System.out.println(i*n);
        }
        try{
            Thread.sleep(400);
        }catch(InterruptedException e){

        }
    }
    public void run(){
    multi(n);
    }

}
class Exam2 extends Thread{
    int n;
    Exam2(int n){
        this.n=n;
    }
    void multi(int n){
        for(int i=1; i<=10;i++){
            System.out.println("Northern University Bangladesh");
        }
        try{
            Thread.sleep(400);
        }catch(InterruptedException e){

        }
    }
    public void run(){
        multi(n);
    }

}
class Main{
    public static void main(String[]args){
    Exam t1= new Exam(10);
    Exam2 t2= new Exam2(10);
    t1.start();
    try {
        t1.join(); //if t1 dies then t2 start!
    }catch(InterruptedException e){
    }
    t2.start();
    }
}
