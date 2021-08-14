package File;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class File8 {
    public static void main(String[] args) throws Exception{
        FileWriter writer = new FileWriter("G:\\assignment\\lectureJAVADay\\src\\File\\new2.txt");
        writer.write("welcome to northern university bangladesh");
        writer.close();
        System.out.println("Successfully written!");
    }
}
