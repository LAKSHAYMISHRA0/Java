import java.io.*;
import java.util.*;

public class UseGenericStack {
    public static void main(String[] args) {
        Console con=System.console();
        MyStack<Integer> s=new MyStack<Integer>();
        System.out.println("Enter the 10 names -->");
        int number;
        for (int i = 0; i < 5; i++){
            number=Integer.parseInt(con.readLine());
            s.push(number);
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