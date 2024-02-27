import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
//        InputStream in = null;
//        OutputStream out = null;
//        byte[]buffer = new byte[8*1024];
//        try{
//            in =new FileInputStream(new File("test.txt"));
//            buffer=new byte[in.available()];
//            in.read(buffer);
//            File file=new File("outputFile.tmp");
//            out=new FileOutputStream(file);
//            out.write(buffer);
//        }catch (FileNotFoundException e){
//            Logger.getLogger(File.class.getName()).log(Level.SEVERE,null,e);
//        }catch (FileNotFoundException e){
//            Logger.getLogger(File.class.getName()).log(Level.SEVERE,null,e);
//        }finally {
//            try{
//                in.close();
//                out.close();
//            }catch (IDException e){
//                Logger.getLogger(File.class.getName()).log(Level.SEVERE,null,e);
//            }
//        }
FileInputStream in=null;
FileOutputStream out=null;
    try{
    in=new FileInputStream(new File("tets.txt"));
    File file=new File("outFile3.txt");
    }catch (FileNotFoundException)
    }
}