
public class UseMoney {
    public static void main(String[] args) {
        Money m1=null;
        Money m2=null;
        try {
            m1=new Money(-20,30);
            m2=new Money(0,0);
            m2.set(-10, 10);
        } 
        catch(InvalidAmountException e1) {
            System.out.println(e1.getMessage());
        }
        // m1=new Money();
        // m2=new Money();
        System.out.println("First Amount is ");
        if (m1 != null) {
            m1.show();
        }
        System.out.println("Second Amount is ");
        if (m2 != null) {
            m2.show();
        }
        Money m3,m4,m5;
        if(m1 != null && m2!= null){
        m3=m1.add(m2);
        System.out.println("Sum Amount is ");
        m3.show();
        m4=m1.less(m2);
        System.out.println("Difference Amount ");
        m4.show();
        m5=m1.multipMoney(6);
        System.out.println("Multiplied Amount is ");
        m5.show();
        Money.showCount();
        }
    }
}
