package exception;

public class Exception1 {




    public static void main(String[] args){
        try{
        int x=100;
        int y=0;
        //int r=x/y;
        int []arr= new int[5];
        arr[10]=100;
    }
        catch(ArithmeticException e1){
            System.err.println("You are getting an exception : "+e1);
        }
        catch(NullPointerException e2){
            System.err.println("Your array overloaded : "+e2);
        }
        catch(Exception e3){
            System.err.println("Last Catch : "+e3);
        }
        System.err.println("I am printing?");
        System.err.println("I am printing2?");
        System.err.println("I am printing3?");
        System.err.println("I am printing4?");

}}
