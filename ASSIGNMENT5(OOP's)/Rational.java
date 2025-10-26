class InvalidDenominatorException extends Exception{
    public InvalidDenominatorException(String s){
        super(s);
    }
}
public class Rational implements Cloneable {
    private int numerator;
    private int denominator;
    public String toString()
    {
        return numerator+"/"+denominator;

    }
    public boolean equals(Object o){
        if (o==null) {
            return false;
        }
        Rational r=(Rational)o;
        if (numerator==r.numerator && denominator==r.denominator) {
            return true;
        }
        else{
            return false;
        }
    }
    public Object clone(){
        Rational temp=new Rational();
        temp.numerator=numerator;
        temp.denominator=denominator;
        return temp;
    }
    public Rational(){  //default
        numerator=1;
        denominator=1;
    }
    public Rational(int n,int d)throws InvalidDenominatorException{  //parameterized
        if (d!=0) {
            numerator=n;
            denominator=d; 
        }else
        {
            throw new InvalidDenominatorException("Invalid denominator !!");
        }
    }
    public Rational(Rational r){//cpoy constructor
        numerator=r.numerator;
        denominator=r.denominator;
    }
    public Rational add(Rational r)throws InvalidDenominatorException
    {
        int num=numerator*r.denominator+r.numerator*denominator;
        int deno=denominator*r.denominator;
        Rational result=new Rational(num,deno);
        return result;
    }
    public Rational less(Rational r)throws InvalidDenominatorException{
        int num=numerator*r.denominator-r.numerator*denominator;
        int deno=denominator*r.denominator;
        Rational result=new Rational(num,deno);
        return result;
    }
    public Rational multiply(Rational r)throws InvalidDenominatorException{
        int num=numerator*r.numerator;
        int deno=denominator*r.denominator;
        Rational result=new Rational(num,deno);
        return result;
    }
    public void set(int num,int deno)throws InvalidDenominatorException{
        if(deno!=0) {
            numerator=num;
            denominator=deno;
        }else{
            throw new InvalidDenominatorException("Invalid denominator !!!");
        }
    }
    public void show(){
        System.out.println(numerator+"/"+denominator);
    }
   
}
