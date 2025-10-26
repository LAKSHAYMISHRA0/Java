import java.io.*;
public class Employee {
    private String name=new String();
    private int age;
    private String salary;
    public void read(){
        Console con=System.console();
        System.out.println("ENTER THE NAME-->");
        name=con.readLine();
        System.out.println("ENTER THE AGE-->");
        age=Integer.parseInt(con.readLine());
        System.out.println("ENTER THE SALARY-->");
        salary=con.readLine();
    }
    public void show(){
        System.out.println("NAME:- "+name+"\nAGE:- "+age+"\nSALARY:- "+salary);
    }
}
