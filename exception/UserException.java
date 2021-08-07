package exception;


public class UserException extends Exception{
    public UserException(String s){
        super(s);
    }
    public UserException(int testmarks){
        super("You need to resubmit again because your test mark is less than 50%");
    }
    public UserException(int testmarks,int finalmarks){
        super("You are failed getting :"+ testmarks+ " and "+finalmarks);
    }
}