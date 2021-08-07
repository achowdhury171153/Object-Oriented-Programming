package exception;

import java.util.Scanner;

public class Handle5 {
    static void age(int age) throws ArithmeticException {
        if(age>18){
            System.err.println("Not eligible for this game!");
          //  int r=age/0;

        }
        else{
           throw new ArithmeticException("Throwing!");
        }
    }
    static void customMethod(int age) throws UserException {
        if(age>18){
            System.err.println("Not eligible for this game!");
            //  int r=age/0;

        }
        else{
            throw new UserException("Throwing from custom Class!");
        }


    }
    static void customMethod1(int age1,int age2) throws UserException {
        if(age1+age2>81){
            System.err.println("Passed");


        }
        else{
            throw new UserException(age1,age2);
        }


    }
        public static void main(String []args) {
            try{
                //age(10);
                Scanner inp = new Scanner(System.in);
                int a=inp.nextInt();
                int b=inp.nextInt();
                customMethod1(a,b);
            }
            catch(ArithmeticException e){
                System.err.println("Age exception: "+e);
            }
            catch(UserException e){
                System.err.println(e);
                //e.printStackTrace();
            }
            finally{
                System.err.println("Thank You for using our software!");
            }
        }

    }


