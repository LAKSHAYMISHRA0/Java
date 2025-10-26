import a.b.c.Employee;
public class Office {
    public static void main(String[] args) {
        Employee e1=new Employee();
        System.out.println("First person is -->");
        e1.show();
        System.out.println();
        Employee e2=new Employee("lakshay","mishra","9166000677",89000.78);
        System.out.println("Second person is --.");
        e2.show();
        Employee e3=new Employee(e2);
        System.out.println();
        e3.show();
    }
}
