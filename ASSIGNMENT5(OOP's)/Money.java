class InvalidAmountException extends Exception{
    public InvalidAmountException(String s){
        super(s);
    }
}
public class Money {
    private int rs;
    private int paisa;
    private static int count=0;
    public Money(){
        rs=paisa=0;
        count++;
    }
    public Money(int r,int p)throws InvalidAmountException{
        if (r>=0 && p>=0) {
            rs=r;
            paisa=p;
        }else{
            throw new InvalidAmountException("Check the Amount Because The Amount can't be NEGATIVE !!");
        }
        // count++;
    }
    public Money(Money m){
        rs=m.rs;
        paisa=m.paisa;
        count++;
    }
    public static void showCount(){
        System.out.println("No. of objects :"+count);
    }
    public Money add(Money m){
        Money temp=new Money();
        temp.rs=rs+m.rs;
        temp.paisa=paisa+m.paisa;
        if (temp.paisa>=100) {
            temp.rs++;
            temp.paisa%=100;
        }
        return temp;
    }
    public Money less(Money m){
        Money temp=new Money();
        int no1,no2,no3;
        no1=rs*100+paisa;
        no2=m.rs*100+m.paisa;
        no3=no1-no2;
        temp.rs=no3/100;
        temp.paisa=no3%100;
        return temp;
    }
    public Money multipMoney(int no){
        Money temp=new Money();
        temp.rs=rs*no;
        temp.paisa=paisa*no;
        if (temp.paisa>=100) {
            temp.rs+=(temp.paisa/100);
            temp.paisa%=100;
        }
        return temp;
    }
    public void set(int r,int p)throws InvalidAmountException{
        if (r>=0 && p>=0) {
            rs=r;
            paisa=p;
        }else{
            InvalidAmountException e=new InvalidAmountException("Check the Amount Because The Amount can't be NEGATIVE !!");
            throw e;
        }
        
    }
    public void show(){
        System.out.print(rs+"."+paisa);
        System.out.println();
    }
}
