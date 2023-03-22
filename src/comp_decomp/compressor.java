package comp_decomp;

import java.io.*;
import java.util.zip.GZIPOutputStream;

public class compressor {
    public  static void method(File file) throws IOException{
        String fileDirectory=file.getParent();

        FileInputStream fis=new FileInputStream(file);
        FileOutputStream fos=new FileOutputStream(fileDirectory="compressedFile");
        GZIPOutputStream gzip=new GZIPOutputStream(fos);

        byte[] buffer=new byte[1024];
        int len;
        while((len=fis.read(buffer))!=-1){
            gzip.write(buffer,0,len);
        }
        gzip.close();
        fos.close();
        fis.close();;

    }
    public static void main( String [] args) throws IOException{
        File path=new File("input.txt");
        method(path);

    }
}
