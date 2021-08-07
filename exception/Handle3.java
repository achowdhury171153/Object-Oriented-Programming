package exception;

import java.util.Scanner;

public class Handle3 {

        public static void main(String []args) {
            Scanner input = new Scanner(System.in);
            boolean flag=true;
            while(flag) {
                try {
                    int x, y;
                    System.out.println("Enter first value: ");
                    x = input.nextInt();
                    System.out.println("Enter Second value: ");
                    y = input.nextInt();
                    int r = x / y;
                    System.out.println("result :" + r);
                    flag=false;
                    try{
                        int []city =new int[3];
                        city[4]=100;
                    }catch(NullPointerException e){
                        System.out.println("Fail index target! (nested catch)because exception is: "+e);
                    }

                }catch (NullPointerException e) {
                    System.out.println("Try Again, (1st catch) because Exception: " + e);
                }
                catch (ArithmeticException e) {
                    System.out.println("Try Again (2nd catch) because Exception: " + e);
                }
                catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Try Again (3rd catch) because Exception: " + e);
                }
                catch(Exception e){
                    System.out.println("Try Again (4rth catch) because Exception: " + e);
                }
                finally{
                    System.out.println("ThankYou for using our code");
                }

            }

        }
}
