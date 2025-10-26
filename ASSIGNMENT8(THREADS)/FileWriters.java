import java.io.*;
import java.util.*;
public class FileWriters implements Runnable {
    private String outputfile;
    private Vector<String> FileContent;
    private boolean isReading;
    public FileWriters(String output,Vector<String> content){
        outputfile=output;
        FileContent=content;
        isReading=false;
    }
    public void setReadingComplete(boolean readingComplete) {
        isReading= readingComplete;
    }
    public void run(){
        while (true) {
            String contentWritten=null;
            synchronized(FileContent){
                while (FileContent.isEmpty() && !isReading) {
                    try {
                        FileContent.wait();
                    } catch (InterruptedException e) {
                        System.out.println(e.getMessage());
                    }
                }
                if (FileContent.isEmpty() && isReading) {
                    break;
                }
                contentWritten=FileContent.remove(0);
            }
            
            try {
                BufferedWriter writer=new BufferedWriter(new FileWriter(outputfile,true));
                writer.write(contentWritten);
            } catch (IOException e) {
                System.out.println("Error in Writers file"+e.getMessage());
            }
        }
    }

}
