public class HCF {
    public static void main(String[] args) {
        int a,b,temp=0;
        a=(int)(Math.random()*100);
        b=(int)(Math.random()*100);
        System.out.println("a="+a+" b="+b);
        while(b!=0) {
            temp=b;
            b=a%b;
            a=temp;
        }
        System.out.println("THE GREATEST COMMON DIVISOR IS-->"+a);
    }
}
