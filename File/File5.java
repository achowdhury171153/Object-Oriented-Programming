package File;

import java.io.FileReader;

public class File5 {
    public static void main(String[] args) throws Exception {
        FileReader fr= new FileReader("G:\\assignment\\lectureJAVADay\\src\\File\\test3.txt");
        int i;
        while((i=fr.read())!= -1){//EOF = end of file
            System.out.print((char)i);
        }
    }
}
