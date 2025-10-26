import java.io.*;
public class DecimalTOBinary {
    public static void main(String[] args) {
        Console con=System.console();
        int num;
        System.out.println("Enter the Number-->");
        num=Integer.parseInt(con.readLine());
        String result=new String();
        while (num>0) {
            int rem=num%2;
            result = result+rem;
            num/=2;
        }
        System.out.println("The Result is -->"+result);
    }
}
