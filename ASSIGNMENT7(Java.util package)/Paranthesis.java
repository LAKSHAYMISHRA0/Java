import java.io.*;
import java.util.*;
public class Paranthesis {
    public static void main(String[] args) {
        Console con=System.console();
        String expression;
        Stack<Character> stk=new Stack<>();
        System.out.println("Enter the equation-->");
        expression=con.readLine();
        boolean valid=true;
        for(int i=0; i<expression.length();i++)
        {
            if (expression.charAt(i)=='(') {
                stk.push(expression.charAt(i));
            }
            else if (expression.charAt(i)==')') 
            {
                if (stk.empty()) {
                    System.out.println("left paranthesis is missing !!");
                    valid=false;
                    break;
                }
                stk.pop();
            }
        }
        if (!stk.empty())
        {
            System.out.println("right paranthesis is missing !!");
            valid=false;
        }
        else if(valid==true){
            System.out.println("it is a valid expression !!");
        }
        
    }
}
