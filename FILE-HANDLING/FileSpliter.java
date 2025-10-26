import java.io.*;
public class FileSpliter 
{ 
    public static void main(String[] args)throws IOException
    { 
        Console con=System.console(); 
        System.out.println("Enter the File name-->"); 
        String name=con.readLine(); 
        System.out.println("Enter the destination file size-->"); 
        int size=Integer.parseInt(con.readLine()); 
        File i=new File(name); 
        if (!i.exists()) {
            System.out.println("File not found: " + name);
            System.exit(0);
        } 
        FileInputStream fis=new FileInputStream(i); 
        long Filesize=i.length(); 
        System.out.println("Original size of file -->"+Filesize+" bytes"); 
        byte[] arr=new byte[size];
        int part=1; int bytereader; 
        while ((bytereader=fis.read(arr))!=-1){ 
            String outputFileName="part"+part+"_"+name; 
            FileOutputStream fos=new FileOutputStream(outputFileName); 
            fos.write(arr, 0, bytereader); 
            fos.close(); 
            System.out.println("created file: "+outputFileName+" with size "+bytereader+" bytes"); 
            part++; 
        } 
        fis.close(); 
        // fis.delete();
        System.out.println("file is splited !!"); 
    }
}   