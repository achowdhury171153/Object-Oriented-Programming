package exception;

public class SuperHeroException extends Exception {
    public SuperHeroException(){

    }
    public SuperHeroException(String name){
        System.out.println(name);
    }
    public SuperHeroException(int energy){
        System.out.println("Low energy level because it's :  "+energy);
    }


}
