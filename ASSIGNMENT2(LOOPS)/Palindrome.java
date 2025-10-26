public class Palindrome {
    public static void main(String[] args) {
        for (int i = 1; i <=100; i++){
            int rev=0,temp=i;
            while(temp!=0){
                int rem=i%10;
                rev=rev*10+rem;
                temp=temp/10;
            }
            if(rev==i)
            System.out.print(i+" ");
        }
    }
}
