package a.b.c;
import a.b.ContactInfo;
public class Employee extends ContactInfo{
    protected double salary;
    public Employee(){
        salary=0;
    }
    public Employee(String n,String s,String p,double sal){
        super(n,s,p);
        salary=sal;
    }
    public Employee(Employee e){
        super(e);
        salary=e.salary;
    }
    public void show(){
        System.out.println("NAME->"+name+" "+surname);
        System.out.println("PHONE NO. ->"+phone);
        System.out.println("SALARY->"+salary);
    }
}
