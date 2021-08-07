package exception;
//definition :" it can be a story
/*sample 1st input:
Enter first value: 10
Enter second value: 2

output for sample 1st input:
The ans is: 5
Thank you for staying with us.

sample 2nd input:
Enter first value: 10
Enter second value: 0

output for sample 2nd input:
This occurs an exception because exception: ////Arithmetic exception
Try again Sir.
Thank you for staying with us.
*/

import java.util.Scanner;

public class Handle4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        boolean flag=true;
        while(flag) {
            try {
                int x, y;
                System.out.println("Enter first value:");
                x = in.nextInt();
                System.out.println("Enter second value:");
                y = in.nextInt();
                //System.out.println("first: "+x +"second:" +y);
                int r = x / y;
                System.out.println("The ans is: " + r);
                flag=false;
            } catch (NumberFormatException e1) {
                System.out.println("This occurs an exception because exception: " + e1);
            }
            catch(NullPointerException e2){
                System.out.println("This occurs in 2nd Catch an exception because exception: " + e2);
            }
            catch(ArrayIndexOutOfBoundsException e3){
                System.out.println("This occurs in 3rd Catch an exception because exception: " + e3);
            }
            catch(Exception e4){
                System.out.println("This occurs in last Catch an exception because exception: " + e4);
            }
            finally {
                System.out.println("Try again Sir");
                System.out.println("Thank you for staying with us.");
            }
        }
    }
}
