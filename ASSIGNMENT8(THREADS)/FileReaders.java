import java.io.*;
import java.util.*;
public class FileReaders implements Runnable
{
    private File file;
    private Vector<String> FileElements;
    public FileReaders(File f,Vector<String> content) {
        file=f;
        FileElements=content;
    }
    public void run(){
        try {
            BufferedReader reader=new BufferedReader(new FileReader(file));
            String content="";
            String line;
            while ((line=reader.readLine())!=null) {
                content+=line+"\n";
            }
            FileElements.add(content);
            FileElements.notify();
        } catch (IOException e) {
            System.out.println("error in Reading file"+e.getMessage());
        }
       
    }
}
