package Threads;

public class Local {

    void msg(){
        System.out.println("I am calling from Outer Class !");
    }
    static class Inner{
        void msg(){
            System.out.println("I am calling from Inner Class !");
        }
    }
    class Inner2{
        void msg(){
            System.out.println("I am calling from Inner2 Class !");
        }
    }

    void display(){
        class InnerDisplay{ //LocalInner Class
            void msg(){
                System.out.println("I am calling from InnerDisplay Class!");
            }
            void sendmsgFromPhone(){

            }
        }
        InnerDisplay obj = new InnerDisplay();
        obj.msg();
        obj.sendmsgFromPhone();
    }

    public static void main(String[] args){
        Local obj1= new Local();
        obj1.display();

        Local.Inner obj3= new Local.Inner(); //if you take Static inner class~!

        Local obj4= new Local();
        Local.Inner2 obj5 = obj4.new Inner2(); //If you don't take any static inner class

        obj5.msg();

        Local obj2= new Local(){
            void msg(){
            System.out.println("I am calling from Anonymous Class!!!!");
            }
        };
        obj2.msg();
        Local obj10= new Local();
        obj10.msg();
    }
}
