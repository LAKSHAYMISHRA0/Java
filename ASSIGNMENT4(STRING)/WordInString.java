import java.io.*;
public class WordInString {
    public static void main(String[] args) {
        String str=new String();
        Console con=System.console();
        System.out.println("Enter The First String --> ");
        str=con.readLine();
        int count=str.length()-1;
        for (int i = 0; i < count; i++) {
            if (str.charAt(i)==' ') {
                count--;
            }
        }
        System.out.println("THE TOTAL WORDS ARE IN THE STRING ARE -> "+count);
    }
}
