package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Handle1 {
    public static void main(String []args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the value: ");
        int num;
        //num=input.nextInt();
        int []marks = new int[5];
        marks[0]=100;
        marks[1]=50;
        marks[2]=70;
        marks[3]=70;
        marks[4]=70;

        boolean flag =true;
        while(flag){
            System.out.println("I want the number of the student, Enter the value");
            int want=input.nextInt();
            try{
                System.out.println("Inside of Try Catch block");
                try{
                    try{
                        System.out.println("Student Roll: " +want+ " & Marks obtained: "+ marks[want]);
                        flag=false;
                        System.out.println("Thank you for joining");
                    }catch(InputMismatchException e2){
                        System.out.println("The nested exception is about: "+e2);
                    }
                }catch(InputMismatchException e1){
                    System.out.println("The second nested exception is about: "+e1);
                }
            }catch(ArrayIndexOutOfBoundsException ex){
                System.out.println("The outside exception is about: "+ex);
            }
        }
    }
}
