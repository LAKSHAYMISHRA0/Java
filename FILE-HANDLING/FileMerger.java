import java.io.*;
public class FileMerger {
    public static void main(String[] args)throws IOException {
        Console con=System.console();
        String filename;
        System.out.println("Specify the file to be retrieved-->");
        filename=con.readLine();
        File directory=new File("C:\\Users\\A\\OneDrive\\Desktop\\new"); 
        if (!directory.exists()) {
            System.out.println("directory does not found or exists !!");
            System.exit(0);
        }
        else{
            File mergedfile=new File(directory,"aa"+filename);
            File files[]=directory.listFiles();// returns an array of file objects.
            if (files==null) 
            {
                System.exit(0);
            }
            FileOutputStream fos=new FileOutputStream(mergedfile,true);
            for (File cFile: files) 
            {
                if (cFile.isFile() && cFile.getName().endsWith(filename))
                {
                    System.out.println("merging "+cFile.getName());
                    FileInputStream fis=new FileInputStream(cFile);
                    byte arr[]=new byte[files.length];
                    int bytereader;
                    while((bytereader=fis.read(arr))>0) 
                    {
                        fos.write(arr,0,bytereader);
                    }
                    fis.close();
                    cFile.delete();    
                }
            }
            fos.close();
            System.out.println("File sucessfully merged !!");
        }
    }
}
