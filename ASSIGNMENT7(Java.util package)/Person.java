import java.util.*;
public class Person {
    private String name;
    private String surname;
    public Person(String n,String s){
        name=n;
        surname=s;
    }
    public int hashcode(){
        String str=name+surname;
        return str.hashCode();
    }
    public boolean equals(Object o){
        if (o==null) {
            return false;
        }
        Person p=(Person)o;
        if (name.equals(p.name) && surname.equals(p.surname)){
            return true;
        }
        else{
            return false;
        }
    }
}
