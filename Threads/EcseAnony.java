package Threads;

public abstract class EcseAnony {

    abstract void eat();
    void eat1(){
        System.out.println("HelloWWWorld from abstract class!");
    }

}

class Test1{
 public static void main(String[] args){
     EcseAnony a= new EcseAnony(){
       void eat(){
           System.out.println("HelloWWWorld");
         }
     };
     a.eat();

 }

}

