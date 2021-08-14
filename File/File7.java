package File;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class File7 {
    public static void main(String[] args) throws Exception{
        FileWriter writer = new FileWriter("G:\\assignment\\lectureJAVADay\\src\\File\\new.txt");
        BufferedWriter bufferWriter = new BufferedWriter(writer);
        bufferWriter.write("welcome to northern university bangladesh");
        bufferWriter.close();
        System.out.println("Successfully written!");
    }
}
