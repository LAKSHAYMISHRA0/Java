import java.util.*;
public class UsePerson {
    public static void main(String[] args) {
        HashMap map=new HashMap<>();
        Person p1=new Person("Raj", "sharma");
        map.put(p1, "22222");
        Person p2=new Person("Raj", "sharma");
        map.put(p2, "77777");
        System.out.println(map.size());

    }
}
