package File;

import java.io.BufferedReader;
import java.io.FileReader;

public class File6 {

    public static void main(String[] args) throws Exception {
        StringBuilder str= new StringBuilder("");
        FileReader fr = new FileReader("G:\\assignment\\lectureJAVADay\\src\\File\\test3.txt");
        BufferedReader br= new BufferedReader(fr);
        int i;
        while ((i=br.read())!= -1){
            //System.out.print((char)i);
            str.append((char)i);
        }
        System.out.println(str);

        br.close();
        fr.close();

        String s=str.toString();
        String[] c =s.split(" ");

        for(i=0; i<c.length; i++){
            System.out.println(c[i]);
        }

    }
}
