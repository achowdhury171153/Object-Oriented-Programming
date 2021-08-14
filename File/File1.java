package File;

import java.io.*;

public class File1 {
    public static void main(String args[]) throws IOException {
        StringBuilder str = new StringBuilder("");
        try{
            FileInputStream fin=new FileInputStream("G:\\assignment\\lectureJAVADay\\src\\File\\testout.txt");
            BufferedInputStream bin=new BufferedInputStream(fin);
            int i;

            while((i=bin.read())!=-1){
                System.out.print((char)i);
                str.append((char)i);
            }
            //System.out.print(str);
            bin.close();
            fin.close();
        }catch(Exception e){System.out.println(e);}
        System.out.println(str);

        //converting stringbuilder to string
        String s = str.toString();

        String[] currencies = s.split(" "); //split word by spaces
        for(int i=0; i<currencies.length;i++){
            System.out.println(currencies[i]);
        }



    }
}
