package comp_decomp;
import java.io.*;
import java.util.zip.GZIPInputStream;
// import java.util.zip.GZIPOutputStream;

public class decompressor {
    // public class compressor {
        public static void method(File file) throws IOException{
            String fileDirectory=file.getParent();
    
          
            FileInputStream fis=new FileInputStream(file);
            GZIPInputStream gzip=new GZIPInputStream(fis);
            FileOutputStream fos=new FileOutputStream(fileDirectory="DecompressedFile");
            
            
            byte[] buffer=new byte[1024];
            int len;
            while((len=fis.read(buffer))!=-1){
                fos.write(buffer,0,len);
            }
            gzip.close();
            fos.close();
            fis.close();;
    
        }
        public static void main( String [] args) throws IOException{
            File path=new File("CompressedFile.gz");
            method(path);
    
        }
    // }
}
