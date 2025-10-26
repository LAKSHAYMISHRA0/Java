public class Armstrong {
    public static void main(String[] args) {
        
        for (int i = 100; i <=1000; i++) {
            int temp=i;
            int result=0;
            while (temp!=0) 
            {
                int rem=temp%10;
                result=result+rem*rem*rem;
                temp/=10;
                
            }
            if (result==i) {
                System.out.print(result+" ");
            }
            
        }
    }
}
