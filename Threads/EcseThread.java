package Threads;

public class EcseThread {

    void msg(){
        System.out.println("Hello world from Outer class");
    }
    static class Inner{
        static void msg(){
            System.out.println("Hello World");

        }

        public void msg1() {
        }
    }
    public static void main(String[] args){
        EcseThread obj1= new EcseThread();
        //EcseThread.Inner obj2= obj1.new Inner();
        EcseThread.Inner obj2= new EcseThread.Inner();
        //EcseThread.Inner.msg();
        obj2.msg();
        obj1.msg();
        EcseThread.Inner obj3= new EcseThread.Inner(){
            public void msg1(){
                System.out.println("hello world from anonymous class!");
            }
        };
        obj3.msg1();

    }
}
