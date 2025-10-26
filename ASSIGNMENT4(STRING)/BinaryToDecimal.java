import java.io.*;
public class BinaryToDecimal {
        public static void main(String[] args) {
        Console con=System.console();
        String num=new String();
        System.out.println("Enter the Number-->");
        num=con.readLine();
        int result=0;
        int j=0;
        for (int i = num.length()-1; i >=0 ; i--) {
            int no=num.charAt(i)-'0';
            result+=no*Math.pow(2,j);
            j++;
        }
        System.out.println("The Result is -->"+result);
    }
}

