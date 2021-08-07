package Threads;
public class Inner {
    void show() {
        System.out.println("Hi");
        class A{
            void show2() {
                System.out.println("Hi from A class");
            }
        }
        A obj3= new A();
        obj3.show2();
    }
}
class Outer{
    public static void main(String args[]){

        Inner obj = new Inner(){
            void show(){
                System.out.println("Hello !!");
            }
        };
        obj.show();
        Inner obj2 = new Inner();
        obj2.show();
    }
    }
