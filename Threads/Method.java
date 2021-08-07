package Threads;

public class Method {
    synchronized void  print(int val){

        for(int i=1; i<=5 ; i++){
            System.out.println("Multiplication is : "+i*val);
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){

            }

        }
    }
}
class Method2 extends Thread{
    Method m;   //int n;
    Method2(Method m){   //Method2(int n){ this.n=n }
        this.m=m;
    }
    public void run(){
        m.print(10);
    }

}
class Method3 extends Thread{
    Method m;
    Method3(Method m){
        this.m=m;
    }
    public void run(){
        m.print(100);
    }
}

class Test{
    public static void main(String []args){
     Method object = new Method();
     Method2 object2 = new Method2(object);
     Method3 object3 = new Method3(object);
     object2.start();
     object3.start();
    }
}
