package File;
import java.io.*;

public class File3 {
    public static void main(String[] args) {
        //FileInputStream class obtains the input bytes from a file. it is used for reading byte-oriented data such as image, audio, video etc.
        StringBuilder str= new StringBuilder("");
        try{
            FileInputStream fin= new FileInputStream("G:\\assignment\\lectureJAVADay\\src\\File\\test1.txt");
            BufferedInputStream bin= new BufferedInputStream(fin); //BufferedInputStream uses buffer mechanism to make the performance faster.
            int i;
            while((i=bin.read())!= -1){   //EOF
               // System.out.print((char)i);
                str.append((char)i);
            }
            bin.close();
            fin.close();
        }catch(Exception ex){
            System.out.println(ex);
        }
        //System.out.print(str);
        String s=str.toString();
        //System.out.print(s);
        String[] c = s.split(" ");
        for(int i=0; i<c.length; i++){
            System.out.println(c[i]);

        }



    }
}
