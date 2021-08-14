package Socket;


import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer1 {
    public static void main(String[] args) {
        try {

            ServerSocket ss = new ServerSocket(6666);//0-1024  to 65535
            Socket s= ss.accept();
            DataInputStream dis = new DataInputStream(s.getInputStream());
            String str=(String)dis.readUTF();
            System.out.println("Message: "+str);
            ss.close();
        }catch(Exception e){System.out.println(e);}
    }
}
