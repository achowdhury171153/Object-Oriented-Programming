package exception;

public class Handle {

    static void divide(int a,int b) throws ArithmeticException{
        int result =  a/b;
        System.out.println("the divide result is : " + result);
    }
    static void validate(int age) {
        if (age < 18) {
            throw new ArithmeticException("not valid");
            //throw new ArrayIndexOutOfBoundsException("not valid Age for array");
        } else {
            System.out.println("welcome to vote");
        }
    }

    public static void main(String []args) {
       /*
        int x = 100;
        int y = 0;
        int r = x / y;
        System.out.println("result :" + r);
        System.out.println("Last line of the code ");

        */
        try {
            int x = 100;
            int y = 0;
            int r = x / y;
            System.out.println("result :" + r);
            System.out.println("Last line of the code ");
        }
        catch(ArithmeticException e){
            System.out.println("Exception: " +e);
        }
        catch(ArrayIndexOutOfBoundsException e2){
            System.out.println("Exception: " +e2);
        }
        catch(Exception e3){ //superclass should be initialized last cause the upper catch methods
            //are the subclass of Exception class
            System.out.println("Exception: " +e3);
        }
        finally { //when try catch not gonna handle but you still want to run the code!
            System.out.println("Try catch finished ");
        }
        //throw explained

        //throws!! explained
        try {
            divide(15,0);
        }
        catch(Exception  e1){
            System.out.println("New Exception occurs for divide method: " +e1);
        }
        validate(19);

    }
}