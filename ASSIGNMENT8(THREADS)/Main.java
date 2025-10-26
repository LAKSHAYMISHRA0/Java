import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Console con=System.console();
        String input="C:\\Users\\A\\OneDrive\\Desktop\\lakshay\\java\\COACHING ASSIGNMENTS\\ASSIGNMENT8(THREADS)";
        System.out.println("ENTER THE OUTPUT FILE NAME -->");
        String output=con.readLine();
        Vector<String> FileContent=new Vector<>();
        File inputdirectory=new File(input);
        if (!inputdirectory.exists()) {
            System.out.println("INPUT DIRECTORY NOT FOUND !!");
            System.exit(0);
        }
        FileWriters writers=new FileWriters(output, FileContent);
        Thread write=new Thread(writers);
        write.start();

        List<Thread> readerThreads=new ArrayList<>();
        File[] files = inputdirectory.listFiles();
        if (files == null) {
        System.out.println("INPUT DIRECTORY IS EMPTY OR CANNOT BE ACCESSED!");
        System.exit(0);
        }
        for (File file : files) {
            if (file.isFile()) {
            Thread reader = new Thread(new FileReaders(file, FileContent));
            readerThreads.add(reader);
            reader.start();
            }
        }
        for (Thread reader:readerThreads) {
            try {
                reader.join();
            } catch (InterruptedException e){
                System.out.println(e.getMessage());
            }   
        }
        writers.setReadingComplete(true);
        try {
            write.join();
        } catch (Exception e) {
           System.out.println("error in writer joining"+e.getMessage());
        }
    }
}
