import java.io.*;
public class FileSumMain {
    public static void main(String[] args) {
        if(args.length!=1){
            System.out.println("pls enter the Directory !!");
        }
        File directory=new File(args[0]);
        if (!directory.isDirectory()) {
            System.out.println("THE ENTERED DIRECTORY IS NOT FOUND  !!");
            System.exit(0);
        }
        File[] files=directory.listFiles();
        FileSum[] thread=new FileSum[files.length];
        int total=0;
        for (int i = 0; i < files.length; i++) {
            thread[i]=new FileSum(files[i]);
            thread[i].start();
        }
        for (FileSum threads: thread) {
            try{
                threads.join();
                total+=threads.sum();
            }catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Total:->"+total);
    }
}