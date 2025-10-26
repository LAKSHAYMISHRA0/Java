public class UseRational {
    public static void main(String[] args) {
        Rational r1=null;
        Rational r3,r4,r5,r6;
        try {
            r1=new Rational(1,1);
        } 
        catch(InvalidDenominatorException e){
            System.out.println(e.getMessage());
        }
        if(r1 != null){
        System.out.println("THE FIRST NUMBER-->");
        r1.show();
        }
        Rational r2=new Rational();
        try {
            r2.set(1,1);
            if(r1 != null){
            r3=r1.add(r2);
            r4=r1.less(r2);
            r5=r1.multiply(r2);
            System.out.println("SECOND NUMBER-->");
            r2.show();
            System.out.println("Sum is-->");
            r3.show();
            System.out.println("The Difference is -->");
            r4.show();
            System.out.println("Multiply of Two rational number is -->");
            r5.show();
            System.out.println("Amount is -->"+r3.toString());
            }
        } 
        catch(InvalidDenominatorException e) 
        {
            System.out.println(e.getMessage());
        }
        if (r1==r2){
            System.out.println("Shallow");
        }
        if (r1.equals(r2)) {
            System.out.println("Deep");
        }
        r6=(Rational)r1.clone();
        System.out.println("the amount in r6 is "+r6.toString());
    }
}
