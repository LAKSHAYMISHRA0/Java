import java.io.Console;

public class StringLeftShift {
    public static void main(String[] args) {
        Console con=System.console();
        String str=new String();
        System.out.println("Enter The String--> ");
        str=con.readLine();
        String LeftShifted=new String();
        for (int i = 1; i < str.length(); i++) {
            LeftShifted+=str.charAt(i);
        }
        LeftShifted+=str.charAt(0);
        System.out.println("The String After Left Shift-->"+LeftShifted);
    }
}
