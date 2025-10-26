public class SuperPalindrome {
    public static void main(String[] args) {
        for (int i = 1; i <=100; i++){
            int rev=0,num=i*i,temp=num,rev2=0,temp2=i;
            while (temp2!=0) {
                int rem=temp2%10;
                rev2=rev2*10+rem;
                temp2/=10;
            }
            while(temp!=0){
            int rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
            }
            if(rev2==i && rev==num  ) {
                System.out.print(i+" ");
            }


        }
    }
}
    

