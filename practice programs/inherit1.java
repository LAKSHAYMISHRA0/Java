class Parent {
    int b;
    
    public Parent(int x) {
        this(); // Calling the default constructor of Parent
        // b = x; // Commented out
        System.out.println("Hello From Parent: para1");
    }
    
    public Parent(int x, int y) {
        this(x); // Calling the single-parameter constructor of Parent
        System.out.println("Hello From Parent: para2");
    }
    
    public Parent() {
        System.out.println("Hello From Parent: default");
    }
    
    public void print() {
        System.out.println("How are you?");
    }
}
class Child extends Parent { // Inheritance
    int a;
    
    public Child(int x, int y) {
        super(x, y); // Calling the two-parameter constructor of Parent
        a = x;
        System.out.println("Hello From Child: Para2");
    }
    
    public Child(int x) {
        super(x); // Calling the single-parameter constructor of Parent
        System.out.println("Hello From Child: Para1");  
    }
    
    public Child() {
        this(10); // Calling the single-parameter constructor of Child
        System.out.println("Hello From Child: default");
    }
}
public class inherit1{
    public static void main(String[] args) {
        Child c1 = new Child(); // Calls the default constructor of Child
        Child c2 = new Child(10); // Calls the single-parameter constructor of Child
        Child c3 = new Child(10, 20); // Calls the two-parameter constructor of Child
    }
}
