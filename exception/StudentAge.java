package exception;

import java.io.IOException;

public class StudentAge {

    static void validAge(int age) throws ArithmeticException{

       // int z=10/0;
        if(age<18){
            throw new ArithmeticException("Not valid age!");
            //System.out.println("not more than 18");
        }
    }

    static void uploadingFile() throws IOException {

    }

    static void arrayMerging() throws ArrayIndexOutOfBoundsException{

    }

    public static void main(String []args){
        try {
            StudentAge.validAge(13);
            StudentAge.uploadingFile();
            StudentAge.arrayMerging();

        }
        catch(ArithmeticException e1){
            System.out.println("Handled");
        }
        catch(IOException e2){
//....


        }
        catch(ArrayIndexOutOfBoundsException e3){
            //....

        }
        System.out.println("hellWWWWW");
    }
}
