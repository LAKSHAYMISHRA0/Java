public class SumOfDigits {
    public static void main(String[] args) {
        int num,sum=0;
        num=(int)(Math.random()*100000);
        System.out.println("GENERATED NO.-->"+num);
        while (num!=0) {
            int rem=num%10;
            sum+=rem;
            num/=10;
        }
        System.out.println("THE SUM OF THE DIGITS ARE -->"+sum);
    }
}
