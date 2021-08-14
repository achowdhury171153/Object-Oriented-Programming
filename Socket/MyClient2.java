package Socket;


import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;

import java.net.Socket;

public class MyClient2 {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 4444);
            DataInputStream din= new DataInputStream(s.getInputStream());
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

            String str=" ";
            String str2=" ";
            while(!str.equals("end")){
                System.out.println("Enter Your message: ");
                str=br.readLine();
                dout.writeUTF(str);
                dout.flush();
                str2=din.readUTF();
                System.out.println("Server Typing: " +str2);

            }
            dout.close();
            s.close();

        }catch(Exception e){}
    }
}
