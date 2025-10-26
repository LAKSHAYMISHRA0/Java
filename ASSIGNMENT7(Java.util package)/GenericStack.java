import java.util.*;
import java.io.*;
class UnderFlowException extends Exception{
    public UnderFlowException(String s){
        super(s);
    }
}
public class GenericStack<T> {
    private Vector <T> v=new Vector<T>(); // instance variable 
    public void push(T o){
        v.add(o);
        System.out.println("Pushed->"+o);
    }
    public boolean empty(){
        boolean result= v.isEmpty();
        return result;
    }
    public T pop() throws UnderFlowException{
        if (empty()){
            throw new UnderFlowException("The Stack is underflow !!");
        }
        T result=v.remove(v.size()-1);
        return result;
    }
}
