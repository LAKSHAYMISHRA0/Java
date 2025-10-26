public class Parent {
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

