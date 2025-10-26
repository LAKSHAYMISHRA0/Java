import java.io.*;
public class FileSum extends Thread{
    private File file;
    private int sum;
    public FileSum(File f){
        this.file=f;
    }
    public void run(){
        sum=0;
        try {
            BufferedReader reader=new BufferedReader(new FileReader(file));
            String line;
            while ((line=reader.readLine())!= null) {
                sum+=Integer.parseInt(line.trim());
            }
        } catch (IOException e) {
            System.out.println("IO exception in FileSum class "+e.getMessage());
        }
    }
    public int sum(){
        return sum;
    }  
}