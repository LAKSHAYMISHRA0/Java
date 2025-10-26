import java.io.*;
import java.util.*;

public class UseMyStack {
    public static void main(String[] args) {
        Console con=System.console();
        MyStack<String> s=new MyStack<String>();
        System.out.println("Enter the 10 names -->");
        String name;
        for (int i = 0; i < 5; i++){
            name=con.readLine();
            s.push(name);
        }
        try {
            System.out.println("The Stack After Reverse -->");
            while (!s.empty()) {
                System.out.println(s.pop());
            }
            // s.push("name");
            
        } 
        catch (UnderFlowException e) {
            System.out.println(e.getMessage());
        }
        

        // if(s.empty())
        //     System.out.println(s.pop());

    }
}