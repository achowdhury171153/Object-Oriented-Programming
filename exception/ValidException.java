package exception;
//User Define Exception!
public class ValidException extends Exception{
    public ValidException(){
        System.out.println("The age is valid");
    }
    public ValidException(String s){
        super(s);
    }
    public ValidException(int a){
      System.out.println("The age is : "+a +" its not valid");
    }
}
