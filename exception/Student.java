package exception;

import java.io.IOException;

public class Student {
    static void validAge(int age) throws ValidException {
        if (age > 18) {
           throw new ValidException("Helloworld");
        }
        else{
         System.out.println("Hi");
        }
    }

    public static void main(String []args) {
        try {
            validAge(19);

        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(ValidException e){
            System.out.println(e);
        }

    }
}
