import java.io.*;
public class StringPalindrome {
    public static void main(String[] args) {
        String str=new String();
        Console con=System.console();
        System.out.println("Enter The First String --> ");
        str=con.readLine();
        boolean isPalindrome=true;
        int end=str.length()-1;
        for (int i = 0; i < end; i++) {
            if (str.charAt(i)!= str.charAt(end)) {
                isPalindrome=false;
                break;
            }
            end--;
        }
        if (isPalindrome) {
            System.out.println("THE STRING IS A PALINDROME !!");
        }else
        System.out.println("THE STRING IS NOT A PALINDROME !!");
    }
}
