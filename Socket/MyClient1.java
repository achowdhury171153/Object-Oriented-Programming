package Socket;

import java.io.DataOutputStream;
import java.net.Socket;

public class MyClient1 {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 6666);
            DataOutputStream dout= new DataOutputStream(s.getOutputStream());
            dout.writeUTF("HELLO Dhaka");
            dout.flush();
            dout.close();
            s.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
