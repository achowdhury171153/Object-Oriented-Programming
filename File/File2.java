package File;
import java.io.FileReader;
public class File2 {
    //FileReader class is used to read the data from a file. It returns data in byte format.
    public static void main(String[] args) throws Exception{
        FileReader f=  new FileReader("G:\\assignment\\lectureJAVADay\\src\\File\\test1.txt");
        int i;
        while( (i=f.read())!= -1){
            System.out.print((char)i);

        }
        f.close();
    }
}
