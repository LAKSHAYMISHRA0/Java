import java.io.*;
public class ToExtractSpace {
    public static void main(String[] args) {
        String str=new String();
        Console con=System.console();
        System.out.println("Enter The First String --> ");
        str=con.readLine();
        str=str.trim();
        boolean isspace=true;
        String result=new String();
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if (ch==' ') {
                if (!isspace) {
                result +=ch;
                isspace=true;
                }
            }else{
                result+=ch;
                isspace=false;
            }
            }
            System.out.println(result);
    }
        

}

