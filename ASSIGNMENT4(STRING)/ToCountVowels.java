import java.io.*;
public class ToCountVowels {
    public static void main(String[] args) {
        int vowelcount=0,count=0;
        Console con=System.console();
        String str=new String();
        System.out.println("Enter The String--> ");
        str=con.readLine();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)>='a' && str.charAt(i)<='z' || str.charAt(i)>='A' && str.charAt(i)<='Z')
            if (str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' ||str.charAt(i)=='u'|| str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' ||str.charAt(i)=='U' ) {
                vowelcount++;
            }
            else{
                count++;
            }

        }
        System.out.println("The vowels are -->"+vowelcount+" and consonents ->  "+count);
    }
}
